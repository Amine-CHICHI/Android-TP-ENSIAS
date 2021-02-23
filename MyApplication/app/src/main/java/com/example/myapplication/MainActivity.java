package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate","Created Called" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart","Start Called" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop","Stop Called" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause","Pause Called" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","Resume Called" );
    }

    @Override
    protected void onDestroy() {
        super.onResume();
        Log.i("onDestroy","Destroy Called" );
    }

    @Override
    protected void onRestart() {
        super.onResume();
        Log.i("onRestart","Restart Called" );
    }
}