package com.example.alphabat69.notificationsdemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
                Notification.Builder n = new Notification.Builder(MainActivity.this);
                n.setStyle(new Notification.BigTextStyle().bigText("Notification"));
                n.setContentTitle("new mail from test@test.com");
                n.setContentText("Subject");
                n.setSmallIcon(R.mipmap.ic_launcher);
                n.setContentIntent(pendingIntent);
                n.addAction(R.mipmap.ic_launcher, "Call", pendingIntent);
                n.addAction(R.mipmap.ic_launcher, "More", pendingIntent);
                n.addAction(R.mipmap.ic_launcher, "Reply", pendingIntent);

                Notification notification = n.build();
                notification.flags = notification.flags | Notification.FLAG_AUTO_CANCEL;
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(1, notification);
            }
        });
    }
}
