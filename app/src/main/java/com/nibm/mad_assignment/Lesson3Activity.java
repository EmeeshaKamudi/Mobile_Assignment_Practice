package com.nibm.mad_assignment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class Lesson3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new FragmentA())
                    .commit();
        }
    }

    public void showFragmentB() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, new FragmentB())
                .addToBackStack(null)
                .commit();
    }

    public void showFragmentA() {
        getSupportFragmentManager().popBackStack();
    }
}