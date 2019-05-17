package com.example.xiaoming.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ThirdActivity","task id is "+getTaskId()+"111111");
        setContentView(R.layout.activity_third);
        Button bt = (Button)findViewById(R.id.Button_3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ActivityCollector.finishAll();
                Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(intent);

            }
        });



    }
}
