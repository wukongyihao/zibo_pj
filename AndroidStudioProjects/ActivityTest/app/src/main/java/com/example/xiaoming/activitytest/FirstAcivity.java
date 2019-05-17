package com.example.xiaoming.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstAcivity extends BaseActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FirstAvtivity1","onrestart111111");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
            case R.id.remove_item:
                Toast.makeText(this, "remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("return_data");
                    Log.d("FirstActivity",returnedData);
                }
                break;
            default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("FirtActivity","task id is "+getTaskId()+"111111");
        setContentView(R.layout.first_layout);
        Button bt = this.findViewById(R.id.Button_1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstAcivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });



    }


}
