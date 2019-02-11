package com.example.syntagi.weardemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.wear.widget.WearableLinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;

import android.widget.Toast;

import java.util.ArrayList;


public class Wearable_listview extends AppCompatActivity
{

    WearableRecyclerView RecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wearable_listview);

        RecyclerView=findViewById(R.id.list_view);

        RecyclerView.setHasFixedSize(true);
        RecyclerView.setEdgeItemsCenteringEnabled(true);
        RecyclerView.setLayoutManager(new WearableLinearLayoutManager(this));

        ArrayList<MenuItem> menuItems=new ArrayList<>();
        menuItems.add(new MenuItem(R.drawable.android,"Item 1"));
        menuItems.add(new MenuItem(R.drawable.android,"Item 2"));
        menuItems.add(new MenuItem(R.drawable.android,"Item 3"));
        menuItems.add(new MenuItem(R.drawable.android,"Item 4"));

        RecyclerView.setAdapter(new MainMenuAdapter(this,menuItems, new MainMenuAdapter.AdapterCallback() {
            @Override
            public void onItemClicked(Integer menuPosition) {
                switch (menuPosition)
                {
                    case 0:
                        Toast.makeText(Wearable_listview.this, "Item 1 Click", Toast.LENGTH_SHORT).show();
                            break;
                    case 1:
                        Toast.makeText(Wearable_listview.this, "Item 2 Click", Toast.LENGTH_SHORT).show();
                            break;
                    case 2:
                        Toast.makeText(Wearable_listview.this, "Item 3 Click", Toast.LENGTH_SHORT).show();
                            break;
                    case 3:
                        Toast.makeText(Wearable_listview.this, "Item 4 Click", Toast.LENGTH_SHORT).show();
                            break;
                    default :
                        Toast.makeText(Wearable_listview.this, "default", Toast.LENGTH_SHORT).show();
                    // cancelMenu();

                }
            }


        }));


    }



}
