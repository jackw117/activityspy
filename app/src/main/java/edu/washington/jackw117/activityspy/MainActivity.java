package edu.washington.jackw117.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String extra;
        if(savedInstanceState == null) {
            extra = "no previous instances";
        } else {
            extra = "recreating previous instance";
        }
        Log.i(TAG, "onCreate event fired, " + extra);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "We’re going down, Captain!");
    }
}
