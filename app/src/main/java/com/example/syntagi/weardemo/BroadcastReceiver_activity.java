package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class BroadcastReceiver_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver_activity);
        BroadcastReceiver_activity br= new BroadcastReceiver_activity();
        IntentFilter filter=new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
       filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);


      // this.registerReceiver(br,filter);


    }
}
