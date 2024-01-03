package com.example.knockknock.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.knockknock.R;

import java.util.ArrayList;


public class cartFragment extends Fragment {

    public cartFragment() {
        // Required empty public constructor
    }


    private TextView t;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_cart, container, false);

        ListView lvplaces=view.findViewById(R.id.lvplaces);
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Miaypur");
        arr.add("kukatpally");
        arr.add("uppal");
        arr.add("karimnagar");
        arr.add("warangal");
        arr.add("banjara hills");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,arr);
        lvplaces.setAdapter(adapter);

        return view;
    }
}