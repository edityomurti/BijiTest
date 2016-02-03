package com.edityo.bijitest.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.edityo.bijitest.TodaysFragment;
import com.edityo.bijitest.TrendingFragment;

/**
 * Created by GIGABYTE on 02-Feb-16.
 */
public class HomeSlidingTabAdapter extends FragmentPagerAdapter {

    public HomeSlidingTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return (position == 0) ? "TRENDING" : "TODAY'S FOR YOU";
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        return (position == 0)? new TrendingFragment() : new TodaysFragment();
    }

}
