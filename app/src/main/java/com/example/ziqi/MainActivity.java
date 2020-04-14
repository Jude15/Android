package com.example.ziqi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * ComponentName( 参数1,参数2);
         * 参数1  ---app 的包名。
         * 参2  ---  自定义广播所在路径。
         *  谷歌在8.0后为了提高效率，删除了静态注册，防止关闭App后广播还在，
         *  造成内存泄漏， 现在静态注册的广播需要指定包名。
         */

        Intent intent = new Intent("com.example.ziqi.BootCompleteReceiver");
        ComponentName componentName  = new ComponentName(this,"com.example.ziqi.BootCompleteReceiver");
        intent.setComponent(componentName);
        sendBroadcast(intent);
    }
}
