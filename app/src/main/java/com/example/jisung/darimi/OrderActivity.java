package com.example.jisung.darimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    Intent intent;
    TabHost tabhost;
    int count =0;
    TextView sum;
    ImageButton i1,i2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Log.d("check","init be");
        init();
        Log.d("check","tabhost be");
        tabhost =(TabHost)findViewById(R.id.tabhost1);
        Log.d("check","");
        tabhost.setup();
        Log.d("check","setup be");
        tabhost.addTab(tabhost.newTabSpec("A").setContent(new TabHost.TabContentFactory() {
            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                Log.d("check","i1 init be");
                i1 = (ImageButton)view.findViewById(R.id.i1);
                i2 = (ImageButton)view.findViewById(R.id.i2);
                i1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(count ==0) {
                            img.setImageResource(R.drawable.order2);
                            sum.setText("4000원");
                            count++;
                        }
                        else{
                            img.setImageResource(R.drawable.order3);
                            sum.setText("8000원");
                            count++;
                        }

                    }
                });
                i2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        img.setImageResource(R.drawable.order4);
                        sum.setText("11000원");
                    }
                });
                return view;//첫번째 item 만
            }
        }).setIndicator("상의"));
        tabhost.addTab(tabhost.newTabSpec("B").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_2_layout,null);

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

    }
    void init(){
        img = (ImageView)findViewById(R.id.order_list);
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
            default:
                break;
        }
        if(v.getId()==R.id.comp){
            intent = new Intent(this,SearchActivity.class);
            startActivity(intent);
        }

    }
}
