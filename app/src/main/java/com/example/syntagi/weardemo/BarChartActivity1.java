package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart1);
        BarChart barChart=findViewById(R.id.bar_chart);


        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setPinchZoom(true);
        barChart.setScaleEnabled(true);
        ArrayList no_of_emp=new ArrayList();
        no_of_emp.add(new BarEntry(945f,0));
        no_of_emp.add(new BarEntry(1040f,1));
        no_of_emp.add(new BarEntry(1133f,2));
        no_of_emp.add(new BarEntry(1240f,3));
        no_of_emp.add(new BarEntry(1369f,4));
        no_of_emp.add(new BarEntry(1487f,5));
        no_of_emp.add(new BarEntry(1501f,6));
        no_of_emp.add(new BarEntry(1645f,7));
        no_of_emp.add(new BarEntry(1578f,8));
        no_of_emp.add(new BarEntry(1695f,9));

        ArrayList year=new ArrayList();
        year.add("2008");
        year.add("2009");
        year.add("2010");
        year.add("2011");
        year.add("2012");
        year.add("2013");
        year.add("2014");
        year.add("2015");
        year.add("2016");
        year.add("2017");

        BarDataSet barDataSet=new BarDataSet(no_of_emp,"Number of employee");
        barChart.animateY(5000);

        BarData barData=new BarData(year,barDataSet);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.setData(barData);


    }
}
