package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton1.setImageResource(R.drawable.click_me);
        ImageView image1 = (ImageView) findViewById(R.id.imageView);
        image1.setImageResource(0);
        Random rand = new Random();

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randy = rand.nextInt((3 - 1) + 1) + 1;
                if (randy == 1) {
                    image1.setImageResource(R.drawable.one);
                    imageButton1.setImageResource(R.drawable.one);
                }
                if (randy == 2) {
                    image1.setImageResource(R.drawable.two);
                    imageButton1.setImageResource(R.drawable.two);
                }
                if (randy == 3) {
                    image1.setImageResource(R.drawable.three);
                    imageButton1.setImageResource(R.drawable.three);
                }
            }
            }
        );

    }

}