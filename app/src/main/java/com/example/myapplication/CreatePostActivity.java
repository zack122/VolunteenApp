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

        TextView stepOneTextView = findViewById(R.id.stepOneText);
        TextView stepTwoTextView = findViewById(R.id.stepTwoText);
        TextView stepThreeTextView = findViewById(R.id.stepThreeText);
        TextView stepFourTextView = findViewById(R.id.stepFourText);
        TextView stepFiveTextView = findViewById(R.id.stepFiveText);
        TextView stepSixTextView = findViewById(R.id.stepSixText);
        TextView stepSevenTextView = findViewById(R.id.stepSevenText);


        TextPaint paint = stepOneTextView.getPaint();
        float width = paint.measureText("Create Opportunity");

        Shader textshader = new LinearGradient(0,0, 0, 90 ,
                new int[]{
                        Color.parseColor("#0062F4"),
                        Color.parseColor("#327A26"),
                }, null, Shader.TileMode.CLAMP);
        stepOneTextView.getPaint().setShader(textshader);
        stepTwoTextView.getPaint().setShader(textshader);
        stepThreeTextView.getPaint().setShader(textshader);
        stepFourTextView.getPaint().setShader(textshader);
        stepFiveTextView.getPaint().setShader(textshader);
        stepSixTextView.getPaint().setShader(textshader);
        stepSevenTextView.getPaint().setShader(textshader);








    }


}