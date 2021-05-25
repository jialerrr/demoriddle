package rp.edu.sg.c346.id20021576.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    Button btnRevealQ1;
    TextView tvQ2;
    Button btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1=findViewById(R.id.buttonRevealQ1);
        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ2=findViewById(R.id.buttonRevealQ2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("Question", "Q1");
                intent.putExtra("value", "Queue");
                startActivity(intent);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("Question", "Q2");
                intent.putExtra("value", "Gone");
                startActivity(intent);
            }
        });
    }
}