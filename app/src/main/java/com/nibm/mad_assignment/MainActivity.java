package com.nibm.mad_assignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLesson1, btnLesson2, btnLesson3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLesson1 = findViewById(R.id.btnLesson1);
        btnLesson2 = findViewById(R.id.btnLesson2);
        btnLesson3 = findViewById(R.id.btnLesson3);

        btnLesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lesson1Activity.class));
            }
        });

        btnLesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lesson2Activity.class));
            }
        });

        btnLesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lesson3Activity.class));
            }
        });
    }
}