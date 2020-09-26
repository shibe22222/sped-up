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

public class OtherVideos extends AppCompatActivity {
    MediaPlayer mysong;
    ListView listView;
    String mTitle[] = {"Body Parts", "Matching", "On and Off", "Washing your Hands!", "Vegetables!", "Fruits!", "Animals!", "Smallest to Biggest"};
    String mDescription[] ={"The main parts of our body!", "Interactive Lesson: Match the objects", "Conserve electricity!", "Keep those germs away!", "Keep it healthy", "Yum!", "Moo~", "Line up!"};
    int images[] = {R.drawable.logonew, R.drawable.logonew, R.drawable.logonew, R.drawable.logonew, R.drawable.logonew, R.drawable.logonew, R.drawable.logonew, R.drawable.logonew};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        mysong = MediaPlayer.create(OtherVideos.this, R.raw.lessonstart);
        mysong.start();

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), OtherBodyParts.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(), OtherMatching.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(getApplicationContext(), OtherOnOff.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(getApplicationContext(), OtherWashing.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(getApplicationContext(), OtherVegetables.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(getApplicationContext(), OtherFruits.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(getApplicationContext(), OtherAnimals.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(getApplicationContext(), OtherSmallesttoBiggest.class);
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

