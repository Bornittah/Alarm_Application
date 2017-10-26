package com.example.bornittah.alarm_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Bornittah on 10/25/2017.
 */

public class MyAlarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Set Alarm After 5 seconds",Toast.LENGTH_LONG).show();
    }
}
