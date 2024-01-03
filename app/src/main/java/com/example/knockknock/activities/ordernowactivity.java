package com.example.knockknock.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.knockknock.R;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class ordernowactivity extends AppCompatActivity implements PaymentResultListener {
    TextView nameid,prid;
    AppCompatButton btnsend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordernowactivity);
        nameid=findViewById(R.id.nameid);
        prid=findViewById(R.id.prid);
        String sn=getIntent().getStringExtra("res");
        int sp=getIntent().getIntExtra("resp",0);

        nameid.setText(sn);
        prid.setText("Rs "+sp);
        btnsend=findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPayment(sn,sp);
            }
        });

    }
    public void startPayment(String s,int sp) {

        Checkout checkout = new Checkout();


        checkout.setImage(R.drawable.deliveryboy);

        final Activity activity = this;

        try {
            JSONObject options = new JSONObject();
            options.put("name","Knock Knock");
            options.put("description", "make payment to confirm order of "+s+" of amount Rs:"+sp);
            options.put("send_sms_hash", true);
            options.put("allow_rotation", false);

            //You can omit the image option to fetch the image from dashboard
            options.put("currency", "INR");
            options.put("amount", "100");

            JSONObject preFill = new JSONObject();
            preFill.put("email", "email");
            preFill.put("contact", "phone");

            options.put("prefill", preFill);

            checkout.open(activity, options);
        } catch (Exception e) {
            Toast.makeText(activity, "Error in payment: " + e.getMessage(), Toast.LENGTH_SHORT)
                    .show();
            e.printStackTrace();
        }

    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(this, " Payment successfull", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(this, "payment failed", Toast.LENGTH_SHORT).show();
    }
}