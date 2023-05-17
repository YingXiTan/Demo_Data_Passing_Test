package sg.edu.rp.c346.id22023689.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswerChar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswerChar = findViewById(R.id.textViewCharacter);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("Value", 'A');
        tvAnswerChar.setText("Character value received is: " + value);

    }
}