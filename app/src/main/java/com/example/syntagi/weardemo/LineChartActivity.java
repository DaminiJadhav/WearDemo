package com.example.syntagi.weardemo;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;

public class LineChartActivity extends AppCompatActivity {

    LineChartView linechartview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        linechartview=findViewById(R.id.linechartview);

        String [] xaxisData={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        int [] yaxisData={50,20,15,30,20,60,15,40,45,10,90,18};

        List xaxisValue=new ArrayList();
        List yaxisValue=new ArrayList();
        Line line=new Line(yaxisValue);

        for (int i=0;i<xaxisValue.size();i++){
            xaxisValue.add(i,new AxisValue(i).setLabel(xaxisData[i]));
        }

        for (int i=0;i<yaxisValue.size();i++){
            yaxisValue.add(new PointValue(i,yaxisData[i]));
        }

        List lines=new ArrayList();
        lines.add(line);

        LineChartData lineChartData=new LineChartData();
        lineChartData.setLines(lines);

        linechartview.setLineChartData(lineChartData);

        Axis xaxis=new Axis();
        xaxis.setValues(xaxisValue);
        lineChartData.setAxisXBottom(xaxis);

        Axis yaxis=new Axis();
        lineChartData.setAxisYLeft(yaxis);

        Line line1=new Line(yaxisValue).setColor(Color.parseColor("#9c27b0"));

        xaxis.setTextSize(16);
        xaxis.setTextColor(Color.parseColor("#56aabb"));

        yaxis.setTextSize(16);
        yaxis.setTextColor(Color.parseColor("#03A9F4"));
        yaxis.setName("Sales in millions");

        Viewport viewport=new Viewport(linechartview.getMaximumViewport());
        viewport.top=110;
        linechartview.setMaximumViewport(viewport);
        linechartview.setCurrentViewport(viewport);






    }
}
