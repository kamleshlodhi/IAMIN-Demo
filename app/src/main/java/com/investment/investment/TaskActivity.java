package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class TaskActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    RelativeLayout plnForMe,plnForOther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);

        plnForMe = (RelativeLayout) findViewById(R.id.plnForMe);
        plnForMe.setOnClickListener(this);

        plnForOther = (RelativeLayout) findViewById(R.id.plnForOther);
        plnForOther.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.plnForMe:
                Intent intentTaskForMeActivity = new Intent(TaskActivity.this, TaskAdd1Activity.class);
                intentTaskForMeActivity.putExtra("type", "Task For Me");
                startActivity(intentTaskForMeActivity);
                break;
            case R.id.plnForOther:
                Intent intentTaskForOtherActivity = new Intent(TaskActivity.this, TaskAdd1Activity.class);
                intentTaskForOtherActivity.putExtra("type", "Task For Other");
                startActivity(intentTaskForOtherActivity);
                break;
            case R.id.btnback:
                finish();
                break;
        }
    }
}
