package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tp1.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", "Created Called");

        button = (Button) this.findViewById(R.id.envoyer_btn);
        edit = (EditText) this.findViewById(R.id.Name_editText);

        button.setOnClickListener(this);

        if (this.getIntent().getExtras() != null) {
            String s = this.getIntent().getExtras().getString("madonne");
            edit.setText(s);
        }

        Intent data = new Intent();
        data.putExtra("Val", "Bonjour");
        this.setResult(2000, data);
    }

    public void myClick(View v) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("madonne", "Heey Amine");
        startActivityForResult(i, 100);


    }

    @Override
    public void onClick(View v) {
        myClick(v);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 100) {
            if (resultCode == 2000) {
                edit.setText("" + data.getExtras().getString("Val"));
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Start Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "Stop Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "Pause Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "Resume Called");
    }

    @Override
    protected void onDestroy() {
        super.onResume();
        Log.i("onDestroy", "Destroy Called");
    }

    @Override
    protected void onRestart() {
        super.onResume();
        Log.i("onRestart", "Restart Called");
    }


}