package com.example.spedapp;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView mathlecturesCard, gamesCard, dictionaryCard, developersCard, languagelecturesCard, schoolsCard;
    VideoView  videoBG;
    MediaPlayer mMediaPlayer, backgroundsong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining the cards
        mathlecturesCard = (CardView) findViewById(R.id.mathlectures_card);
        gamesCard = (CardView) findViewById(R.id.games_card);
        dictionaryCard = (CardView) findViewById(R.id.dictionary_card);
        developersCard = (CardView) findViewById(R.id.developers_card);
        languagelecturesCard = (CardView) findViewById(R.id.languagelectures_card);
        schoolsCard = (CardView) findViewById(R.id.schools_card);
        // Add Click Listener to the cards
        mathlecturesCard.setOnClickListener(this);
        gamesCard.setOnClickListener(this);
        dictionaryCard.setOnClickListener(this);
        developersCard.setOnClickListener(this);
        languagelecturesCard.setOnClickListener(this);
        schoolsCard.setOnClickListener(this);

        final ImageView backgroundOne = (ImageView) findViewById(R.id.background_one);
        final ImageView backgroundTwo = (ImageView) findViewById(R.id.background_two);

        final ValueAnimator animator = ValueAnimator.ofFloat(1.0f, 0.0f);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setInterpolator(new LinearInterpolator());
        animator.setDuration(10000L);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                final float progress = (float) animation.getAnimatedValue();
                final float width = backgroundOne.getWidth();
                final float translationX = width * progress;
                backgroundOne.setTranslationX(translationX);
                backgroundTwo.setTranslationX(translationX - width);
            }

        });
        animator.start();


        backgroundsong = MediaPlayer.create(MainActivity.this, R.raw.twinklefunny);
        backgroundsong.setLooping(true);
        backgroundsong.start();
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.mathlectures_card : i = new Intent(this,Mathematics.class); startActivity(i); break;
            case R.id.games_card: i = new Intent(this,Games.class); startActivity(i); break;
            //dictonary class = recreactional videos
            case R.id.dictionary_card : i = new Intent(this,OtherVideos.class); startActivity(i); break;
            case R.id.languagelectures_card : i = new Intent(this,Language.class); startActivity(i); break;
            case R.id.developers_card : i = new Intent(this,Developers.class); startActivity(i); break;
            case R.id.schools_card : i = new Intent(this,Schools.class); startActivity(i); break;



            default:break;
        }

    }
    @Override
    protected void onPause() {
        super.onPause();
        backgroundsong.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        backgroundsong.start();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mMediaPlayer.release();
        backgroundsong.release();
    }

}