package com.example.alphabat69.geny;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivitySplash extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tv1=(TextView)findViewById(R.id.tv1);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                tv1.setVisibility(View.VISIBLE);
            }
        },1000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                startActivity(new Intent(ActivitySplash.this,Activity1.class));
                finish();
            }
        },2000);
    }
}
