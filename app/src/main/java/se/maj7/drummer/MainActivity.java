package se.maj7.drummer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView btn1 = findViewById(R.id.button1);
        final TextView btn2 = findViewById(R.id.button2);
        final TextView btn3 = findViewById(R.id.button3);
        final TextView btn4 = findViewById(R.id.button4);
        final TextView btn5 = findViewById(R.id.button5);
        final TextView btn6 = findViewById(R.id.button6);
        final TextView btn7 = findViewById(R.id.button7);
        final TextView btn8 = findViewById(R.id.button8);
    }
}
