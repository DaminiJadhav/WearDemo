package com.example.syntagi.weardemo;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class AlarmService extends IntentService {
    private NotificationManager notificationManager;
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public AlarmService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        sendNotification("Wake up! wake up!");
    }

    private void sendNotification(String msg) {
        Log.d("AlarmService","Preparing to send Notification..." +msg);
        notificationManager= (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,new Intent(this,Reminder.class),PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"channel_id")
                                                                 .setContentTitle("Alarm")
                                                                 .setSmallIcon(R.drawable.alarm)
                                                                 .setStyle(new NotificationCompat.BigTextStyle().bigText(msg))
                                                                 .setContentText(msg).setAutoCancel(true);

     builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
     builder.setContentIntent(pendingIntent);
     notificationManager.notify(1,builder.build());
     Log.d("AlarmService","Notification sent.");
    }
}