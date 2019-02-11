package com.example.syntagi.weardemo;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Button_click extends AppCompatActivity {
Button btn;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);

        txt=findViewById(R.id.txt_view);
        btn=findViewById(R.id.btn);
      btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setTextColor(Color.RED);
            }
        });


    }
}
