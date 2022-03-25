package kr.hnu.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class HnuMainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> activityResultLauncher;
    String id,pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hnumain);

        // 타이틀바(액션바) 숨기기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                result-> { if(result.getResultCode() == RESULT_OK) {
                Account account= (Account) result.getData().getSerializableExtra("AccountOut");
                id = account.getId();
                pw = account.getPw();

            }
        });
    }

    // 로그인버튼 글릭
    public void login(View v) {
        Toast.makeText(getApplicationContext(), "잘못 입력하였습니다.", Toast.LENGTH_SHORT).show();
    }

    public void signUp(View v) {
        Intent intent = new Intent(this, HnuSignupActivity.class);
        intent.putExtra("AccountIn", new Account(id, pw));
        activityResultLauncher.launch(intent);

    }
}
