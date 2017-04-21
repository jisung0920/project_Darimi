package com.example.jisung.darimi;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                Intent registerIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(registerIntent);
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 2000);

    }
}
