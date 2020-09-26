package com.example.spedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;

public class SplashScreen extends AppCompatActivity {

    private GifImageView gifImageView;
    //MediaPlayer mysong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //mysong = MediaPlayer.create(SplashScreen.this, R.raw.yay);
        //mysong.start();

        gifImageView = (GifImageView)findViewById(R.id.gifImageView);

        try {
            InputStream inputStream = getAssets().open("spedgif.gif");
            byte [] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();

        }
        catch (IOException ignored){


        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this, MainActivity.class));
                SplashScreen.this.finish();
                //mysong.release();
            }
        },5000);
    }
}
