package com.example.sellclothesapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.sellclothesapp.databinding.ActivityMainBinding;
import com.example.sellclothesapp.ui.adapter.ScreenSlidePagerAdapter;
import com.example.sellclothesapp.ui.customview.bottomnavigtion.listener.BubbleNavigationChangeListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ScreenSlidePagerAdapter pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        binding.bottomNavigationViewLinear.setTypeface(Typeface.createFromAsset(getAssets(), "rubik.ttf"));
        binding.bottomNavigationViewLinear.setBadgeValue(0, null);
        binding.bottomNavigationViewLinear.setBadgeValue(1, null); //invisible badge
        binding.bottomNavigationViewLinear.setBadgeValue(2, null);
        binding.bottomNavigationViewLinear.setBadgeValue(3, null); //empty badge
        binding.viewPager.setAdapter(pagerAdapter);

        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override
            public void onPageSelected(int i) {
                binding.bottomNavigationViewLinear.setCurrentActiveItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        binding.bottomNavigationViewLinear.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                binding.viewPager.setCurrentItem(position, true);
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }
}