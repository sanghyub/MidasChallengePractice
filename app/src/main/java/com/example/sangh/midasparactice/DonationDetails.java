package com.example.sangh.midasparactice;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.TextView;

public class DonationDetails extends Activity {

    private TextView dTitle;
    private TextView dContent;
    private TextView dResult;
    private Bitmap dImage;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donation_details);

        dTitle = (TextView)findViewById(R.id.donationTitle);
        dContent = (TextView)findViewById(R.id.donationContent);
        dResult = (TextView)findViewById(R.id.donationResult);

    }
}
