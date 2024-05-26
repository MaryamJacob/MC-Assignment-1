package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        AnonyChat();

    }

    private void AnonyChat()
    {
        Button anonymous_chat_button= (Button) findViewById(R.id.anonymous_chat_button);
        anonymous_chat_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(activity_mainpage.this,user_chatwindow.class));
            }
        });


    }

}