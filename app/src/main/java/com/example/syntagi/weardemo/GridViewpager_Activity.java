package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.support.wearable.view.GridViewPager;
import android.view.View;
import android.view.WindowInsets;
import android.widget.GridView;

public class GridViewpager_Activity extends AppCompatActivity {


    @SuppressWarnings("deprecation")
    GridViewPager gridViewPager;
    MyGridViewPagerAdapter myGridViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_viewpager_);

        gridViewPager=findViewById(R.id.grid_view);
        gridViewPager.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
boolean round=insets.isRound();
int rowmargin=getResources().getDimensionPixelOffset(R.dimen.page_row_margin);
                int colmargin=getResources().getDimensionPixelOffset(round ? R.dimen.page_column_margin_round : R.dimen.page_column_margin);

               gridViewPager.setPageMargins(rowmargin,colmargin);
               gridViewPager.onApplyWindowInsets(insets);
               return null;

            }
        });
   //  gridViewPager.setAdapter(new MyGridViewPagerAdapter(this,getSupportFragmentManager()));


       // gridViewPager.setAdapter(new MyGridViewPagerAdapter(this,getSupportFragmentManager()));


    }
}
