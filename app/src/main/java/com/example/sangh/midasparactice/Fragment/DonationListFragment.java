package com.example.sangh.midasparactice.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sangh.midasparactice.Adapter.DonationAdapter;
import com.example.sangh.midasparactice.Model.Donation;
import com.example.sangh.midasparactice.R;

import java.util.ArrayList;

/**
 * Created by sangh on 2017-05-27.
 */

public class DonationListFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private DonationAdapter mAdapter;
    private ArrayList<Donation> mDonationItems=new ArrayList<>();;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.donation_fragment , container, false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.fragment_donation);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();

        return inflater.inflate(R.layout.donation_fragment, container, false);
    }


    public void updateUI(){
        mAdapter = new DonationAdapter(getContext(), mDonationItems);
        mRecyclerView.setAdapter(mAdapter);
    }

    public void dummyData(){

//        Donation donation = new Donation();
    }

}
