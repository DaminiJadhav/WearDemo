package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.wear.widget.drawer.WearableNavigationDrawerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Navigation_activity extends AppCompatActivity {
WearableNavigationDrawerView navigationDrawerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_activity);


        navigationDrawerView=findViewById(R.id.navigation);
//        navigationDrawerView.getController().peekDrawer();
       // setAmbientEnabled();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_view,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        switch (id)
        {
            case R.id.home:
                    Toast.makeText(this, "Click Home", Toast.LENGTH_SHORT).show();
                      break;
            case R.id.setting:
                Toast.makeText(this, "Click setting", Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
