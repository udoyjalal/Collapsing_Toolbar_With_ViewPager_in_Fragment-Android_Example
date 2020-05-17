package com.example.collapsingtoolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

  //  private DrawerLayout mDrawerLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.androidxToolbar);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
      //  ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);


        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentPersonal(), "personal");
        adapter.AddFragment(new FragmentMedical(), "medical");
        adapter.AddFragment(new Fragmentlifestyle(), "lifestyle");

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);
    }


}
