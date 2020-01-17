package com.investment.investment.investment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import com.investment.R;
import com.investment.investment.adapter.InvestmentAdapter;
import com.investment.investment.model.InvestmentModel;

import java.util.ArrayList;

public class InvestmentActivity extends AppCompatActivity {

    private RecyclerView rv_investment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setAdapter();
    }

    private void initViews() {
        rv_investment = findViewById(R.id.rv_investment);
       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Investment");*/
    }

    private void setAdapter() {
        ArrayList<InvestmentModel> lstInvestment = new ArrayList<>();


//        if (lstInvestment.size() > 0) {
            InvestmentAdapter mInvestmentAdapter = new InvestmentAdapter(lstInvestment, this);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            rv_investment.setLayoutManager(mLayoutManager);
            rv_investment.setItemAnimator(new DefaultItemAnimator());
            rv_investment.setAdapter(mInvestmentAdapter);
//        }
    }
}
