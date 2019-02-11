package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Timer_activity extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_activity);
        txt=findViewById(R.id.timer_txt);

        new CountDownTimer(30000,1000){
            public void onTick(long milliUtilFinished)
            {
              txt.setText("Second Remaining: " +milliUtilFinished/1000);
            }

            @Override
            public void onFinish() {
                txt.setText("Done!");
            }
        }.start();


    }
}
