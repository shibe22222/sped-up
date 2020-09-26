package com.example.spedapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GamesColors extends AppCompatActivity {
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_colors);
        mysong = MediaPlayer.create(GamesColors.this, R.raw.colorstart);
        mysong.start();

        ImageButton click1= (ImageButton) findViewById(R.id.button1);
        ImageButton click2= (ImageButton) findViewById(R.id.button2);
        ImageButton click3= (ImageButton) findViewById(R.id.button3);
        ImageButton click4= (ImageButton) findViewById(R.id.button4);
        ImageButton click5= (ImageButton) findViewById(R.id.button5);
        ImageButton click6= (ImageButton) findViewById(R.id.button6);



        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.red);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.orange);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.yellow);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.green);
        final MediaPlayer mp5=MediaPlayer.create(getApplicationContext(), R.raw.blue);
        final MediaPlayer mp6=MediaPlayer.create(getApplicationContext(), R.raw.purple);

        View.OnClickListener elem = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.button1:
                        mp1.start();
                        Toast.makeText(GamesColors.this, "Red", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button2:
                        mp2.start();
                        Toast.makeText(GamesColors.this, "Orange", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button3:
                        mp3.start();
                        Toast.makeText(GamesColors.this, "Yellow", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button4:
                        mp4.start();
                        Toast.makeText(GamesColors.this, "Green", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button5:
                        mp5.start();
                        Toast.makeText(GamesColors.this, "Blue", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button6:
                        mp6.start();
                        Toast.makeText(GamesColors.this, "Purple", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
        click1.setOnClickListener(elem);
        click2.setOnClickListener(elem);
        click3.setOnClickListener(elem);
        click4.setOnClickListener(elem);
        click5.setOnClickListener(elem);
        click6.setOnClickListener(elem);
    }
    }
