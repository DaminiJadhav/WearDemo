package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        PieChart pieChart=findViewById(R.id.pie_chart);


        ArrayList noOfList=new ArrayList();
        noOfList.add(new BarEntry(945f,0));
        noOfList.add(new BarEntry(1040f,1));
        noOfList.add(new BarEntry(1133f,2));
        noOfList.add(new BarEntry(1240f,3));
        noOfList.add(new BarEntry(1369f,4));
        noOfList.add(new BarEntry(1487f,5));
        noOfList.add(new BarEntry(1501f,6));
        noOfList.add(new BarEntry(1645f,7));
        noOfList.add(new BarEntry(1578f,8));
        noOfList.add(new BarEntry(1695f,9));

        PieDataSet pieDataSet=new PieDataSet(noOfList,"No Of Employee");
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



        PieData pieData=new PieData(year,pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.animateXY(5000,5000);


    }
}
