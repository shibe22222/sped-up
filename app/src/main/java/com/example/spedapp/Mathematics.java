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

public class Mathematics extends AppCompatActivity {
    MediaPlayer mysong;
    ListView listView;
    String mTitle[] = {"Primary Colors", "Secondary Colors","The Colors of the Rainbow","The Basic Shapes", "Advanced Shapes", "The Spatial Concepts", "The Spatial Concepts: Above and Under", "The Spatial Concepts: Inside and Out", "Days of a week", "Numbers"};
    String mDescription[] ={"Colors Blue, Red and Yellow", "Colors Green, Orange and Purple", "Rainbow!", "Circle, Rectangle, Square and Triangle", "Crescent, Heart and Star", "Educational Video", "Educational Video", "Educational Video", "Sunday to Saturday", "Counting one to ten"};
    int images[] = {R.drawable.colors, R.drawable.colors, R.drawable.rainbow,R.drawable.shapes, R.drawable.shapes, R.drawable.logonew, R.drawable.logonew, R.drawable.logonew, R.drawable.days, R.drawable.numbers,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);
        mysong = MediaPlayer.create(Mathematics.this, R.raw.lessonstart);
        mysong.start();

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), MathPrimaryVideo.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(), MathSecondaryColors.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(getApplicationContext(), MathSecondaryVideo.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(getApplicationContext(), MathBasicshapesVideo.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(getApplicationContext(), MathAdvancedShapes.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(getApplicationContext(), MathSpatialVideo.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(getApplicationContext(), MathSpatialAboveBelow.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(getApplicationContext(), MathSpatialInOut.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(getApplicationContext(), MathDays.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(getApplicationContext(), MathNumbers.class);
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
