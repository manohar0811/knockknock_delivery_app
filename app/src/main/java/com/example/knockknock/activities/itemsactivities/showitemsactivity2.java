package com.example.knockknock.activities.itemsactivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;

import com.example.knockknock.Adapters.mainadapter;
import com.example.knockknock.Models.mainmodel;
import com.example.knockknock.R;

import com.example.knockknock.R;

import java.util.ArrayList;

public class showitemsactivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showitemsactivity2);

        RecyclerView recyclerview2=findViewById(R.id.recyclerview2);
        recyclerview2.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<mainmodel> list2=new ArrayList<>();
        list2.add(new mainmodel(R.drawable.grains,"grains","30","this is items description"));
        list2.add(new mainmodel(R.drawable.paste,"toothpaste","5","it is the daily need of every person"));
        list2.add(new mainmodel(R.drawable.horlicks,"Horlicks","7","this is items description"));
        list2.add(new mainmodel(R.drawable.oil,"sunflower oil","26","this is items description"));
        mainadapter adapter2=new mainadapter(list2,this);
        recyclerview2.setAdapter(adapter2);
    }
}