package kr.hnu.test;

import android.view.View;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    //화면 전환되자마자 onCreate함수가 호출된다
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
    public void mOnClick(View v) {
        //액티비티를 종료함 -> main으로 돌아가게됨
        //back-stack에 쌓여있는 화면을 지움
        finish();
    }
}

//매니페스트에 엑티비티를 클래스를 등록해야 보안상의 이유로 사용이 가능하다
