package com.example.knockknock.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.knockknock.R;
import com.google.android.material.textfield.TextInputEditText;


public class profileFragment extends Fragment {



    public profileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_profile, container, false);
        TextView tv_name=view.findViewById(R.id.tv_name);
        tv_name.setText(getArguments().getString("nameid"));
       return  view;
    }
}