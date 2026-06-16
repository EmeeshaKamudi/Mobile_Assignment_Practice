package com.nibm.mad_assignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a, container, false);

        Button btnGoToB = view.findViewById(R.id.btnGoToFragmentB);
        btnGoToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Lesson3Activity) requireActivity()).showFragmentB();
            }
        });

        return view;
    }
}