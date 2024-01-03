package com.example.knockknock.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.knockknock.R;
import com.example.knockknock.activities.itemsactivities.showitemsactivity;
import com.example.knockknock.activities.itemsactivities.showitemsactivity2;
import com.example.knockknock.activities.itemsactivities.showitemsactivity3;


public class homeFragment extends Fragment {


    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        CardView card1,card2,card3,card4,card5,card6,card7,card8;
        TextView hometextview;
        ImageView imgcart;
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        card1=view.findViewById(R.id.card1);
        imgcart=view.findViewById(R.id.imgcart);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent int2=new Intent(getActivity(), showitemsactivity.class);
                startActivity(int2);
            }
        });
        card2=view.findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(getActivity(), showitemsactivity2.class);
                startActivity(int3);
            }
        });
        card3=view.findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(getActivity(), showitemsactivity3.class);
                startActivity(int4);
            }
        });
        return view;
    }
}