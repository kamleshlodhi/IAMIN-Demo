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

public class TaskAdd2Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    ImageView btnNext;
    TextView txtheading;
    String type, TaskName,Note;
    TextView txtTaskName;
    Switch SwitchDaily,SwitchWeekly;
    LinearLayout pnlDaily,pnlWeekly;

    NumberPicker numberPickerDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskadd2);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        btnNext = (ImageView) findViewById(R.id.btnNext);
        txtTaskName = (TextView) findViewById(R.id.txtTaskName);
        btnNext.setOnClickListener(this);
        txtheading = (TextView) findViewById(R.id.txtheading);
        SwitchDaily = (Switch) findViewById(R.id.SwitchDaily);
        SwitchWeekly = (Switch) findViewById(R.id.SwitchWeekly);

        pnlDaily = (LinearLayout) findViewById(R.id.pnlDaily);
        pnlWeekly = (LinearLayout) findViewById(R.id.pnlWeekly);


        Intent intent = getIntent();
        type = intent.getExtras().getString("type");
        TaskName = intent.getExtras().getString("TaskName");
        Note = intent.getExtras().getString("Note");
        txtheading.setText(type);
        txtTaskName.setText(TaskName);


        SwitchDaily.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    pnlDaily.setVisibility(View.VISIBLE);
                    SwitchWeekly.setChecked(false);
                    pnlWeekly.setVisibility(View.GONE);
                }
               else {
                    pnlDaily.setVisibility(View.GONE);
                }

            }
        });
        SwitchWeekly.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    pnlWeekly.setVisibility(View.VISIBLE);
                    SwitchDaily.setChecked(false);
                    pnlDaily.setVisibility(View.GONE);
                }
                else {
                    pnlWeekly.setVisibility(View.GONE);
                }

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                Intent intentTaskForMeActivity = new Intent(TaskAdd2Activity.this, TaskAdd3Activity.class);
                intentTaskForMeActivity.putExtra("type", type);
                intentTaskForMeActivity.putExtra("TaskName", TaskName);
                intentTaskForMeActivity.putExtra("Note", Note);
                startActivity(intentTaskForMeActivity);
                break;
            case R.id.btnback:
                finish();
                break;
        }
    }
}
