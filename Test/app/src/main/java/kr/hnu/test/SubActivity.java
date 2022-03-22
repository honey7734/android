package kr.hnu.test;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    EditText mEdit;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        mEdit = (EditText)findViewById(R.id.stredit);
        Intent intent = getIntent();
        String text = intent.getStringExtra("TextIn");
        if (text != null) {
            mEdit.setText(text);
        }
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.btnok:
                Intent intent = new Intent();
                intent.putExtra("TextOut", mEdit.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.btncancel:
                setResult(RESULT_CANCELED);
                finish();
                break;
        }
    }
}