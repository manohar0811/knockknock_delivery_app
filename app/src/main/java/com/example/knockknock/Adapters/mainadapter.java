package com.example.knockknock.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.knockknock.Models.mainmodel;
import com.example.knockknock.R;
import com.example.knockknock.activities.orderactivity;

import java.util.ArrayList;

public class mainadapter extends RecyclerView.Adapter<mainadapter.viewholder>{

    ArrayList<mainmodel> list;
   private Context context;

    public mainadapter(ArrayList<mainmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.showitems_layout,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        final mainmodel model=list.get(position);
        holder.maindescription.setText(model.getItemdescription());
        holder.imageitem.setImageResource(model.getImage());
        holder.mainname.setText(model.getItemname());
        holder.mainprice.setText(model.getItemprice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents=new Intent(context,orderactivity.class);
                intents.putExtra("image",model.getImage());
                intents.putExtra("price",model.getItemprice());
                intents.putExtra("desc",model.getItemdescription());
                intents.putExtra("name",model.getItemname());
                context.startActivity(intents);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView imageitem;
        TextView mainname,mainprice,maindescription;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            context=itemView.getContext();
            imageitem=itemView.findViewById(R.id.sampleimage);
            mainname=itemView.findViewById(R.id.tvitemname);
            mainprice=itemView.findViewById(R.id.tvprice);
            maindescription=itemView.findViewById(R.id.tvdescription);

        }


    }
}
