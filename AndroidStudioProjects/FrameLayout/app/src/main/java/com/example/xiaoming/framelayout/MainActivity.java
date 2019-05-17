package com.example.xiaoming.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.xiaoming.services.FileService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = this.findViewById(R.id.button);



        button.setOnClickListener(new ButtonClickListener());

    }
        private class ButtonClickListener implements View.OnClickListener{
            @Override
            public void onClick(View view) {
                final EditText filenameText = (EditText) findViewById(R.id.filename);
                final EditText filecontentText = (EditText)findViewById(R.id.filecontent);
                String filename = filenameText.getText().toString();
                String filecontent = filecontentText.getText().toString();
                FileService service = new FileService();
                try {
                    service.save(filename,filecontent);
                    Toast.makeText(getApplicationContext(),R.string.success,Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),R.string.defate,Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }


            }
        }


    }




