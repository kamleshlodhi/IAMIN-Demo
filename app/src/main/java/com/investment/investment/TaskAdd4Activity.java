package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

public class TaskAdd4Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    TextView txtheading;
    String type, TaskName,Note,Rewards;
    TextView txtTaskName;
    TextView txtRewards;
    LinearLayout pnlitem1,pnlitem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskadd4);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        pnlitem1 = (LinearLayout) findViewById(R.id.pnlitem1);
        pnlitem2 = (LinearLayout) findViewById(R.id.pnlitem2);
        txtTaskName = (TextView) findViewById(R.id.txtTaskName);
        pnlitem1.setOnClickListener(this);
        pnlitem2.setOnClickListener(this);
        txtheading = (TextView) findViewById(R.id.txtheading);
        txtRewards = (TextView) findViewById(R.id.txtRewards);

        Intent intent = getIntent();
        type = intent.getExtras().getString("type");
        TaskName = intent.getExtras().getString("TaskName");
        Note = intent.getExtras().getString("Note");
        Rewards = intent.getExtras().getString("Rewards");
        txtheading.setText(type);
        txtTaskName.setText(TaskName);
        txtRewards.setText("₹"+Rewards);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pnlitem1:
            case R.id.pnlitem2:
                Intent intentTaskForMeActivity = new Intent(TaskAdd4Activity.this, TaskAdd5Activity.class);
                intentTaskForMeActivity.putExtra("type", type);
                intentTaskForMeActivity.putExtra("TaskName", TaskName);
                intentTaskForMeActivity.putExtra("Note", Note);
                intentTaskForMeActivity.putExtra("Rewards", txtRewards.getText().toString());
                startActivity(intentTaskForMeActivity);
                break;
            case R.id.btnback:
                finish();
                break;
        }
    }
}
