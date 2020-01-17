package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;
import me.biubiubiu.justifytext.library.JustifyTextView;

public class LearnDetailsActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learndetails);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);

        JustifyTextView  txtdes = (JustifyTextView) findViewById(R.id.txtdes);
        txtdes.setText(getResources().getString(R.string.text));
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
