package com.example.knockknock.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.knockknock.R;

public class loginactivity extends AppCompatActivity {
    
    TextView tvsignup;
    AppCompatButton btnlogin;
    EditText etpass,etmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        
        etpass=findViewById(R.id.etpass);
        etmail=findViewById(R.id.etmail);
        btnlogin=findViewById(R.id.btnlogin);
        tvsignup=findViewById(R.id.tvsignup);
        

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=etmail.getText().toString();
                String password=etpass.getText().toString();

                if(TextUtils.isEmpty(email)||TextUtils.isEmpty(password)){

                    Toast.makeText(loginactivity.this, "Empty fields not allowed", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent1=new Intent(loginactivity.this, MainActivity.class);
                    startActivity(intent1);
                    finish();
                }
                
            }
        });

        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2=new Intent(loginactivity.this, signupactivity.class);
                startActivity(i2);
                finish();

            }
        });
       
    }

    public static class getstartedactivity extends AppCompatActivity {
        AppCompatButton btngetstarted;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_getstartedactivity);

            btngetstarted=findViewById(R.id.btngetstarted);
            btngetstarted.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent in=new Intent(getstartedactivity.this, loginactivity.class);
                    startActivity(in);

                }
            });

        }
    }
}