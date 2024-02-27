package com.parth.slip1q1lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

//Create a Simple Application which shows the Life Cycle of Activity Using Log.d

public class MainActivity extends AppCompatActivity {

    String tag = "Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"In onCreate Event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"In onStart Event");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"In onRestart Event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"In onResume Event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"In onPause Event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"In onStop Event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"In onDestroy Event");
    }
}