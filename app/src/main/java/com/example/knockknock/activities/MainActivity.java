package com.example.knockknock.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.knockknock.R;
import com.example.knockknock.fragments.cartFragment;
import com.example.knockknock.fragments.homeFragment;
import com.example.knockknock.fragments.profileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent int2=getIntent();
        String reqname=int2.getStringExtra("personname");
        Bundle data=new Bundle();
        data.putString("nameid",reqname);

        homeFragment hf=new homeFragment();
        profileFragment pf=new profileFragment();
        cartFragment cf=new cartFragment();

        bnview=findViewById(R.id.bnview);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,hf).commit();
        pf.setArguments(data);
        hf.setArguments(data);

        bnview.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.nav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,hf).commit();
                        return true;
                    case R.id.nav_search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,cf).commit();
                        return true;
                    case R.id.nav_profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,pf).commit();
                        return true;
                }
                return false;
            }
        });

    }



}