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

public class TaskAdd5Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    TextView txtheading;
    String type, TaskName,Note,Rewards;
    TextView txtTaskName;
    TextView txtRewards;
    Button btnSendTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskadd5);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        txtTaskName = (TextView) findViewById(R.id.txtTaskName);
        txtheading = (TextView) findViewById(R.id.txtheading);
        txtRewards = (TextView) findViewById(R.id.txtRewards);
        btnSendTask = (Button) findViewById(R.id.btnSendTask);
        btnSendTask.setOnClickListener(this);

        Intent intent = getIntent();
        type = intent.getExtras().getString("type");
        TaskName = intent.getExtras().getString("TaskName");
        Note = intent.getExtras().getString("Note");
        Rewards = intent.getExtras().getString("Rewards");
        txtheading.setText(type);
        txtTaskName.setText(TaskName);
        txtRewards.setText(Rewards);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSendTask:
                Intent intentTaskForMeActivity = new Intent(TaskAdd5Activity.this, HomeActivity.class);
                startActivity(intentTaskForMeActivity);
                finish();
                break;
            case R.id.btnback:
                finish();
                break;
        }
    }
}
