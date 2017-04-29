package com.example.olc.olc_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView score;
    Button toAct2;
    int point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score = (TextView) findViewById(R.id.score);
        toAct2 = (Button) findViewById(R.id.toAct2);

        point = Integer.valueOf(score.getText().toString());
        toAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("SCORE_A", Integer.toString(point));
                startActivity(intent);
            }
        });

    }

    public void plus(View v){
        point++;
        score.setText(Integer.toString(point));
    }
}
