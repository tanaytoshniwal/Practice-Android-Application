package com.example.alphabat69.geny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    EditText et;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        et=(EditText)findViewById(R.id.et);
        btn=(Button)findViewById(R.id.btn);
        Intent m=getIntent();
        String msg=m.getStringExtra("msg");
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String reply=et.getText().toString();
                Intent myIntent=new Intent(Activity2.this,Activity1.class);
                myIntent.putExtra("reply",reply);
                setResult(RESULT_OK,myIntent);
                finish();
            }
        });
    }
}
