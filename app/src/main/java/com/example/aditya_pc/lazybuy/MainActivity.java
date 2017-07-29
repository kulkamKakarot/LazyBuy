package com.example.aditya_pc.lazybuy;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends android.support.v7.app.AppCompatActivity {

    Button btn1;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);

    }

    public void goToLoginActivityVendor(View view) {
        Intent intent = new Intent(this, LoginActivityVendor.class);
        startActivity(intent);
    }

    public void goToLoginActivityCustomer(View view) {
        Intent intent = new Intent(this, LoginActivityCustomer.class);
        startActivity(intent);
    }
}
