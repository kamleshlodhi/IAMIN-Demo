package com.investment.investment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.investment.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class RewardsNextActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnProceed;
    ImageView btnback;
    CardView lnlwithdraw;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards_next);
        btnProceed = (Button) findViewById(R.id.btnProceed);
        btnProceed.setOnClickListener(this);
        btnback = (ImageView) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);

        lnlwithdraw = (CardView) findViewById(R.id.lnlwithdraw);
        lnlwithdraw.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnProceed:
                popup1();
                break;
            case R.id.btnback:
                finish();
                break;
            case R.id.lnlwithdraw:
                popup2();
                break;
        }
    }

    public void popup1() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.popup1_rewards_next, null);
        alertDialog.setView(alertDialogView);
        dialog = alertDialog.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);

        LinearLayout pnlclose = (LinearLayout) alertDialogView.findViewById(R.id.pnlclose);
        pnlclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        Button btnReject = (Button) alertDialogView.findViewById(R.id.btnReject);
        btnReject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        Button btnAccept = (Button) alertDialogView.findViewById(R.id.btnAccept);
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();
    }
    public void popup2() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.popup2_rewards_next, null);
        alertDialog.setView(alertDialogView);
        dialog = alertDialog.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);

        LinearLayout pnlclose = (LinearLayout) alertDialogView.findViewById(R.id.pnlclose);
        pnlclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        Button btnReject = (Button) alertDialogView.findViewById(R.id.btnReject);
        btnReject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        Button btnAccept = (Button) alertDialogView.findViewById(R.id.btnAccept);
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();
    }
}
