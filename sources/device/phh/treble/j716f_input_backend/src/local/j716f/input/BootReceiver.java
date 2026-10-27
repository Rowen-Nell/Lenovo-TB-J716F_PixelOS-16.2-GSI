package local.j716f.input;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;

public final class BootReceiver extends BroadcastReceiver {
    @Override public void onReceive(Context context, Intent intent) {
        if (UserHandle.myUserId() == UserHandle.USER_SYSTEM && J716fInputService.isThisDevice()) {
            context.startServiceAsUser(new Intent(context, J716fInputService.class), UserHandle.SYSTEM);
        }
    }
}
