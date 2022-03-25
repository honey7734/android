package kr.hnu.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class HnuSignupActivity extends AppCompatActivity {
    EditText editId, editPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hnu_signup);

        // 타이틀바(액션바) 숨기기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        editId= (EditText) findViewById(R.id.inputId);
        editPw= (EditText) findViewById(R.id.inputPw);
        Account account= (Account) getIntent().getSerializableExtra("AccountIn");
        if(account.getId() != null) {
            editId.setText(account.getId());
        }
        if(account.getPw() != null) {
            editPw.setText(account.getPw());
        }

    }

    public void check(View v){
        Toast.makeText(getApplicationContext(), "Good ID", Toast.LENGTH_SHORT).show();
    }
    public void create(View v){
        Intent intent= new Intent();
        intent.putExtra("AccountOut",
                new Account(editId.getText().toString(), editPw.getText().toString()));
        setResult(RESULT_OK, intent);
        finish();
    }


}
