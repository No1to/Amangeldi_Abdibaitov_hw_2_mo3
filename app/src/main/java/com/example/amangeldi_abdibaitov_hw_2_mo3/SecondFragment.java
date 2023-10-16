package com.example.amangeldi_abdibaitov_hw_2_mo3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    private TextView tvResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        tvResult = view.findViewById(R.id.tv_result);

        int value = getArguments().getInt("2", 0);
        tvResult.setText(String.valueOf(value));

        return view;
    }
}