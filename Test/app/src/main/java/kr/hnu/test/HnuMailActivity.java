package kr.hnu.test;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HnuMailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hnu_mail);

        // 액션바 숨김처리
        // 액션바 글자색상을 변경하는 법은?
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }

}