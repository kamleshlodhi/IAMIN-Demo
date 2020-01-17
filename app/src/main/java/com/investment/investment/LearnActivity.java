package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;
import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class LearnActivity extends AppCompatActivity implements View.OnClickListener{
    LinearLayout pnlnews,pnlvideo,row1,row2;
    TabLayout tab1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        tab1 = (TabLayout) findViewById(R.id.tab1);
        pnlnews = (LinearLayout) findViewById(R.id.pnlnews);
        pnlvideo = (LinearLayout) findViewById(R.id.pnlvideo);
        row1 = (LinearLayout) findViewById(R.id.row1);
        row2 = (LinearLayout) findViewById(R.id.row2);
        row1.setOnClickListener(this);
        row2.setOnClickListener(this);
        tab1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                pnlnews.setVisibility(View.GONE);
                pnlvideo.setVisibility(View.GONE);
                switch (position) {
                    case 0:
                    case 1:
                        pnlnews.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                    case 3:
                        pnlvideo.setVisibility(View.VISIBLE);
                        break;
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.row1:
            case R.id.row2:
                Intent intentpnlMyGoal= new Intent(LearnActivity.this, LearnDetailsActivity.class);
                startActivity(intentpnlMyGoal);
                break;

        }
    }
}
