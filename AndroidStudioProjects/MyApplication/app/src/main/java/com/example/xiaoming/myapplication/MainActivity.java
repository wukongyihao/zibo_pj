package com.example.xiaoming.myapplication;

import android.content.ContentResolver;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Gravity;
import android.widget.Toast;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
//    DynamicReceiver dynamicReceiver;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }




    String msg = "Android : ";

    /** 当活动第一次被创建时调用 */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");
    }

    /** 当活动即将可见时调用 */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /** 当活动可见时调用 */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    /** 当其他活动获得焦点时调用 */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    /** 当活动不再可见时调用 */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    /** 当活动将被销毁时调用 */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
}






//
//    //静态广播点击
//    public void send(View v) {
//        Intent intent = new Intent();
//        intent.setAction("MLY");
//        intent.putExtra("info", "panhouye");
//        sendBroadcast(intent);
//    int size = 30;
//    public void bigger(View v){
//        TextView txv;
//        txv = (TextView) findViewById(R.id.txv);
//        txv.setTextSize(++size);
//    }

//    public void display(View v) {
//        EditText name = (EditText) findViewById(R.id.name);
//        TextView text2 = (TextView) findViewById(R.id.txv);
//
//        text2.setText(name.getText().toString());
//    }





//    private List<Map<String,String>> list=new ArrayList<Map<String,String>>();
//    private Uri SMS_INBOX = Uri.parse("content://sms/");
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        getSmsFromPhone();
//        for(Map map:list){
//            Log.i(map.get("num").toString(),map.get("mess").toString());
//        }
//    }
//    public void getSmsFromPhone() {
//        ContentResolver cr = getContentResolver();
//        String[] projection = new String[] {"_id", "address", "person","body", "date", "type" };
//        Cursor cur = cr.query(SMS_INBOX, projection, null, null, "date desc");
//        if (null == cur) {
//            Log.i("ooc","************cur == null");
//            return;
//        }
//        while(cur.moveToNext()) {
//            String number = cur.getString(cur.getColumnIndex("address"));//手机号
//            String name = cur.getString(cur.getColumnIndex("person"));//联系人姓名列表
//            String body = cur.getString(cur.getColumnIndex("body"));//短信内容
//            //至此就获得了短信的相关的内容, 以下是把短信加入map中，构建listview,非必要。
//            Map<String,String> map = new HashMap<String,String>();
//            map.put("num",number);
//            map.put("mess",body);
//            list.add(map);
//        }
//    }









