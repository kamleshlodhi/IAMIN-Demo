package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

public class TaskAdd1Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    ImageView btnNext;
    TextView txtheading;
    AppCompatEditText txtTaskName,txtNote;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskadd1);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        btnNext = (ImageView) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
        txtheading = (TextView) findViewById(R.id.txtheading);
        txtTaskName = (AppCompatEditText) findViewById(R.id.txtTaskName);
        txtNote = (AppCompatEditText) findViewById(R.id.txtNote);

        Intent intent = getIntent();
        type = intent.getExtras().getString("type");
        txtheading.setText(type);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                Intent intentTaskForMeActivity = new Intent(TaskAdd1Activity.this, TaskAdd2Activity.class);
                intentTaskForMeActivity.putExtra("type", type);
                intentTaskForMeActivity.putExtra("TaskName", txtTaskName.getText().toString());
                intentTaskForMeActivity.putExtra("Note", txtNote.getText().toString());
                startActivity(intentTaskForMeActivity);
                break;
            case R.id.btnback:
                finish();
                break;
        }
    }
}
