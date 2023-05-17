package sg.edu.rp.c346.id22023689.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswerInt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswerInt = findViewById(R.id.textViewInteger);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("Value", 0);
        tvAnswerInt.setText("Integer value received is: " + value);

    }
}