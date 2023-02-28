package com.kevin.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        ImageView image4 = findViewById(R.id.image4);
        ImageView image5 = findViewById(R.id.image5);
        ImageView image6 = findViewById(R.id.image6);
        ImageView image7 = findViewById(R.id.image7);
        ImageView image8 = findViewById(R.id.image8);
        ImageView image9 = findViewById(R.id.image9);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image1.setImageResource(R.drawable.img_3);
                } else {
                    image1.setImageResource(R.drawable.img);
                }
                check++;
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image2.setImageResource(R.drawable.img_3);
                } else {
                    image2.setImageResource(R.drawable.img);
                }
                check++;
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image3.setImageResource(R.drawable.img_3);
                } else {
                    image3.setImageResource(R.drawable.img);
                }
                check++;
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image4.setImageResource(R.drawable.img_3);
                } else {
                    image4.setImageResource(R.drawable.img);
                }
                check++;
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image5.setImageResource(R.drawable.img_3);
                } else {
                    image5.setImageResource(R.drawable.img);
                }
                check++;
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image6.setImageResource(R.drawable.img_3);
                } else {
                    image6.setImageResource(R.drawable.img);
                }
                check++;
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image7.setImageResource(R.drawable.img_3);
                } else {
                    image7.setImageResource(R.drawable.img);
                }
                check++;
            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image8.setImageResource(R.drawable.img_3);
                } else {
                    image8.setImageResource(R.drawable.img);
                }
                check++;
            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check % 2 == 0) {
                    image9.setImageResource(R.drawable.img_3);
                } else {
                    image9.setImageResource(R.drawable.img);
                }
                check++;
            }
        });

    }
}