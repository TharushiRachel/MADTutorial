package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
        Log.i("Lifecycle",  "On  create called");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle" ,"On  started called" );
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle" , "On  resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle" , "on Pause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle" , "on Stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle" , "on Destroy called");
    }


}