package com.example.ka.view_pager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager mviewPager;
    private ViewPagerAdapter mPagerAdapter;

    private int[] mImageResources = {
            R.drawable.anh1,
            R.drawable.anh2,
            R.drawable.anh3,
            R.drawable.anh4,
            R.drawable.anh5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mviewPager = findViewById(R.id.viewPager);
        mPagerAdapter = new ViewPagerAdapter(this,mImageResources);
        mviewPager.setAdapter(mPagerAdapter);

    }
}
