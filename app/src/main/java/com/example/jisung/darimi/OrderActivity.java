package com.example.jisung.darimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;

public class OrderActivity extends AppCompatActivity {

    Intent intent;
    TabHost tabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        tabhost =(TabHost)findViewById(R.id.tabhost1);
        tabhost.setup();

        tabhost.addTab(tabhost.newTabSpec("A").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                return view;
            }
        }).setIndicator("상의"));
        tabhost.addTab(tabhost.newTabSpec("B").setContent(new TabHost.TabContentFactory() {

            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(OrderActivity.this,R.layout.tab_1_layout,null);
                return view;
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
    public void onClick(View v){
        if(v.getId()==R.id.comp){
            intent = new Intent(this,SearchActivity.class);
            startActivity(intent);
        }

    }
}
