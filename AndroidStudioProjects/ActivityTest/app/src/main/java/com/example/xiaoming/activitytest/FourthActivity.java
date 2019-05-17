package com.example.xiaoming.activitytest;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Button bt = (Button) findViewById(R.id.button_4);
        final ImageView img01 = (ImageView) findViewById(R.id.img01);
//        final ImageView img02 = (ImageView)findViewById(R.id.img02);
        final ProgressBar progressbar = (ProgressBar) findViewById(R.id.progressbar);
        final EditText edittext = (EditText) findViewById(R.id.edit_text);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FourthActivity.this,ThirdActivity.class);
                startActivity(intent);
//                switch (view.getId()) {
//                    case R.id.button_4:
//                        AlertDialog.Builder dialog = new AlertDialog.Builder(FourthActivity.this);
//                        dialog.setTitle("tishikaung");
//                        dialog.setMessage("neitrong");
//                        dialog.setCancelable(false);
//                        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//
//                            }
//                        });
//                        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//
//                            }
//                        });
//                        dialog.show();
//                        break;
//                    default:
//                        break;
//                }
//                switch (view.getId()) {
//                    case R.id.button_4:
//                        ProgressDialog progressDialog = new ProgressDialog(FourthActivity.this);
//                        progressDialog.setTitle("zhuanquanbiati");
//                        progressDialog.setMessage("zhuanquanneirong");
//                        progressDialog.setCancelable(true);
//                        progressDialog.show();
//                        break;
//                    default:
//                        break;
//                }
            }
        });

        img01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img01.setImageResource(R.drawable.img2);
            }
        });

//        img02.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                img02.setImageResource(R.drawable.img1);
//            }
//        });


    }


}
