package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView testText = findViewById(R.id.textView);

        ImageButton searchButton = findViewById(R.id.search);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testText.setText("What do you want to search");
                testText.setTextColor(getResources().getColor(R.color.red));
            }
        });

        ImageButton createPostButton = findViewById(R.id.createPost);
        createPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testText.setText("create a post :)");
                testText.setTextColor(getResources().getColor(R.color.purple_700));
                CreatePost();

            }
        });




    }



    private void CreatePost(){
        Intent intent = new Intent(this, CreatePostActivity.class);

        startActivity(intent);


        ImageButton switchToMapView = findViewById(R.id.mapButton);
        switchToMapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SwitchActivities();

            }
        });

    }

    private void SwitchActivities(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}