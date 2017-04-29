package com.example.raihanyuwono.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        String messaege = "This is Toast";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, messaege, duration);
        toast.setGravity(Gravity.TOP, 0, 200);
        toast.show();
    }
}
