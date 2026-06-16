package com.nibm.mad_assignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b, container, false);

        Button btnGoToA = view.findViewById(R.id.btnGoToFragmentA);
        btnGoToA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Lesson3Activity) requireActivity()).showFragmentA();
            }
        });

        return view;
    }
}