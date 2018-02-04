package com.example.alphabat69.emaildemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText to, subject, message;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to = findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toText = to.getText().toString();
                String subjectText = subject.getText().toString();
                String messageText = message.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{toText});
                //email.putExtra(Intent.EXTRA_CC, new String[]{toText});
                //email.putExtra(Intent.EXTRA_BCC, new String[]{toText});
                email.putExtra(Intent.EXTRA_SUBJECT, subjectText);
                email.putExtra(Intent.EXTRA_TEXT, messageText);

                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client:"));
            }
        });
    }
}
