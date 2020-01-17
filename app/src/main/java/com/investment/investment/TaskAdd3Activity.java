package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.investment.R;
import com.shawnlin.numberpicker.NumberPicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

public class TaskAdd3Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    ImageView btnNext;
    TextView txtheading;
    String type, TaskName,Note;
    TextView txtTaskName;
    AppCompatEditText txtRewards;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskadd3);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        btnNext = (ImageView) findViewById(R.id.btnNext);
        txtTaskName = (TextView) findViewById(R.id.txtTaskName);
        btnNext.setOnClickListener(this);
        txtheading = (TextView) findViewById(R.id.txtheading);
        txtRewards = (AppCompatEditText) findViewById(R.id.txtRewards);

        Intent intent = getIntent();
        type = intent.getExtras().getString("type");
        TaskName = intent.getExtras().getString("TaskName");
        Note = intent.getExtras().getString("Note");
        txtheading.setText(type);
        txtTaskName.setText(TaskName);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                Intent intentTaskForMeActivity = new Intent(TaskAdd3Activity.this, TaskAdd4Activity.class);
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
