package com.example.alphabat69.broadcastrecieverdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            startActivity(new Intent(this, MyReciever.class));
        }
        catch(Exception e){}
    }
}
