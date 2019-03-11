package com.example.syntagi.weardemo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.icu.util.Calendar;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Reminder extends AppCompatActivity {

    PendingIntent pendingIntent;
    AlarmManager alarmManager;
    TimePicker alarmTimePicker;
    int mHour,mMinute;
    String am_pm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
      alarmTimePicker = (TimePicker) findViewById(R.id.timePicker);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        alarmTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                mHour=hourOfDay;
                mMinute=minute;
                if (mHour>=12){
                    am_pm="PM";
                    mHour=mHour-12;
                }else {
                    am_pm="AM";
                }

            }
        });

    }


    public void OnToggleClicked(View view) {
        long time;
        if (((ToggleButton) view).isChecked()) {
            Toast.makeText(Reminder.this, "ALARM ON", Toast.LENGTH_SHORT).show();
            Calendar calendar=Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY,alarmTimePicker.getHour());
            calendar.set(Calendar.MINUTE,alarmTimePicker.getMinute());
            Intent intent=new Intent(this,AlarmReceiver.class);
            pendingIntent=PendingIntent.getBroadcast(this,0,intent,0);
             time=(calendar.getTimeInMillis()-(calendar.getTimeInMillis()%60000));
             if (System.currentTimeMillis()>time){
                 if (calendar.AM_PM==0){
                     time=time+(1000)*60*60*12;
                 }
                 else {
                     time=time+(1000)*60*60*24;
                 }

             }

            Uri notification= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
            Ringtone ringtone=RingtoneManager.getRingtone(getApplicationContext(),notification);
             alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,time,10000,pendingIntent);


        }
        else {
            alarmManager.cancel(pendingIntent);
            Toast.makeText(this, "Alarm off", Toast.LENGTH_SHORT).show();
        }
    }
}

