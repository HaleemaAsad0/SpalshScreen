package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        // calling handler to run a Splash Screen for specific time interval
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {

                // creating a new intent
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // starting a new activity.
                startActivity(intent);

                //finishing current activity.
                finish();
            }
        }, 2000);
}
}
