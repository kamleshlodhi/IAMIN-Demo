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

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnback;
    Button btnConfirm;
    TextView txtheading;
    String type;
    AppCompatEditText txtpassword,txtpassword1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        btnConfirm = (Button) findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(this);
        txtpassword = (AppCompatEditText) findViewById(R.id.txtpassword);
        txtpassword1 = (AppCompatEditText) findViewById(R.id.txtpassword1);
        txtheading = (TextView) findViewById(R.id.txtheading);
        Intent intent = getIntent();
        type = intent.getExtras().getString("type");
        txtheading.setText("CHANGE " +type);
        txtpassword.setHint("ENTER NEW " +type);
        txtpassword1.setHint("ENTER CONFIRM " +type);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
            case R.id.btnConfirm:
                Intent intentSendOTP= new Intent(ChangePasswordActivity.this, HomeActivity.class);
                startActivity(intentSendOTP);
                break;
        }
    }
}
