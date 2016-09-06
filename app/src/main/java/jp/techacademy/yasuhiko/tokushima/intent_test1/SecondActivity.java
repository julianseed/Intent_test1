package jp.techacademy.yasuhiko.tokushima.intent_test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int value1 = intent.getIntExtra("VALUE1", 0);
        int value2 = intent.getIntExtra("VALUE2", 0);

        TextView textview = (TextView) findViewById(R.id.textView);
        textview.setText(String.valueOf(value1 + value2));
    }
}
