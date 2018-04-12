package ch.fhnw.emoba.spherocontrol.tabs;

import android.app.Fragment;
import android.support.design.widget.TabLayout;

public class TabListener implements TabLayout.OnTabSelectedListener {

    private final TabsPagerAdapter tabsPagerAdapter;

    public TabListener(TabsPagerAdapter tabsPagerAdapter) {
        this.tabsPagerAdapter = tabsPagerAdapter;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        Fragment fragment = tabsPagerAdapter.getItem(tab.getPosition());
        if (fragment instanceof TabbedFragment) {
            TabbedFragment tabbedFragment = (TabbedFragment) fragment;
            tabbedFragment.onFragmentTabGainedFocus();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        Fragment fragment = tabsPagerAdapter.getItem(tab.getPosition());
        if (fragment instanceof TabbedFragment) {
            TabbedFragment tabbedFragment = (TabbedFragment) fragment;
            tabbedFragment.onFragmentTabLostFocus();
        }
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        // No operation
    }
}
