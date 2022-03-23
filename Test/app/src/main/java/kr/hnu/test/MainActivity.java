package kr.hnu.test;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eId;
    ActivityResultLauncher<Intent> activityResultLauncher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eId = (EditText) findViewById(R.id.inputID);

    }

    public void login(View v) {
        /*
        //로그인 메세지 띄우기
        EditText edit = (EditText) findViewById(R.id.inputID);
        String str = "ID:"+ edit.getText().toString() + "\n";
        edit = (EditText) findViewById(R.id.inputPw);
        str += "password:" + edit.getText().toString();
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
       */

        //화면 전환(이름 id전송)

        Intent intent = new Intent(this, SubActivity.class);
        //mId의 문자열을 TextIn이라는 이름으로 읽어와 인텐트에 저장
        intent.putExtra("TextIn", eId.getText().toString());
        startActivity(intent);



    }

}