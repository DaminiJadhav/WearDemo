package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.os.Bundle;
import android.widget.Button;

public class Notification_ac extends AppCompatActivity {
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_ac);

        btn1=findViewById(R.id.btn);

        //NotificationCompat.WearableExtender wearableExtender=new NotificationCompat.WearableExtender().setHintShowBackgroundOnly(true)
    }

}
