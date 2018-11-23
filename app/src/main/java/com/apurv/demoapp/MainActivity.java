package com.apurv.demoapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.apurv.demoapp.pojos.Photo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements recents.OnFragmentInteractionListener,search.OnFragmentInteractionListener {

    ViewPager vp;
    viewPagerAdapter adapter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_recent:
                    vp.setCurrentItem(0);
                    return true;
                case R.id.navigation_search:
                    vp.setCurrentItem(1);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            vp=findViewById(R.id.viewpager);

            adapter=new viewPagerAdapter(getSupportFragmentManager());

        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position==0) {
                    navigation.setSelectedItemId(R.id.navigation_recent);
                }
                else
                {
                    navigation.setSelectedItemId(R.id.navigation_search);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        vp.setAdapter(adapter);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
