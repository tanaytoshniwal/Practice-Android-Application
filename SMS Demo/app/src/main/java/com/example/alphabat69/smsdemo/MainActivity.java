package com.example.alphabat69.smsdemo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
    }
    public void sendMsg(View v){
        switch(v.getId()){
            case R.id.send:{
                try {
                    if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.SEND_SMS}, 1);
                    }
                    SmsManager manager = SmsManager.getDefault();
                    manager.sendTextMessage("9092029681", null, text.getText().toString(), null, null);
                    break;
                }
                catch (Exception e){
                    Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
                break;
            }
            case R.id.send2:{
                try{
                    Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("smsto:9092029681"));
                    i.putExtra("sms_body", text.getText().toString());
                    startActivity(i);
                    break;
            }
                catch (Exception e){
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
            }
            }
        }
    }
}
