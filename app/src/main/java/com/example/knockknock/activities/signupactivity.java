package com.example.knockknock.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

import com.example.knockknock.R;


public class signupactivity extends AppCompatActivity {
    AppCompatButton btnsignup;
    EditText etname,setmail,etphone,etpass1,etpass2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);

        btnsignup=findViewById(R.id.btnsignup);
        etname=findViewById(R.id.etname);
        etphone=findViewById(R.id.etphone);
        setmail=findViewById(R.id.setmail);
        etpass1=findViewById(R.id.etpass1);
        etpass2=findViewById(R.id.etpass2);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String name=etname.getText().toString();
                    String phone=etphone.getText().toString();
                    String epass1=etpass1.getText().toString();
                    String epass2=etpass2.getText().toString();
                    String mail=setmail.getText().toString();



                   Intent i5 = new Intent(signupactivity.this, MainActivity.class);
                    i5.putExtra("personname",name);

                    if(TextUtils.isEmpty(name)){
                        Toast.makeText(signupactivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                    }else if(TextUtils.isEmpty(phone)){
                    Toast.makeText(signupactivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                    }else if(TextUtils.isEmpty(mail)){
                    Toast.makeText(signupactivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                    }else if(TextUtils.isEmpty(epass1)){
                        Toast.makeText(signupactivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                    }else if(TextUtils.isEmpty(epass2)){
                        Toast.makeText(signupactivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                    }else{

                        startActivity(i5);

                    }
                }

        });


    }
}