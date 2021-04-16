package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class CreatePostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
        //connect XML views
        ImageButton environment = findViewById(R.id.category_environment);
        ImageButton crafting = findViewById(R.id.category_crafting);
        ImageButton fundraiser = findViewById(R.id.category_fundraisers);
        ImageButton cleaning = findViewById(R.id.category_cleaning);
        ImageButton sports = findViewById(R.id.categories_sports);
        ImageButton recycling = findViewById(R.id.categories_recycling);




        //set up button functions
        environment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set to be clicked
                environment.setImageResource(R.drawable.category_environment_clicked);
                //set the others to be unclicked

                crafting.setImageResource(R.drawable.category_crafting);
                fundraiser.setImageResource(R.drawable.category_fundraisers);
                cleaning.setImageResource(R.drawable.category_cleaning);
                sports.setImageResource(R.drawable.category_sports);
                recycling.setImageResource(R.drawable.category_recycling);

            }
        });



        crafting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crafting.setImageResource(R.drawable.category_crafting_clicked);
                //set the others to be unclicked
                environment.setImageResource(R.drawable.category_environment);
                fundraiser.setImageResource(R.drawable.category_fundraisers);
                cleaning.setImageResource(R.drawable.category_cleaning);
                sports.setImageResource(R.drawable.category_sports);
                recycling.setImageResource(R.drawable.category_recycling);
            }
        });



        fundraiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fundraiser.setImageResource(R.drawable.category_fundraisers_clicked);
                //set the others to be unclicked
                environment.setImageResource(R.drawable.category_environment);
                crafting.setImageResource(R.drawable.category_crafting);
                cleaning.setImageResource(R.drawable.category_cleaning);
                sports.setImageResource(R.drawable.category_sports);
                recycling.setImageResource(R.drawable.category_recycling);
            }
        });



        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleaning.setImageResource(R.drawable.category_cleaning_clicked);
                //set the others to be unclicked
                environment.setImageResource(R.drawable.category_environment);
                crafting.setImageResource(R.drawable.category_crafting);
                fundraiser.setImageResource(R.drawable.category_fundraisers);
                sports.setImageResource(R.drawable.category_sports);
                recycling.setImageResource(R.drawable.category_recycling);
            }
        });



        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sports.setImageResource(R.drawable.category_sports_clicked);
                //set the others to be unclicked
                environment.setImageResource(R.drawable.category_environment);
                crafting.setImageResource(R.drawable.category_crafting);
                fundraiser.setImageResource(R.drawable.category_fundraisers);
                cleaning.setImageResource(R.drawable.category_cleaning);
                recycling.setImageResource(R.drawable.category_recycling);
            }
        });



        recycling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recycling.setImageResource(R.drawable.category_recycling_clicked);
                //set the others to be unclicked
                environment.setImageResource(R.drawable.category_environment);
                crafting.setImageResource(R.drawable.category_crafting);
                fundraiser.setImageResource(R.drawable.category_fundraisers);
                cleaning.setImageResource(R.drawable.category_cleaning);
                sports.setImageResource(R.drawable.category_sports);


            }
        });









    }


}