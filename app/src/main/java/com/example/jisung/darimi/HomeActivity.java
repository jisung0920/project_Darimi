package com.example.jisung.darimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.orderButton:
                intent = new Intent(this,OrderActivity.class);
                break;
            case R.id.displayButton:
                intent = new Intent(this,displayActivity.class);
                break;
            case R.id.incomeButton:
                intent = new Intent(this,IncomeActivity.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
