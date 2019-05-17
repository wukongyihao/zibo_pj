package com.example.xiaoming.xmapp;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    private EditText mobilenum;
    private Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button bn = (Button)findViewById(R.id.ok);
        mobilenum = (EditText)findViewById(R.id.mobile);
        bn = (Button)findViewById(R.id.ok);
        bn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                EditText cont = (EditText)findViewById(R.id.mobile);
//                String content = cont.getText().toString();
                final TextView show = (TextView)findViewById(R.id.show);
                show.setText("sdf" + new java.util.Date());
            }
        });
        Button but = (Button)findViewById(R.id.ok);
        but.setOnClickListener(new ButtonClickLidterner());

    }

    private final class ButtonClickLidterner implements View.OnClickListener{
//        @Override
        public void call() {

            String number = mobilenum.getText().toString();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.CALL");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("tel:"+number));
            startActivity(intent);

        }


        public void onClick(View v) {
            if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED) {
                //未授权，调用  ActivityCompat.requestPermissions()  方法，向用户申请授权
                //参数：1.Activity实例，2.申请的权限名数组，3.请求码，只要是唯一值即可
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.CALL_PHONE},
                        1);

            } else {
                //已授权，直接拨打电话
                call();
            }
        }
        }
    }

