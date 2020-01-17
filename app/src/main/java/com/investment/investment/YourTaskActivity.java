package com.investment.investment;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class YourTaskActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    TextView txtday7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourtask);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        txtday7 = (TextView) findViewById(R.id.txtday7);
        txtday7.setPaintFlags(txtday7.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

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
