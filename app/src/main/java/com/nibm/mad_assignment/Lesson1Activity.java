package com.nibm.mad_assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson1Activity extends AppCompatActivity {

    private TextView tvWelcome;
    private EditText etUserInput;
    private Button btnShowToast;
    private ImageView imgDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        tvWelcome    = findViewById(R.id.tvWelcome);
        etUserInput  = findViewById(R.id.etUserInput);
        btnShowToast = findViewById(R.id.btnShowToast);
        imgDisplay   = findViewById(R.id.imgDisplay);

        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = etUserInput.getText().toString().trim();
                if (userText.isEmpty()) {
                    Toast.makeText(Lesson1Activity.this,
                            "Please enter some text first!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Lesson1Activity.this,
                            "Hello, " + userText + "!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}