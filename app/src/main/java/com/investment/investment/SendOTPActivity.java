package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class SendOTPActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    Button btnSend;
    TextView txtheading;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendotp);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        btnSend = (Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(this);
        txtheading = (TextView) findViewById(R.id.txtheading);
        Intent intent = getIntent();
        type = intent.getExtras().getString("type");
        txtheading.setText("CHANGE " +type);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
            case R.id.btnSend:
                Intent intentSendOTP= new Intent(SendOTPActivity.this, VerifyOTPActivity.class);
                intentSendOTP.putExtra("type", type);
                startActivity(intentSendOTP);
                break;
        }
    }
}
