package com.example.knockknock.activities.itemsactivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.knockknock.Adapters.mainadapter;
import com.example.knockknock.Models.mainmodel;
import com.example.knockknock.R;

import java.util.ArrayList;

public class showitemsactivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showitemsactivity3);
        RecyclerView recyclerView3=findViewById(R.id.recyclerview3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<mainmodel> list3=new ArrayList<>();

        list3.add(new mainmodel(R.drawable.blackcurrent,"Black currrant","30","black currrant is one of the most tastiest icecream"));
        list3.add(new mainmodel(R.drawable.strawberry,"starwberry","100","Tasty strawbeery icecreams are available"));
        list3.add(new mainmodel(R.drawable.butterscotch,"butterscotch","100","Tasty butterscotch icecreams are available"));
        list3.add(new mainmodel(R.drawable.vanilla,"vanilla","100","Tasty vanilla icecreams are available"));

        mainadapter adapter=new mainadapter(list3,this);
        recyclerView3.setAdapter(adapter);

    }
}