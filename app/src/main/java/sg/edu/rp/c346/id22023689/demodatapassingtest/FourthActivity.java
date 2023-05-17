package sg.edu.rp.c346.id22023689.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView textViewDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        textViewDouble = findViewById(R.id.textViewDouble);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("Value", 99.99);
        textViewDouble.setText("Double value received is: " + value);


    }
}