package kr.hnu.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*    public void mOnClick(View v) {
        EditText edit = (EditText) findViewById(R.id.edit);
        String str = edit.getText().toString();
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
*/
    public void login(View v) {
        EditText edit = (EditText) findViewById(R.id.inputID);
        String str = "ID:"+ edit.getText().toString() + "\n";
        edit = (EditText) findViewById(R.id.inputPw);
        str += "password:" + edit.getText().toString();
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
}