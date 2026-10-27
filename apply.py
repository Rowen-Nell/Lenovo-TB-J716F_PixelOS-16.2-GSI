from pathlib import Path
import json,subprocess,sys,hashlib,shutil
c=Path(__file__).resolve().parent;s=Path(sys.argv[1]).resolve();series=json.loads((c/'series.json').read_text());lock=json.loads((c/'source-lock.json').read_text())
for row in series:
 p=s/row['repo'];assert subprocess.check_output(['git','-C',str(p),'rev-parse','HEAD'],text=True).strip()==row['baseline'],p
 assert hashlib.sha256((c/row['patch']).read_bytes()).hexdigest()==row['sha256']
 subprocess.run(['git','-C',str(p),'apply','--check',str(c/row['patch'])],check=True)
for row in lock['files']:
 q=c/'sources'/row['path']
 if q.exists():assert not (s/row['path']).exists(),row['path']
for row in series:subprocess.run(['git','-C',str(s/row['repo']),'apply',str(c/row['patch'])],check=True)
for row in lock['files']:
 q=c/'sources'/row['path'];dest=s/row['path']
 if q.exists():dest.parent.mkdir(parents=True,exist_ok=True);shutil.copy2(q,dest)
 if row.get('mode') and dest.exists():dest.chmod(row['mode'])
 if row.get('sha256'):assert hashlib.sha256(dest.read_bytes()).hexdigest()==row['sha256'],row['path']
print('Exact final delta applied; source HDR default remains off. Read BUILD.md for the experimental build configuration.')
