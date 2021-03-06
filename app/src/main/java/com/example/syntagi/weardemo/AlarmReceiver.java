package com.example.syntagi.weardemo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.widget.Toast;

import java.io.IOException;
import java.security.PublicKey;

import static androidx.legacy.content.WakefulBroadcastReceiver.startWakefulService;

public class AlarmReceiver extends BroadcastReceiver
{
//    MediaPlayer mediaPlayer;
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context, "Alarm! Wake up! Wake up!", Toast.LENGTH_LONG).show();
        Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

        if (alarmUri == null)
        {
            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Vibrator v= (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
            v.vibrate(300000);
        }

        Ringtone ringtone = RingtoneManager.getRingtone(context, alarmUri);
        ringtone.play();
//       Uri ringtoneuri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);

        Intent intent1=new Intent(context,AlarmService.class);
        if (intent1!=null){
            context.startService(intent1);
        }
        else{
            context.stopService(intent1);
        }

//
//        ComponentName componentName=new ComponentName(context.getPackageName(),AlarmService.class.getName());
//        startWakefulService(context, (intent.setComponent(componentName)));
//        setResultCode(Activity.RESULT_OK);
    }

//    private Object getSystemService(String audioService) {
//        return true;
//    }


}