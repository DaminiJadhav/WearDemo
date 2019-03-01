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
    MediaPlayer mediaPlayer;
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context, "Alarm! Wake up! Wake up!", Toast.LENGTH_LONG).show();
        Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        mediaPlayer=new MediaPlayer();
//        try {
//            mediaPlayer.setDataSource(context,alarmUri);
//            final AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
//            if (audioManager.getStreamVolume(AudioManager.STREAM_ALARM)!=0){
//                mediaPlayer.setAudioStreamType(AudioManager.STREAM_ALARM);
//                mediaPlayer.setLooping(true);
//                mediaPlayer.prepare();
//                mediaPlayer.start();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//Ringtone ringtonesound= RingtoneManager.getRingtone(this,alarmUri);
//if (ringtonesound!=null){
//    ringtonesound.play();
//}
        if (alarmUri == null)
        {
            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Vibrator v= (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
            v.vibrate(300000);
        }

        Ringtone ringtone = RingtoneManager.getRingtone(context, alarmUri);
        ringtone.play();
//       Uri ringtoneuri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);


        ComponentName componentName=new ComponentName(context.getPackageName(),AlarmService.class.getName());
        startWakefulService(context, (intent.setComponent(componentName)));
        setResultCode(Activity.RESULT_OK);
    }

    private Object getSystemService(String audioService) {
        return true;
    }


}