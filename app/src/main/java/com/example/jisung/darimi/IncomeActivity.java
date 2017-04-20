package com.example.jisung.darimi;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class IncomeActivity extends AppCompatActivity {

    Intent intent;
    ImageView d1,chart;
    ImageView day,month,year;
    CalendarView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        init();
        c1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                d1.setImageResource(R.drawable.yester);

            }
        });

    }
    void init(){
        c1 = (CalendarView)findViewById(R.id.cal);
        d1 = (ImageView)findViewById(R.id.d1);
        day = (ImageView)findViewById(R.id.day);
        month = (ImageView)findViewById(R.id.month);
        year = (ImageView)findViewById(R.id.year);
        chart = (ImageView)findViewById(R.id.yearchart);

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.b1:
                intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.b2:
                intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.cal:
                break;
            case R.id.day:
                day.setImageResource(R.drawable.day_click);
                month.setImageResource(R.drawable.month_noclick);
                year.setImageResource(R.drawable.year_noclick);
                break;
            case R.id.month:
                day.setImageResource(R.drawable.day_noclick);
                month.setImageResource(R.drawable.month_click);
                year.setImageResource(R.drawable.year_noclick);
                break;
            case R.id.year:
                day.setImageResource(R.drawable.day_noclick);
                month.setImageResource(R.drawable.month_noclick);
                year.setImageResource(R.drawable.year_click);
                d1.setImageResource(R.drawable.yearcon);
                c1.setVisibility(View.INVISIBLE);
                chart.setVisibility(View.VISIBLE);

                break;
            default:
                break;
        }
    }

}
