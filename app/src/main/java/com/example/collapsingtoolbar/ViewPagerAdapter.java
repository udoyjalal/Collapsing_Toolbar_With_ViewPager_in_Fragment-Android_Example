package com.example.collapsingtoolbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> FragmentlistTitle = new ArrayList<>();

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public CharSequence getPageTitle (int position){
        return FragmentlistTitle.get(position);
    }

    public void AddFragment(Fragment fragment, String Title){
        fragmentList.add(fragment);
        FragmentlistTitle.add(Title);
    }
}
