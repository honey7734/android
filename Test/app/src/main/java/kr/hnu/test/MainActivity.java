package kr.hnu.test;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editId;
    ActivityResultLauncher<Intent> activityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editId = (EditText) findViewById(R.id.inputID);

    }

    public void login(View v) {
        Intent intent = new Intent(this, SubActivity.class);
        intent.putExtra("TextIn", editId.getText().toString());
        startActivity(intent);
    }

}