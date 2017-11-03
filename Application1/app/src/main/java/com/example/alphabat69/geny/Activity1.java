package com.example.alphabat69.geny;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity implements View.OnClickListener{
    Button button1,button2,button3,button4,button5,button6;
    AutoCompleteTextView auto;
    String[] str={"Java","CPP","C","Kotlin","Python","XML","HTML","SQL","JavaScript","PHP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        auto=(AutoCompleteTextView)findViewById(R.id.auto);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);
        auto.setAdapter(adapter);
        auto.setThreshold(1);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        String result=data.getStringExtra("reply");
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
            {
                startActivity(new Intent(Activity1.this,ActivityColor.class));
                break;
            }
            case R.id.button2:
            {
                String st=auto.getText().toString();
                Intent i=new Intent(Activity1.this,Activity2.class);
                i.putExtra("msg",st);
                startActivityForResult(i,1);
                break;
            }
            case R.id.button3:
            {
                auto.setText(null);
                Toast.makeText(this,"Reset Button Called", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button4:
            {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9829077521")));
                break;
            }
            case R.id.button5:
            {
                try {
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:9829077521")));
                }catch(SecurityException e){
                    Log.i("Exception",e.getMessage());
                    Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button6:
            {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.co.in")));
                break;
            }
        }
    }
}