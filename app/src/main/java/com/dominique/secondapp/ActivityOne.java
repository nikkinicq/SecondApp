package com.dominique.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void CallAct1App1 (View view) {
        Intent intent = new Intent ("com.dominique.firstapp.ActivityTwo");
        startActivity(intent);
    }
}
