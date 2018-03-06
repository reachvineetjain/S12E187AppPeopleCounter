package com.nehvin.s12e187apppeoplecounter;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.counter);
        mTextView.setText(Integer.toString(counter));

        // Enables Always-on
        setAmbientEnabled();
    }

    public void plusCounter(View view) {

        mTextView.setText(Integer.toString(++counter));

    }

    public void resetCounter(View view) {

        counter = 0;
        mTextView.setText(Integer.toString(counter));

    }
}