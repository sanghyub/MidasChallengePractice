package com.example.sangh.midasparactice.Holder;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.sangh.midasparactice.Model.Donation;

/**
 * Created by sangh on 2017-05-27.
 */

public class DonationHolder extends BaseViewHolder<Donation> implements View.OnClickListener {
    private Context mContext;

    public DonationHolder(Context context,View itemView) {
        super(itemView);
        this.mContext =context;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

    }

    @Override
    public void onBindView(Donation donation) {

    }
}
