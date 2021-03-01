package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Text = (TextView) this.findViewById(R.id.textView_newAccount);
        Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClick(v);
            }
        });
        Button button = (Button) this.findViewById(R.id.button_Connect);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClick(v);
            }
        });
    }

    public void Popup(String message) {
        String msg = message;

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Do you want to continue");
        alertDialogBuilder.setPositiveButton("Yeap", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void myClick(View v) {
        switch (v.getId()) {
            case R.id.textView_newAccount:
                Popup("Ok You want to create new account");
                break;
            case R.id.button_Connect:
                Popup("Ok You want to Connect");
                break;
        }
    }
}