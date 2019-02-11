package com.example.syntagi.weardemo;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.inputmethodservice.Keyboard;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.FragmentGridPagerAdapter;
import java.util.ArrayList;
import java.util.List;

 @SuppressWarnings("deprecation")
public class MyGridViewPagerAdapter extends FragmentGridPagerAdapter {

private List<Row> masterlist;
Context context;
    public MyGridViewPagerAdapter(Context context1,FragmentManager fm) {
        super(fm);
        this.context=context1;
        masterlist=new ArrayList<Row>();

        masterlist.add(new Row(cardFragment(R.string.wel_android,R.string.hello_world)));

        masterlist.add(new Row(cardFragment(R.string.wel_android, R.string.hello_world),
                                   cardFragment(R.string.wel_android, R.string.hello_world)));

        masterlist.add(new Row(cardFragment(R.string.wel_android, R.string.hello_world),
                                   cardFragment(R.string.wel_android, R.string.hello_world),
                                      cardFragment(R.string.wel_android, R.string.hello_world),
                                     cardFragment(R.string.wel_android, R.string.hello_world)));

    }
    private Fragment cardFragment(int title,int text)
    {
        Resources resources=context.getResources();
        CardFragment cardFragment=CardFragment.create(resources.getText(title),resources.getText(text));
        cardFragment.setCardMarginBottom(resources.getDimensionPixelSize(R.dimen.card_margin_bottom));
        return cardFragment;
    }

    @Override
    public Fragment getFragment(int row, int column) {
       Row row1=masterlist.get(row);
       return row1.getColumn(column);

        // return null;
    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount(int rownu) {
        return masterlist.get(rownu).getcolumncount();
        //  return 0;
    }

    private class Row{
        final List<Fragment> listofcol=new ArrayList<>();

        public Row(Fragment... fragments){
            for (Fragment f:fragments)
            {
                add(f);
            }
        }
        public  void add(Fragment fragment)
        {
            listofcol.add(fragment);
        }
        Fragment getColumn(int i)
        {
            return listofcol.get(i);
        }
        public int getcolumncount()
        {
            return listofcol.size();
        }


    }



}
