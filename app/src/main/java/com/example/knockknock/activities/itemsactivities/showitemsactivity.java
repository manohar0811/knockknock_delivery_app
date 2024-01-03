package com.example.knockknock.activities.itemsactivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.knockknock.Adapters.mainadapter;
import com.example.knockknock.Models.mainmodel;
import com.example.knockknock.R;
import com.example.knockknock.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class showitemsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showitemsactivity);
        RecyclerView rv=findViewById(R.id.recylerview);
        rv.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<mainmodel> list=new ArrayList<>();
        list.add(new mainmodel(R.drawable.cake,"cakes","100","peoples most favorite item is cakes"));
        list.add(new mainmodel(R.drawable.puffs,"puffs","10","manypeople love puffs"));
        list.add(new mainmodel(R.drawable.rolls,"rolls","15","Hot and tasty rolls"));
        list.add(new mainmodel(R.drawable.burger,"burgers","30","Buy a variety of burgers here"));
        list.add(new mainmodel(R.drawable.samosa,"samosa","40","peoples favorites samosa"));
        list.add(new mainmodel(R.drawable.pizza,"pizza","35","we have a variety of pizzas"));
        list.add(new mainmodel(R.drawable.frenchfries,"frenchfries","50","french fries are love.."));


        mainadapter adapter=new mainadapter(list,this);
        rv.setAdapter(adapter);
        
        
    }
}