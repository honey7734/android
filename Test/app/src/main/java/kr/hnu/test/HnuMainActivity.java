package kr.hnu.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class HnuMainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> activityResultLauncher;

    // 입력한 id,pw
    TextView textId ;
    TextView textPw ;

    // 전달받은 id,pw
    String intentId,intentPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hnumain);

        // 타이틀바(액션바) 숨기기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        textId = (TextView) findViewById(R.id.id);
        textPw = (TextView) findViewById(R.id.pw);

        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                result-> { if(result.getResultCode() == RESULT_OK) {
                Account account= (Account) result.getData().getSerializableExtra("AccountOut");
                intentId = account.getId();
                intentPw = account.getPw();

            }
        });

    }

    // 로그인버튼 글릭

    public void login(View v) {
        String id = textId.getText().toString();
        String pw = textPw.getText().toString();
        if(id.equals(intentId) && pw.equals(intentPw)){
            //Toast.makeText(getApplicationContext(), "로그인 되었습니다", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, HnuMailActivity.class);
            startActivity(intent);

        }else{
            Toast.makeText(getApplicationContext(), "잘못 입력하였습니다.", Toast.LENGTH_SHORT).show();
        }

    }



    public void signUp(View v) {
        Intent intent = new Intent(this, HnuSignupActivity.class);
        intent.putExtra("AccountIn",
                new Account(textId.getText().toString(), textPw.getText().toString()));
        activityResultLauncher.launch(intent);

    }
}
