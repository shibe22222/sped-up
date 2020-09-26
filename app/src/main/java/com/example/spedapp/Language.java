package com.example.spedapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Language extends AppCompatActivity {
    MediaPlayer mysong;
    ListView listView;
    String mTitle[] = {"English Alphabet Song", "The English Alphabet Letters", "The English Alphabet Letters", "The English Alphabet Letters", "Objects", "The Filipino Alphabet", "The Filipino Alphabet", "The Filipino Alphabet", "Colors", "Direction", "Same and Different", "Size"};
    String mDescription[] ={"Educational Song", "Letters A to I", "Letters J to R", "Letters S to Z", "Objects from A to Z", "Mula titik A hanggang I", "Mula titik J hanggang P", "Mula titik Q hanggang Z", "Primary Colors", "Left and Right", "What differs between objects?", "Small or Big?"};
    int images[] = {R.drawable.logonew, R.drawable.abc, R.drawable.abc, R.drawable.abc, R.drawable.objects, R.drawable.abc, R.drawable.abc, R.drawable.abc, R.drawable.colors, R.drawable.direction, R.drawable.logonew, R.drawable.logonew};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        mysong = MediaPlayer.create(Language.this, R.raw.lessonstart);
        mysong.start();

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), LangAlphabetsongVideo.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(), LangAlphabetAi.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(getApplicationContext(), LangAlphabetJr.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(getApplicationContext(), LangAlphabetAz.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(getApplicationContext(), LangObjectsVideo.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(getApplicationContext(), LangFilAlphaAi.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(getApplicationContext(), LangFilAlphaJp.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(getApplicationContext(), LangFilAlphaQz.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(getApplicationContext(), LangColors.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), LangLeftrightVideo.class);
                    startActivity(intent);
                }
                if (position == 10){
                    Intent intent = new Intent(getApplicationContext(), LangSameDiff.class);
                    startActivity(intent);
                }
                if (position == 11){
                    Intent intent = new Intent(getApplicationContext(), LangSizeVideo.class);
                    startActivity(intent);
                }

            }
        });
    }


    class MyAdapter extends ArrayAdapter<String>
    {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        MyAdapter (Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image1);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            //
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }

    }


}

