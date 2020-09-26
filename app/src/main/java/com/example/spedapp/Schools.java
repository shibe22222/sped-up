package com.example.spedapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Schools extends AppCompatActivity implements Adapter.OnNoteListener {

    private List<item> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mData = new ArrayList<>();
        mData.add(new item(R.drawable.balagtas, "Balagtas Central School"));            //0
        mData.add(new item(R.drawable.baliuag, "Baliuag North Elementary School"));     //1
        mData.add(new item(R.drawable.calumpit, "Calumpit Central School"));            //2
        mData.add(new item(R.drawable.malolos, "Malolos Central School"));              //3
        mData.add(new item(R.drawable.marilao, "Marilao Central School"));              //4
        mData.add(new item(R.drawable.obando, "Obando Central School"));                //5
        mData.add(new item(R.drawable.staisabel, "Sta. Isabel Elementary School"));     //6
        Adapter adapter = new Adapter(this, mData, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void OnNoteClick(int position) {
        if (position == 0) {
            Intent intent = new Intent(getApplicationContext(), SchoolBalagtas.class);
            startActivity(intent);
        }
        if (position == 1) {
            Intent intent = new Intent(getApplicationContext(), SchoolBaliuag.class);
            startActivity(intent);
        }
        if (position == 2) {
            Intent intent = new Intent(getApplicationContext(), SchoolCalumpit.class);
            startActivity(intent);
        }
        if (position == 3) {
            Intent intent = new Intent(getApplicationContext(), SchoolMalolos.class);
            startActivity(intent);
        }
        if (position == 4) {
            Intent intent = new Intent(getApplicationContext(), SchoolMarilao.class);
            startActivity(intent);
        }
        if (position == 5) {
            Intent intent = new Intent(getApplicationContext(), SchoolObando.class);
            startActivity(intent);
        }
        if (position == 6) {
            Intent intent = new Intent(getApplicationContext(), SchoolStaIsabel.class);
            startActivity(intent);
        }
    }
}

