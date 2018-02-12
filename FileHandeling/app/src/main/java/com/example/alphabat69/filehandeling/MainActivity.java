package com.example.alphabat69.filehandeling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    Button save, read, reset;
    EditText text, name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = findViewById(R.id.save);
        read = findViewById(R.id.read);
        reset = findViewById(R.id.reset);
        name = findViewById(R.id.name);
        text = findViewById(R.id.text);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s1 = name.getText().toString();
                String s2 = text.getText().toString();
                try{
                    FileOutputStream fos = openFileOutput(s1, MODE_PRIVATE);
                    byte[] b = s2.getBytes();
                    fos.write(b);
                    fos.close();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        read.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s1 = name.getText().toString();
                if(s1!=""){
                    try{
                        FileInputStream fis = openFileInput(s1);
                        int i=0;
                        String str="";
                        while((i=fis.read())!=-1)
                            str=str+Character.toString((char)i);
                        text.setText(str);
                        fis.close();
                    }
                    catch (Exception e){
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                name.setText("");
                text.setText("");
            }
        });
    }
}
