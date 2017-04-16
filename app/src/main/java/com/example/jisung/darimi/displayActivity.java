package com.example.jisung.darimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class displayActivity extends AppCompatActivity {

    Intent intent;
    ImageButton send_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        send_b = (ImageButton)findViewById(R.id.sendMsg);
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
            case R.id.sendMsg:
                Toast.makeText(this, "문자가 전송되었습니다.", Toast.LENGTH_SHORT).show();
                //send_b.setImageResource(); 문자발송 체크 표시된 이미지로 바꾸기
                break;
            default:
                intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
                break;
        }
    }
}
