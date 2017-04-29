package com.example.olc.olc_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView view = (TextView) findViewById(R.id.text_score);
        view.setText(getIntent().getStringExtra("SCORE_A"));
    }
}
