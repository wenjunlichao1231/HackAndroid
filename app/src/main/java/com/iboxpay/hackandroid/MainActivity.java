package com.iboxpay.hackandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;

public class MainActivity extends Activity {

    private static final String TAG = "Hack";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, HackService.class);
        startService(intent);
        Log.w(TAG, "onCreate: Activity 启动劫持 Service");
        Log.w(TAG, "onCreate: Activity 启动劫持 Service");
        Log.w(TAG, "onCreate: Activity 启动劫持 Service");

    }
}
