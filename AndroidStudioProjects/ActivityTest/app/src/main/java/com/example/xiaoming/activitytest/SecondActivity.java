package com.example.xiaoming.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity","task id is"+getTaskId()+"111111");
        setContentView(R.layout.activity_second);

        //接收上一个活动传来的信息
//        Intent intent = getIntent();
//        String data1 = intent.getStringExtra("extra_data");
//        Log.d("SecondActivity",data1);

        //活动结束时，给上一个活动返回信息
        Button bt = (Button)findViewById(R.id.button_2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","ondestory111111");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("return_data","this is data after prass back");
        setResult(RESULT_OK,intent);
        finish();
    }
}
