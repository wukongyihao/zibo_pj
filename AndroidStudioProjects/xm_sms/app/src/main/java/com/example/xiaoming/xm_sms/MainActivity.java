package com.example.xiaoming.xm_sms;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText numText;
    private EditText contentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numText = (EditText) this.findViewById(R.id.num);
        contentText = (EditText) this.findViewById(R.id.content);
        Button bn = (Button) this.findViewById(R.id.button);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.SEND_SMS)
                        != PackageManager.PERMISSION_GRANTED) {
                    //未授权，调用  ActivityCompat.requestPermissions()  方法，向用户申请授权
                    //参数：1.Activity实例，2.申请的权限名数组，3.请求码，只要是唯一值即可
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.SEND_SMS}, 1);
                } else {
                    //已授权，直接拨打电话
                    send();
                }
            }
        });
    }

    private void send() {
        String num = numText.getText().toString();
        String content = contentText.getText().toString();
        SmsManager manager = SmsManager.getDefault();
        ArrayList<String> texts = manager.divideMessage(content);
        for (String text : texts) {
            manager.sendTextMessage(num, null, text, null, null);
        }
        Toast.makeText(MainActivity.this, R.string.success, Toast.LENGTH_LONG).show();
    }
}




