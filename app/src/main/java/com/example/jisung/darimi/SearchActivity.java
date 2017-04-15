package com.example.jisung.darimi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {


    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        init();

    }

    void init(){

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
                dlg.setView(view).setNeutralButton("완료", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(),"완료되었습니다.",Toast.LENGTH_SHORT)
                            .show();
                }
            }).show();


                break;
            case R.id.comp:
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
