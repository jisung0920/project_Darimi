package com.example.jisung.darimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

public class IncomeActivity extends AppCompatActivity {

    Intent intent;
    TextView t1,t2,t3,t4,t5,t6;
    CalendarView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        init();
//        c1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                t1.setVisibility(View.VISIBLE);
//                t2.setVisibility(View.VISIBLE);
//                t3.setVisibility(View.VISIBLE);
//                t4.setVisibility(View.VISIBLE);
//                t5.setVisibility(View.VISIBLE);
//                t6.setVisibility(View.VISIBLE);
//                return false;
//            }
//        });
//달력 터치하면 textview visible되게
    }
    void init(){
        c1 = (CalendarView)findViewById(R.id.cal);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        t3 = (TextView)findViewById(R.id.t3);
        t4 = (TextView)findViewById(R.id.t4);
        t5 = (TextView)findViewById(R.id.t5);
        t6 = (TextView)findViewById(R.id.t6);

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
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }

}
