package com.example.brodecasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context,"receive in mybroadcast",Toast.LENGTH_LONG).show();
        abortBroadcast();
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}
