package com.example.messagetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Msg> msglist = new ArrayList<>();
    private EditText inputText;
    private Button send;
    private RecyclerView msgRecyclerView;
    private MsgAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMsgs();
        inputText = (EditText)findViewById(R.id.input_text);
        send = (Button)findViewById(R.id.send);
        msgRecyclerView = (RecyclerView)findViewById(R.id.msg_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        adapter = new MsgAdapter(msglist);
        msgRecyclerView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = inputText.getText().toString();
                if (!"".equals(content)){
                    Msg msg = new Msg(content,Msg.TYPE_SEND);
                    msglist.add(msg);
                    adapter.notifyItemInserted(msglist.size());
                    msgRecyclerView.scrollToPosition(msglist.size()-1);
                    inputText.setText("");
                }
            }
        });


    }
        private void initMsgs(){
            Msg msg1 = new Msg("wakakaaaaaaaaaaaaaaaaaaaaaaaaaaaa",Msg.TYPE_RECEIVED);
            msglist.add(msg1);
            Msg msg2 = new Msg("ohohooooooooooooooooooooooooooooooooo",Msg.TYPE_SEND);
            msglist.add(msg2);
            Msg msg3 = new Msg("wakakakakakabbbbbbbbbbbbbbbbbbbbbbbbbbbbb",Msg.TYPE_RECEIVED);
            msglist.add(msg3);
        }
}
