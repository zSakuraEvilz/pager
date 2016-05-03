package com.sakuraevil.map.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by DuyNguyen on 5/3/2016.
 */
public class ScreenSlidePagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    public ScreenSlidePagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }


    @Override

    public int getCount() {
        return this.fragments.size();
    }
}
