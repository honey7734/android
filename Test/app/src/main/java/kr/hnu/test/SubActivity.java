package kr.hnu.test;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    LinearLayout linear;
    String name;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        linear = (LinearLayout) findViewById(R.id.linear);
        Button button = linear.findViewById(R.id.btnnewmessage);

        Intent intent = getIntent();
        name = intent.getStringExtra("TextIn");

        if (name != null) {
            button.setText(name+" 나와라");
        }

    }
    public void mOnClick(View v) {
        RelativeLayout rel = (RelativeLayout)View.inflate(this, R.layout.message, null);
        ImageView img = (ImageView) rel.findViewById(R.id.messageImg);
        TextView text = rel.findViewById(R.id.content);
        if (linear.getChildCount() % 2 == 0) {
            rel.setBackgroundColor(Color.GRAY);
            img.setImageResource(R.drawable.ellie);
            text.setText(name+2);

        } else {
            rel.setBackgroundColor(Color.RED);
            img.setImageResource(R.drawable.nico);
            text.setText(name+1);
        }
        linear.addView(rel);
    }
}