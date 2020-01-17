package com.investment.investment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.investment.R;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import de.hdodenhof.circleimageview.CircleImageView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    CircleImageView toggle_drawer;
    LinearLayout lnlGoals,lnlEarn,lnlAdd,lnlLearn,lnlNotification,plnRewards,plnEarned;

    CardView card1;
    Context mContext;
    private androidx.drawerlayout.widget.DrawerLayout  mDrawerLayout;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toggle_drawer = (CircleImageView) findViewById(R.id.toggle_drawer);
        toggle_drawer.setOnClickListener(this);

        lnlGoals = (LinearLayout) findViewById(R.id.lnlGoals);
        lnlGoals.setOnClickListener(this);
        lnlEarn= (LinearLayout) findViewById(R.id.lnlEarn);
        lnlEarn.setOnClickListener(this);
        lnlAdd= (LinearLayout) findViewById(R.id.lnlAdd);
        lnlAdd.setOnClickListener(this);
        lnlLearn= (LinearLayout) findViewById(R.id.lnlLearn);
        lnlLearn.setOnClickListener(this);
        lnlNotification= (LinearLayout) findViewById(R.id.lnlNotification);
        lnlNotification.setOnClickListener(this);
        plnRewards= (LinearLayout) findViewById(R.id.plnRewards);
        plnRewards.setOnClickListener(this);
        plnEarned= (LinearLayout) findViewById(R.id.plnEarned);
        plnEarned.setOnClickListener(this);

        card1= (CardView) findViewById(R.id.card1);
        card1.setOnClickListener(this);

        TextView txtname= (TextView) findViewById(R.id.txtname);
        txtname.setPaintFlags(txtname.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView txtname1= (TextView) findViewById(R.id.txtname1);
        txtname1.setPaintFlags(txtname1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.toggle_drawer:
                Intent intentmyprofile = new Intent(HomeActivity.this, MyProfileActivity.class);
                startActivity(intentmyprofile);
                break;
            case R.id.plnRewards:
                Intent intent = new Intent(HomeActivity.this, RewardsActivity.class);
                startActivity(intent);
                break;
            case R.id.plnEarned:
                Intent intentEarned = new Intent(HomeActivity.this, EarnSummaryActivity.class);
                startActivity(intentEarned);
                break;
            case R.id.lnlGoals:
                break;
            case R.id.lnlEarn:

                break;
            case R.id.lnlAdd:
                Intent intentTask = new Intent(HomeActivity.this, TaskActivity.class);
                startActivity(intentTask);
                break;
            case R.id.lnlLearn:
                Intent intentLearn = new Intent(HomeActivity.this, LearnActivity.class);
                startActivity(intentLearn);
                break;
            case R.id.lnlNotification:
                Intent intentNoti = new Intent(HomeActivity.this, NotificationActivity.class);
                startActivity(intentNoti);
                break;
            case R.id.card1:
                Intent intentYourTaskActivity = new Intent(HomeActivity.this, YourTaskActivity.class);
                startActivity(intentYourTaskActivity);
                break;


        }
    }
}
