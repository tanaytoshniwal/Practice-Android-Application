package com.example.alphabat69.broadcastrecieverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by AlphaBAT69 on 05-02-2018.
 */

public class MyReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Charger Connected!!!", Toast.LENGTH_SHORT).show();
    }
}
