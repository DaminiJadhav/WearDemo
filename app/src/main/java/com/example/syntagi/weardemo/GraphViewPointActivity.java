package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class GraphViewPointActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_view);

        GraphView graphView=findViewById(R.id.graphviewxml);
        PointsGraphSeries<DataPoint> series=new PointsGraphSeries<>(new DataPoint[]{
                new DataPoint(0,-2),
                new DataPoint(1,5),
                new DataPoint(2,3),
                new DataPoint(3,2),
                new DataPoint(4,6)
        });
        graphView.addSeries(series);
        series.setShape(PointsGraphSeries.Shape.POINT);


        PointsGraphSeries<DataPoint> series1=new PointsGraphSeries<>(new DataPoint[]{
                new DataPoint(0,-1),
                new DataPoint(1,4),
                new DataPoint(2,2),
                new DataPoint(3,1),
                new DataPoint(4,5)
        });
        graphView.addSeries(series1);
        series1.setShape(PointsGraphSeries.Shape.RECTANGLE);
        series1.setColor(Color.RED);


        PointsGraphSeries<DataPoint> series2=new PointsGraphSeries<>(new DataPoint[]{
                new DataPoint(0,0),
                new DataPoint(1,3),
                new DataPoint(2,1),
                new DataPoint(3,0),
                new DataPoint(4,4)
        });
        graphView.addSeries(series2);
        series2.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series2.setColor(Color.YELLOW);

        PointsGraphSeries<DataPoint> series3=new PointsGraphSeries<>(new DataPoint[]{
                new DataPoint(0,1),
                new DataPoint(1,2),
                new DataPoint(2,0),
                new DataPoint(3,-1),
                new DataPoint(4,3)
        });
        graphView.addSeries(series3);
        series3.setColor(Color.GREEN);
        series.setCustomShape(new PointsGraphSeries.CustomShape() {
            @Override
            public void draw(Canvas canvas, Paint paint, float x, float y, DataPointInterface dataPoint) {
                paint.setStrokeWidth(10);
                canvas.drawLine(x-20,y-20,x+20,y+20,paint);
                canvas.drawLine(x+20,y-20,x-20,y+20,paint);
            }
        });


    }
}
