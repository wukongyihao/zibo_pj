package com.example.xiaoming.liveactivity;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DialogTitle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final  String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"oncreat");
        if(savedInstanceState != null){
            String tempdata = savedInstanceState.getString("data_key");
            Log.d(TAG,tempdata);
        }
        setContentView(R.layout.activity_main);
        Button bt_normal = (Button)findViewById(R.id.start_normal_activity);
        Button bt_dialog = (Button)findViewById(R.id.start_dialog_activity);
        bt_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });

        bt_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempdata = "this is what you just typed";
        outState.putString("data_ket",tempdata);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"111111onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"111111onresue");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"111111onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"111111onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"111111ondestory");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"111111onrestart");
    }
}
