package com.example.syntagi.weardemo;

import androidx.core.app.NotificationCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notification_activity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_activity);
        btn=findViewById(R.id.button);

    }

    public void Notify(View view)
    {
       // NotificationCompat.Action action=new NotificationCompat.Action(this);
     //  NotificationCompat.Builder builder=new NotificationCompat.Builder(Notification_activity.this);

    }

}
