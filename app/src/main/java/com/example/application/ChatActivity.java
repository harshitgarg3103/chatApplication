package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
public class ChatActivity extends AppCompatActivity {


    List<MessageChatModel> messageChatModelList =  new ArrayList<>();
    RecyclerView recyclerView;
    MessageChatAdapter adapter ;

    EditText messageET;
    ImageView sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messageET = (EditText)findViewById(R.id.messageET);
        sendBtn = (ImageView) findViewById(R.id.sendBtn);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(ChatActivity.this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(manager);


        recyclerView.smoothScrollToPosition(messageChatModelList.size());
        adapter = new MessageChatAdapter(messageChatModelList, ChatActivity.this );
        recyclerView.setAdapter(adapter);


        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = messageET.getText().toString();

                MessageChatModel model = new MessageChatModel(
                        msg,
                        "10:00 PM",
                        0
                );
                messageChatModelList.add(model);
                recyclerView.smoothScrollToPosition(messageChatModelList.size());
                adapter.notifyDataSetChanged();
                messageET.setText("");


            }
        });

    }
}