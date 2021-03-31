package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView testText = findViewById(R.id.textView);

        ImageButton backToHome = findViewById(R.id.home);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testText.setText("Home");
                testText.setTextColor(getResources().getColor(R.color.teal_200));
            }
        });


        ImageButton searchButton = findViewById(R.id.search);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testText.setText("What do you want to search");
                testText.setTextColor(getResources().getColor(R.color.red));
            }
        });

        ImageButton createPost = findViewById(R.id.createPost);
        createPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testText.setText("create a post :)");
                testText.setTextColor(getResources().getColor(R.color.purple_700));
               //createPost.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });





    }
}