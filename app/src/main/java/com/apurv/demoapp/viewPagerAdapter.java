package com.apurv.demoapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class viewPagerAdapter extends FragmentPagerAdapter {
    public viewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0)
        {
            return new recents();
        }
        else
        {
            return new search();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
