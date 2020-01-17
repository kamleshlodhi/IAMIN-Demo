package com.investment.investment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class MyTasksActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnNext;
    ImageView btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytasks);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
        }
    }
}
