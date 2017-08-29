package com.param.unboundservicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPlay = (Button) findViewById(R.id.btnPlay);
        Button btnStop = (Button) findViewById(R.id.btnStop);
        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent myIntent;
        switch (view.getId()) {

            case R.id.btnPlay:
                myIntent = new Intent(MainActivity.this, MyService.class);
                startService(myIntent);
                break;

            case R.id.btnStop:
                 myIntent = new Intent(MainActivity.this, MyService.class);
                stopService(myIntent);
                break;
        }

    }
}
