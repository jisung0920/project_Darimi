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
    ImageButton send_b,del_I;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        send_b = (ImageButton)findViewById(R.id.sendMsg);
        del_I = (ImageButton)findViewById(R.id.del_I);
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
                send_b.setImageResource(R.drawable.list6);
                //send_b.setImageResource(R,id); 문자발송 체크 표시된 이미지로 바꾸기
                break;
            case R.id.del_I:
                Toast.makeText(this, "수령 완료되었습니다.", Toast.LENGTH_SHORT).show();
                del_I.setVisibility(View.GONE);
                break;
            default:
                intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
                break;
        }
    }
}
