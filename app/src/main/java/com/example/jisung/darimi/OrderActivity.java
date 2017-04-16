package com.example.jisung.darimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    Intent intent;
    TabHost tabhost;
    TextView t1,t2,t3,t4,sum;
    ImageButton i1,i2;
    String text_set1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        init();
        tabhost =(TabHost)findViewById(R.id.tabhost1);
        tabhost.setup();

        tabhost.addTab(tabhost.newTabSpec("A").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                i1 = (ImageButton)view.findViewById(R.id.i1);
                return view;//첫번째 item 만
            }
        }).setIndicator("상의"));
        tabhost.addTab(tabhost.newTabSpec("B").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_2_layout,null);
                i2 = (ImageButton)view.findViewById(R.id.jean);
                return view;//두번째 tab에선 3번째 item만
            }
        }).setIndicator("하의"));
        tabhost.addTab(tabhost.newTabSpec("C").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                return view;
            }
        }).setIndicator("겉옷"));
        tabhost.addTab(tabhost.newTabSpec("D").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                return view;
            }
        }).setIndicator("정장"));
        tabhost.addTab(tabhost.newTabSpec("E").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                return view;
            }
        }).setIndicator("명품"));
        tabhost.addTab(tabhost.newTabSpec("F").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                return view;
            }
        }).setIndicator("신발"));
        tabhost.addTab(tabhost.newTabSpec("G").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                return view;
            }
        }).setIndicator("기타"));
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text_set1 = "     셔츠            - 1 +";
                t1.setText(text_set1);
                t1.setVisibility(View.VISIBLE);
                sum.setText("1000원");
            }
        });
//        i2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                text_set1 = "     청바지           - 1 +";
//                t2.setText(text_set1);
//                t2.setVisibility(View.VISIBLE);
//                sum.setText("4000원");
//            }
//        });
//이거 에러먹는데?
    }
    void init(){
        text_set1=" ";
        t1 = (TextView)findViewById(R.id.order_t1);
        t2 = (TextView)findViewById(R.id.order_t2);
        t3 = (TextView)findViewById(R.id.order_t3);
        t4 = (TextView)findViewById(R.id.order_t4);
        sum = (TextView)findViewById(R.id.sum_p);

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
            case R.id.order_t1:
                text_set1 =  "     셔츠            - 2 +";
                t1.setText(text_set1);
                sum.setText("2000원");

                //텍스트 뷰 클릭하면 갯수 추가된 문자열로 변경 " 니트  -1+" 에서 "니트  -2+" 이렇게
                //모든 텍스트 뷰 할 필요는 없고 2개 정도만
                break;
            default:
                break;
        }
        if(v.getId()==R.id.comp){
            intent = new Intent(this,SearchActivity.class);
            startActivity(intent);
        }

    }
}
