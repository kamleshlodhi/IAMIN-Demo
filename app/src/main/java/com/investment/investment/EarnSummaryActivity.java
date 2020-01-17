package com.investment.investment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.investment.R;
import com.investment.investment.adapter.ViewPagerAdapter;
import com.investment.investment.fragment.EarnHistoryFragment;
import com.investment.investment.fragment.RewardsGivenFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class EarnSummaryActivity extends AppCompatActivity implements View.OnClickListener{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ImageView btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earnsummary);

        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        /*
        tabLayout= (TabLayout) findViewById(R.id.tab1);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                View view = tab.getCustomView();
                TypefacedTextView selectedText = (TextView) view.findViewById(R.id.text1);
                selectedText.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorPrimary));

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                View view = tab.getCustomView();
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.layout_background);
                relativeLayout.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorPrimary));
                TypefacedTextView selectedText = (TypefacedTextView) view.findViewById(R.id.txt_tab_name);
                selectedText.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        */

    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new EarnHistoryFragment(), "EARN HISTORY");
        adapter.addFragment(new RewardsGivenFragment(), "REWARDS GIVEN");
        viewPager.setAdapter(adapter);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
        }
    }
}
