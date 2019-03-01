package com.example.syntagi.weardemo;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class ChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        BarChart barChart=findViewById(R.id.chart);
        BarData barData=new BarData(getXAxisValues(),getDataSet());

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setPinchZoom(true);
        barChart.setData(barData);
        barChart.setDescription("My Chart");
        barChart.animateXY(3000,3000);
        barChart.invalidate();
    }
    private ArrayList<BarDataSet> getDataSet(){
        ArrayList<BarDataSet> dataSets=null;

        ArrayList<BarEntry> valueSets1=new ArrayList<>();
        BarEntry val1barEntry1=new BarEntry(110.000f,0);//jan
        valueSets1.add(val1barEntry1);
        BarEntry val1barEntry2=new BarEntry(40.000f,1);//feb
        valueSets1.add(val1barEntry2);
        BarEntry val1barEntry3=new BarEntry(60.000f,2);//mar
        valueSets1.add(val1barEntry3);
        BarEntry val1barEntry4=new BarEntry(30.000f,3);//apr
        valueSets1.add(val1barEntry4);
        BarEntry val1barEntry5=new BarEntry(90.000f,4);//may
        valueSets1.add(val1barEntry5);
        BarEntry val1barEntry6=new BarEntry(100.000f,5);//jun
        valueSets1.add(val1barEntry6);

        ArrayList<BarEntry> valueSets2=new ArrayList<>();
        BarEntry val2barEntry1=new BarEntry(150.000f,0);//jan
        valueSets2.add(val2barEntry1);
        BarEntry val2barEntry2=new BarEntry(90.000f,1);//feb
        valueSets2.add(val2barEntry2);
        BarEntry val2barEntry3=new BarEntry(120.000f,2);//mar
        valueSets2.add(val2barEntry3);
        BarEntry val2barEntry4=new BarEntry(60.000f,3);//apr
        valueSets2.add(val2barEntry4);
        BarEntry val2barEntry5=new BarEntry(20.000f,4);//may
        valueSets2.add(val2barEntry5);
        BarEntry val2barEntry6=new BarEntry(80.000f,5);//jun
        valueSets2.add(val2barEntry6);

        BarDataSet barDataSet1=new BarDataSet(valueSets1,"Brand 1");
        barDataSet1.setColor(Color.rgb(0,155,0));

        BarDataSet barDataSet2=new BarDataSet(valueSets2,"Brand 2");
        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets=new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues(){
        ArrayList<String> xAxis=new ArrayList<>();
        xAxis.add("Jan");
        xAxis.add("Feb");
        xAxis.add("Mar");
        xAxis.add("Apr");
        xAxis.add("May");
        xAxis.add("Jun");

        return xAxis;

    }

}
