package com.example.sangh.midasparactice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sangh.midasparactice.Model.MemoItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MemoItem memoItem = new MemoItem();
    }
}
