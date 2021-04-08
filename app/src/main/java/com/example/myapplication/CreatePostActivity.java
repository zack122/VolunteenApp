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

        TextView createOpportunityTextView = findViewById(R.id.createOpportunityTextView);

        TextPaint paint = createOpportunityTextView.getPaint();
        float width = paint.measureText("Create Opportunity");

        Shader textshader = new LinearGradient(0,0, 0, createOpportunityTextView.getTextSize()*2 ,
                new int[]{
                        Color.parseColor("#0062F4"),
                        Color.parseColor("#327A26"),
                }, null, Shader.TileMode.CLAMP);
        createOpportunityTextView.getPaint().setShader(textshader);





    }


}