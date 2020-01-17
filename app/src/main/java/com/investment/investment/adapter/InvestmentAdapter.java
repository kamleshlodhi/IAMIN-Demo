package com.investment.investment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;

import com.investment.R;
import com.investment.investment.model.InvestmentModel;

import java.util.ArrayList;
import java.util.List;



public class InvestmentAdapter extends RecyclerView.Adapter<InvestmentAdapter.ViewHolder> {
    ArrayList<InvestmentModel> mList;
    Context context;

    public InvestmentAdapter(ArrayList<InvestmentModel> mList, Context context) {
        this.mList = mList;
        this.context = context;

    }

    @NonNull
    @Override
    public InvestmentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.template_recyclerview, parent, false);
        return new InvestmentAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(InvestmentAdapter.ViewHolder holder, int position) {



    }


    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private LinearLayout llImage;
        private Guideline vertGuideline;
        private ImageView imgInvestType;
        private TextView tvInvestDesc;
        private Switch switchInvest;

        public ViewHolder(View view) {
            super(view);

            vertGuideline = (Guideline) view.findViewById(R.id.vert_guideline);
            imgInvestType = (ImageView) view.findViewById(R.id.img_invest_type);
            tvInvestDesc = (TextView) view.findViewById(R.id.tv_invest_desc);
            switchInvest = (Switch) view.findViewById(R.id.switch_invest);
        }
    }
}
