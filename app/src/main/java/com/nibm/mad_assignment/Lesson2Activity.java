package com.nibm.mad_assignment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson2Activity extends AppCompatActivity {

    private EditText etName, etEmail, etMobile;
    private Button btnSubmit, btnClear;

    public static final String EXTRA_NAME   = "extra_name";
    public static final String EXTRA_EMAIL  = "extra_email";
    public static final String EXTRA_MOBILE = "extra_mobile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        etName    = findViewById(R.id.etName);
        etEmail   = findViewById(R.id.etEmail);
        etMobile  = findViewById(R.id.etMobile);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear  = findViewById(R.id.btnClear);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateForm()) {
                    Intent intent = new Intent(Lesson2Activity.this, Lesson2ResultActivity.class);
                    intent.putExtra(EXTRA_NAME,   etName.getText().toString().trim());
                    intent.putExtra(EXTRA_EMAIL,  etEmail.getText().toString().trim());
                    intent.putExtra(EXTRA_MOBILE, etMobile.getText().toString().trim());
                    startActivity(intent);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText("");
                etEmail.setText("");
                etMobile.setText("");
                etName.requestFocus();
                Toast.makeText(Lesson2Activity.this, "Form cleared.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean validateForm() {
        String name   = etName.getText().toString().trim();
        String email  = etEmail.getText().toString().trim();
        String mobile = etMobile.getText().toString().trim();

        if (TextUtils.isEmpty(name)) {
            etName.setError("Name is required.");
            etName.requestFocus();
            return false;
        }
        if (name.length() < 2) {
            etName.setError("Name must be at least 2 characters.");
            etName.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(email)) {
            etEmail.setError("Email is required.");
            etEmail.requestFocus();
            return false;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.setError("Enter a valid email address.");
            etEmail.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(mobile)) {
            etMobile.setError("Mobile number is required.");
            etMobile.requestFocus();
            return false;
        }
        if (!mobile.matches("\\d{10}")) {
            etMobile.setError("Enter a valid 10-digit mobile number.");
            etMobile.requestFocus();
            return false;
        }
        return true;
    }
}