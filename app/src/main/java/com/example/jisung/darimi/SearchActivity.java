package com.example.jisung.darimi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    ArrayList<String> data = new ArrayList<String>();
    ListView listview;
    ArrayAdapter<String> adapter;
    Intent intent;
    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        init();
        data.add("강동원                   01058493495");
        data.add("권영훈                   01052345445");
        data.add("김동규                   01056456245");
        data.add("남정훈                   01045634655");
        data.add("문제웅                   01058493495");
        data.add("배상진                   01058493495");
        data.add("백수민                   01012346856");
        data.add("서그림                   01058493495");
        data.add("서수민                   01058493495");
        data.add("송요한                   01058493495");
        data.add("정지성                   01078684561");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,data);
        listview.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listview.setAdapter(adapter);
        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String search = s.toString();
                if(search.length() >0)
                    listview.setFilterText(search);//리스트 뷰 내에서 검색 - 데이터 상이 아니다.
                else
                    listview.clearTextFilter();

            }
        });

    }

    void init(){
        listview =(ListView)findViewById(R.id.listView);
        e1 = (EditText)findViewById(R.id.e1);
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
            case R.id.regit:
                View view = View.inflate(this,R.layout.add_box,null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                b1 = (Button)view.findViewById(R.id.confirmButton);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SearchActivity.this, "등록 되었습니다.", Toast.LENGTH_SHORT).show();
                        Intent intet = new Intent(getApplicationContext(),SearchActivity.class);
                        startActivity(intet);
                    }
                });
                dlg.setView(view).show();


                break;
            case R.id.comp:
                intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
