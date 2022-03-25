package kr.hnu.test;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class HnuSignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hnu_signup);

        // 타이틀바(액션바) 숨기기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }
}
