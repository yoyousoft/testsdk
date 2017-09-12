package com.tyfocg.app.main.testsdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.tyfocg.app.main.sdk.TestSdkString;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, TestSdkString.getString(), Toast.LENGTH_SHORT).show();
    }
}
