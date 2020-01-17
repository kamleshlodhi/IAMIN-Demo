package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class MyProfileActivity extends AppCompatActivity implements View.OnClickListener{
    LinearLayout pnlMyGoal,pnlTasks,pnlHelpSupport,pnlBankAc,pnlSecuritySetting,pnlMyPortfolio;
    ImageView btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        pnlMyGoal = (LinearLayout) findViewById(R.id.pnlMyGoal);
        pnlMyGoal.setOnClickListener(this);

        pnlTasks = (LinearLayout) findViewById(R.id.pnlTasks);
        pnlTasks.setOnClickListener(this);

        pnlHelpSupport = (LinearLayout) findViewById(R.id.pnlHelpSupport);
        pnlHelpSupport.setOnClickListener(this);

        pnlBankAc = (LinearLayout) findViewById(R.id.pnlBankAc);
        pnlBankAc.setOnClickListener(this);

        pnlSecuritySetting = (LinearLayout) findViewById(R.id.pnlSecuritySetting);
        pnlSecuritySetting.setOnClickListener(this);

        pnlMyPortfolio = (LinearLayout) findViewById(R.id.pnlMyPortfolio);
        pnlMyPortfolio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
            case R.id.pnlMyGoal:
                Intent intentpnlMyGoal= new Intent(MyProfileActivity.this, MyGolsActivity.class);
                startActivity(intentpnlMyGoal);
                break;
            case R.id.pnlTasks:
                Intent intentpnlMyTask= new Intent(MyProfileActivity.this, MyTasksActivity.class);
                startActivity(intentpnlMyTask);
                break;

            case R.id.pnlBankAc:
                Intent intentpnlBankAc= new Intent(MyProfileActivity.this, BankAccountActivity.class);
                startActivity(intentpnlBankAc);
                break;
            case R.id.pnlHelpSupport:
                Intent intentpnlHelpSupport= new Intent(MyProfileActivity.this, HelpSupportActivity.class);
                startActivity(intentpnlHelpSupport);
                break;

            case R.id.pnlSecuritySetting:
                Intent intentpnlSecuritySetting= new Intent(MyProfileActivity.this, SecuritySettingActivity.class);
                startActivity(intentpnlSecuritySetting);
                break;
            case R.id.pnlMyPortfolio:
                Intent intentMyPortfolio= new Intent(MyProfileActivity.this, MyPortfolioActivity.class);
                startActivity(intentMyPortfolio);
                break;
        }
    }
}
