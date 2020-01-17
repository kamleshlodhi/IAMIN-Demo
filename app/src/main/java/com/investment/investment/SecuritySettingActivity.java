package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class SecuritySettingActivity extends AppCompatActivity implements View.OnClickListener{
    LinearLayout pnlpassword,pnlpin;
    ImageView btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_securitysetting);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        pnlpassword = (LinearLayout) findViewById(R.id.pnlpassword);
        pnlpassword.setOnClickListener(this);

        pnlpin = (LinearLayout) findViewById(R.id.pnlpin);
        pnlpin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
            case R.id.pnlpassword:
                Intent intentpassword= new Intent(SecuritySettingActivity.this, SendOTPActivity.class);
                intentpassword.putExtra("type", "PASSWORD");
                startActivity(intentpassword);
                break;
            case R.id.pnlpin:
                Intent intentpin= new Intent(SecuritySettingActivity.this, SendOTPActivity.class);
                intentpin.putExtra("type", "M-PIN");
                startActivity(intentpin);
                break;
        }
    }
}
