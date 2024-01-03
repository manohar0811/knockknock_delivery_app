package com.example.knockknock.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.knockknock.R;


public class orderactivity extends AppCompatActivity {

    TextView tvcount,detailitemname,detaildescription,detailprice;
    AppCompatButton btncart,btnorder;
    ImageView imgminus,imgplus,detailimage;
    int count=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent ins=new Intent(orderactivity.this, ordernowactivity.class);
        setContentView(R.layout.activity_orderactivity);
        detailimage=findViewById(R.id.detailimage);
        detailitemname=findViewById(R.id.detailitemname);
        detaildescription=findViewById(R.id.detaildescription);
        detailprice=findViewById(R.id.detailprice);
        tvcount=findViewById(R.id.quatity);
        imgplus=findViewById(R.id.imgplus);
        imgminus=findViewById(R.id.imgminus);
        btncart=findViewById(R.id.btncart);
        btnorder=findViewById(R.id.btnorder);

        int nimg=getIntent().getIntExtra("image",0);
        int nprice=Integer.parseInt(getIntent().getStringExtra("price"));
        String ndesc=getIntent().getStringExtra("desc");
        String nname=getIntent().getStringExtra("name");



        detailimage.setImageResource(nimg);
        detailprice.setText(String.format("price : Rs %d",nprice));
        detailitemname.setText(nname);
        detaildescription.setText(ndesc);


       imgplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += 1;
                tvcount.setText(""+count);
                detailprice.setText("price :Rs "+count*nprice);

            }
        });
       imgminus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               count-=1;
               if (count<=0) {
                   count=1;
                   Toast.makeText(orderactivity.this, "items cant be 0", Toast.LENGTH_SHORT).show();
               }
               tvcount.setText(""+count);
               detailprice.setText("price :Rs "+count*nprice);

           }
       });
       btncart.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(orderactivity.this, "item added to cart", Toast.LENGTH_SHORT).show();
           }
       });
       btnorder.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ins.putExtra("res",nname);
               ins.putExtra("resp",count*nprice);
               ins.putExtra("resi",nimg);
               startActivity(ins);
           }
       });
    }
}