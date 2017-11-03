package com.example.alphabat69.geny;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityColor extends AppCompatActivity {
    ConstraintLayout layout;
    Button button,button21;
    int c=0;
    int getColor()
    {
        int color= Color.WHITE;
        switch(c++)
        {
            case 0:
            {
                color=Color.BLUE;
                break;
            }
            case 1:
            {
                color=Color.CYAN;
                break;
            }
            case 2:
            {
                color=Color.GRAY;
                break;
            }
            case 3:
            {
                color=Color.GREEN;
                break;
            }
            case 4:
            {
                c=0;
                color=Color.RED;
                break;
            }
        }
        return color;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        button=(Button)findViewById(R.id.button);
        button21=(Button)findViewById(R.id.button21);
        layout=(ConstraintLayout)findViewById(R.id.layout);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
                {
                    layout.setBackgroundColor(getColor());
                    Toast.makeText(ActivityColor.this,"Color Changed", Toast.LENGTH_SHORT).show();
                }
        });
    }
    public void back(View view){
        startActivity(new Intent(ActivityColor.this,Activity1.class));
        finish();
    }
}
