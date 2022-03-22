package kr.hnu.test;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mText;
    ActivityResultLauncher<Intent> activityResultLauncher;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (TextView) findViewById(R.id.text);
        init();
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.btnedit:
                Intent intent = new Intent(this, SubActivity.class);
                intent.putExtra("TextIn", mText.getText().toString());
                activityResultLauncher.launch(intent);
                break;
        }
    }
    void init() {
        activityResultLauncher = registerForActivityResult(new
                ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK) {
                mText.setText(result.getData().getStringExtra("TextOut"));
            }
        });
    }
}
