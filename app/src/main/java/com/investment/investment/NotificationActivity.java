package com.investment.investment;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.investment.R;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class NotificationActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout lnlGoals,lnlEarn,lnlAdd,lnlLearn,lnlNotification,pnlItem1,pnlItem2,pnlItem3,pnlItem4,pnlItem5;
    AlertDialog.Builder alertDialog;
    AlertDialog dialog;
    int width,height;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        lnlGoals = (LinearLayout) findViewById(R.id.lnlGoals);
        lnlGoals.setOnClickListener(this);
        lnlEarn = (LinearLayout) findViewById(R.id.lnlEarn);
        lnlEarn.setOnClickListener(this);
        lnlAdd = (LinearLayout) findViewById(R.id.lnlAdd);
        lnlAdd.setOnClickListener(this);
        lnlLearn = (LinearLayout) findViewById(R.id.lnlLearn);
        lnlLearn.setOnClickListener(this);
        lnlNotification = (LinearLayout) findViewById(R.id.lnlNotification);
        lnlNotification.setOnClickListener(this);

        pnlItem1 = (LinearLayout) findViewById(R.id.pnlItem1);
        pnlItem1.setOnClickListener(this);
        pnlItem2 = (LinearLayout) findViewById(R.id.pnlItem2);
        pnlItem2.setOnClickListener(this);
        pnlItem3 = (LinearLayout) findViewById(R.id.pnlItem3);
        pnlItem3.setOnClickListener(this);

        pnlItem4 = (LinearLayout) findViewById(R.id.pnlItem4);
        pnlItem4.setOnClickListener(this);
        pnlItem5 = (LinearLayout) findViewById(R.id.pnlItem5);
        pnlItem5.setOnClickListener(this);

        width = this.getResources().getDisplayMetrics().widthPixels;
        height =(int) (this.getResources().getDisplayMetrics().heightPixels * 0.70);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lnlEarn:
                Intent intentHome = new Intent(NotificationActivity.this, HomeActivity.class);
                startActivity(intentHome);
                break;

            case R.id.lnlAdd:
                Intent intentTask = new Intent(NotificationActivity.this, TaskActivity.class);
                startActivity(intentTask);
                break;
            case R.id.lnlLearn:
                break;
            case R.id.lnlNotification:

                break;

            case R.id.pnlItem1:
                popup1();
                break;
            case R.id.pnlItem2:
                popup2();
                break;
            case R.id.pnlItem3:
                popup3();
                break;
            case R.id.pnlItem4:
                popup4();
                break;
            case R.id.pnlItem5:
                popup5();
                break;

        }
    }
    public void popup1()
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this, R.style.DialogTheme);
        LayoutInflater inflater = getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.popup1_notification, null);
        alertDialog.setView(alertDialogView);
        dialog = alertDialog.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        int dialogWindowWidth = (int) (displayWidth * 0.7f);
        int dialogWindowHeight = (int) (displayHeight * 0.7f);
        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        dialog.getWindow().setAttributes(layoutParams);

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
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        dialog.show();
    }

    public void popup2()
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this, R.style.DialogTheme);
        LayoutInflater inflater = getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.popup2_notification, null);
        alertDialog.setView(alertDialogView);
        dialog = alertDialog.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        int dialogWindowWidth = (int) (displayWidth * 0.7f);
        int dialogWindowHeight = (int) (displayHeight * 0.7f);
        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        dialog.getWindow().setAttributes(layoutParams);

        LinearLayout pnlclose = (LinearLayout) alertDialogView.findViewById(R.id.pnlclose);
        pnlclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        Button btnCopy = (Button) alertDialogView.findViewById(R.id.btnCopy);
        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }

    public void popup3()
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this, R.style.DialogTheme);
        LayoutInflater inflater = getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.popup3_notification, null);
        alertDialog.setView(alertDialogView);
        dialog = alertDialog.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        int dialogWindowWidth = (int) (displayWidth * 0.7f);
        int dialogWindowHeight = (int) (displayHeight * 0.7f);
        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        dialog.getWindow().setAttributes(layoutParams);

        LinearLayout pnlclose = (LinearLayout) alertDialogView.findViewById(R.id.pnlclose);
        pnlclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        Button btnAdd = (Button) alertDialogView.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }

    public void popup4()
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this, R.style.DialogTheme);
        LayoutInflater inflater = getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.popup4_notification, null);
        alertDialog.setView(alertDialogView);
        dialog = alertDialog.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        int dialogWindowWidth = (int) (displayWidth * 0.7f);
        int dialogWindowHeight = (int) (displayHeight * 0.7f);
        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        dialog.getWindow().setAttributes(layoutParams);

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
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }


    public void popup5()
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this, R.style.DialogTheme);
        LayoutInflater inflater = getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.popup5_notification, null);
        alertDialog.setView(alertDialogView);
        dialog = alertDialog.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        int dialogWindowWidth = (int) (displayWidth * 0.7f);
        int dialogWindowHeight = (int) (displayHeight * 0.7f);
        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        dialog.getWindow().setAttributes(layoutParams);

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
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }
}
