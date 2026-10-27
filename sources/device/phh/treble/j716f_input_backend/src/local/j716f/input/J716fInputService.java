package local.j716f.input;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.os.UserHandle;
import android.util.Log;

/** J716F-only magnetic-cover adapter; double-tap is owned by InputSettingsObserver; no settings UI or binder API. */
public final class J716fInputService extends Service implements SensorEventListener {
    private static final String TAG = "J716fInput";
    private static final String[] HALL_NAMES = {
        "ah1902 Hall Effect Sensor Wakeup", "bu52053nvx Hall Effect Sensor Wakeup",
        "mmc56x3x Hall Effect Sensor Wakeup", "qmc6308 Hall Effect Sensor Wakeup",
        "qmc630x Hall Effect Sensor Wakeup"
    };
    private HandlerThread mThread;
    private Handler mHandler;
    private SensorManager mSensors;
    private PowerManager mPower;

    public static boolean isThisDevice() {
        return "p11_pro_plus".equals(SystemProperties.get("ro.product.vendor.device"));
    }

    @Override public void onCreate() {
        super.onCreate();
        if (!isThisDevice() || UserHandle.myUserId() != UserHandle.USER_SYSTEM) {
            stopSelf();
            return;
        }
        mThread = new HandlerThread("J716fInput");
        mThread.start();
        mHandler = new Handler(mThread.getLooper());
        mPower = getSystemService(PowerManager.class);
        mSensors = getSystemService(SensorManager.class);
        mHandler.post(this::registerHall);
    }

    private void registerHall() {
        for (Sensor sensor : mSensors.getSensorList(Sensor.TYPE_ALL)) {
            for (String name : HALL_NAMES) {
                if (sensor.getName().contains(name)) {
                    if (!mSensors.registerListener(this, sensor, 1_000_000, mHandler)) {
                        Log.e(TAG, "Could not register the magnetic-cover sensor");
                    }
                    return;
                }
            }
        }
        Log.w(TAG, "No matching magnetic-cover sensor");
    }

    @Override public void onSensorChanged(SensorEvent event) {
        // Preserve the existing Lenovo mapping and PowerManager operations exactly.
        if (event.values[0] == 1.0f) {
            mPower.wakeUp(SystemClock.uptimeMillis());
        } else if (event.values[0] == 0.0f) {
            mPower.goToSleep(SystemClock.uptimeMillis());
        }
    }
    @Override public void onAccuracyChanged(Sensor sensor, int accuracy) { }
    @Override public IBinder onBind(Intent intent) { return null; }
    @Override public int onStartCommand(Intent intent, int flags, int startId) {
        return isThisDevice() && UserHandle.myUserId() == UserHandle.USER_SYSTEM
                ? START_STICKY : START_NOT_STICKY;
    }
    @Override public void onDestroy() {
        if (mThread != null) mHandler.post(() -> {
            mSensors.unregisterListener(this);
            mThread.quitSafely();
        });
        super.onDestroy();
    }
}
