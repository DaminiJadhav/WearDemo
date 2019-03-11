package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;
import lecho.lib.hellocharts.model.LineChartData;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;

public class BarChartActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        setOnClickListener(R.id.bar_chart_button, R.id.pie_chart_button,R.id.line_chart_button,R.id.point_chart_button);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bar_chart_button:
                Intent bar=new Intent(BarChartActivity.this,BarChartActivity1.class);
                startActivity(bar);
                break;
            case R.id.pie_chart_button:
                Intent pie=new Intent(BarChartActivity.this,PieChartActivity.class);
                startActivity(pie);
                break;
            case R.id.line_chart_button:
                Intent line=new Intent(BarChartActivity.this,LineChartActivity.class);
                startActivity(line);
                break;
            case R.id.point_chart_button:
                Intent point=new Intent(BarChartActivity.this,GraphViewPointActivity.class);
                startActivity(point);


        }

    }

    public void setOnClickListener(int... viewIds){
        for (int id:viewIds){
            findViewById(id).setOnClickListener(this);
        }

    }
}
