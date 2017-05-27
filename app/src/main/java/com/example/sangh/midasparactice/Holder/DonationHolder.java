package com.example.sangh.midasparactice.Holder;

import android.content.Context;
import android.view.View;

import com.example.sangh.midasparactice.Model.Donation;

/**
 * Created by sangh on 2017-05-27.
 */

public class DonationHolder extends BaseViewHolder<Donation> {
    private Context mContext;

    public DonationHolder(Context context,View itemView) {
        super(itemView);
        this.mContext =context;
    }

    @Override
    public void onBindView(Donation donation) {

    }
}
