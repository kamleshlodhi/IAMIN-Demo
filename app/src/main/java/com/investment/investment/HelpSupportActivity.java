package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class HelpSupportActivity extends AppCompatActivity implements View.OnClickListener{
    LinearLayout pnlfaq,pnltutorial;
    ImageView btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpspport);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        pnlfaq = (LinearLayout) findViewById(R.id.pnlfaq);
        pnlfaq.setOnClickListener(this);

        pnltutorial = (LinearLayout) findViewById(R.id.pnltutorial);
        pnltutorial.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
            case R.id.pnlfaq:
                Intent intentpnlMyGoal= new Intent(HelpSupportActivity.this, FaqActivity.class);
                startActivity(intentpnlMyGoal);
                break;
            case R.id.pnltutorial:
                Intent intentTutorial= new Intent(HelpSupportActivity.this, TutorialActivity.class);
                startActivity(intentTutorial);
                break;
        }
    }
}
