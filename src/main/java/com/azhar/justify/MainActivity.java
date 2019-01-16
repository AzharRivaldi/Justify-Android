package com.azhar.justify;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;

import ar.library.justify.JustifiedTextView;

// CREATED BY AZHAR RIVALDI //

public class MainActivity extends AppCompatActivity {

    private JustifiedTextView mJTv, mJTv2, mJTv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJTv=(JustifiedTextView)findViewById(R.id.satu);
        mJTv.setText(getResources().getString(R.string.justify));
        mJTv.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
        mJTv.setLineSpacing(15);
        mJTv.setAlignment(Paint.Align.LEFT);

        mJTv2=(JustifiedTextView)findViewById(R.id.dua);
        mJTv2.setText(getResources().getString(R.string.justify));
        mJTv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
        mJTv2.setLineSpacing(15);
        mJTv2.setBackgroundColor(Color.GREEN);
        mJTv2.setAlignment(Paint.Align.LEFT);

        mJTv3=(JustifiedTextView)findViewById(R.id.tiga);
        mJTv3.setText(getResources().getString(R.string.justify));
        mJTv3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
        mJTv3.setLineSpacing(15);
        mJTv3.setTypeFace(Typeface.createFromAsset(getAssets(),"fonts/salsa_regular.ttf"));
        mJTv3.setAlignment(Paint.Align.LEFT);
    }
}
