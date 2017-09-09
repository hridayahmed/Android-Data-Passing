package com.hridha.datapassing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Another extends AppCompatActivity {

    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        tv1 = (TextView) findViewById(R.id.textView5);
        tv2 = (TextView) findViewById(R.id.textView6);
        tv3 = (TextView) findViewById(R.id.textView7);

        tv1.setText("Hello "+getIntent().getStringExtra("Name"));
        tv2.setText("Welcome to ANdroid");
        tv3.setText(getIntent().getStringExtra("Description"));
    }
}
