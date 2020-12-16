package com.example.demo_02;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    private FrameLayout fl;
    private TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        fl = (FrameLayout) findViewById(R.id.fl);
        tab = (TabLayout) findViewById(R.id.tab);

        tab.addTab(tab.newTab().setText("首页"));
        tab.addTab(tab.newTab().setText("视频"));
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl,new HomeFragment())
                .commit();

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position==0){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fl,new HomeFragment())
                            .commit();
                }else{
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fl,new BlankFragment())
                            .commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
