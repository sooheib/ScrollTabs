package com.vivianaranha.scrolltabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new MyAdater(getSupportFragmentManager()));

    }

    class MyAdater extends FragmentStatePagerAdapter {


        public MyAdater(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position){
                case 0: {
                    fragment = new fragmentA();
                    break;
                }
                case 1: {
                    fragment = new FragmentB();
                    break;
                }
                case 2: {
                    fragment = new FragmentC();
                    break;
                }
                default: {
                    fragment = new fragmentA();
                    break;
                }
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            int x = position +1;
            return "Tab "+x;
        }
    }
}
