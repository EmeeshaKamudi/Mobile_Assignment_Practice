package com.nibm.mad_assignment;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson2ResultActivity extends AppCompatActivity {

    private TextView tvResultName, tvResultEmail, tvResultMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2_result);

        tvResultName   = findViewById(R.id.tvResultName);
        tvResultEmail  = findViewById(R.id.tvResultEmail);
        tvResultMobile = findViewById(R.id.tvResultMobile);

        tvResultName.setText("Name: "   + getIntent().getStringExtra(Lesson2Activity.EXTRA_NAME));
        tvResultEmail.setText("Email: " + getIntent().getStringExtra(Lesson2Activity.EXTRA_EMAIL));
        tvResultMobile.setText("Mobile: "+ getIntent().getStringExtra(Lesson2Activity.EXTRA_MOBILE));
    }
}