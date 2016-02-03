package com.edityo.bijitest;

import android.graphics.Color;
import android.graphics.pdf.PdfDocument;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewConfiguration;

import com.astuetz.PagerSlidingTabStrip;
import com.edityo.bijitest.adapter.HomeSlidingTabAdapter;

import java.lang.reflect.Field;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new HomeSlidingTabAdapter(getSupportFragmentManager()));

        PagerSlidingTabStrip tabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        tabStrip.setTextColor(Color.WHITE);
        tabStrip.setViewPager(viewPager);
    }

}
