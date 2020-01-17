package com.investment.investment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;

public class VerifyOTPActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    Button btnVerify;
    TextView txtheading,txt1,txtmsg,txtotp;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifyotp);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        btnVerify = (Button) findViewById(R.id.btnVerify);
        btnVerify.setOnClickListener(this);
        txtheading = (TextView) findViewById(R.id.txtheading);
        txt1 = (TextView) findViewById(R.id.txt1);
        txtmsg = (TextView) findViewById(R.id.txtmsg);
        txtotp = (TextView) findViewById(R.id.txtotp);
        txtotp.setOnClickListener(this);
        Intent intent = getIntent();
        type = intent.getExtras().getString("type");
        txtheading.setText("CHANGE " +type);
        txt1.setText("ENTER OTP TO CHANGE " +type);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
            case R.id.txtotp:
                txtmsg.setVisibility(View.VISIBLE);
                break;
            case R.id.btnVerify:
                Intent intentVerify = new Intent(VerifyOTPActivity.this, ChangePasswordActivity.class);
                intentVerify.putExtra("type", type);
                startActivity(intentVerify);
                break;
        }
    }
}
