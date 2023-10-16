package com.example.amangeldi_abdibaitov_hw_2_mo3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class FirstFragment extends Fragment {

    private TextView tvZero;
    private int count = 0;
    private Button btnPlus1;
    private Button btnMinus1;
    private Button btnNext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
    }

    private void initView() {
        tvZero = requireActivity().findViewById(R.id.tv_zero);
        btnPlus1 = requireActivity().findViewById(R.id.btn_plus);
        btnMinus1 = requireActivity().findViewById(R.id.btn_minus);
        btnNext = requireActivity().findViewById(R.id.btn_next);
    }

    private void initListener() {

        btnPlus1.setOnClickListener(view -> {
            if (view.getId() == R.id.btn_plus) {
                count++;
                tvZero.setText(String.valueOf(count));
            }

        });

        btnMinus1.setOnClickListener(v -> {
            if (v.getId() == R.id.btn_minus){
                count--;
                tvZero.setText(String.valueOf(count));
            }
        });

        btnNext.setOnClickListener(v -> {
            goToNextFragment();
        });
    }

    private void goToNextFragment() {
        btnNext.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putInt("2", count);

            SecondFragment secondFragment= new SecondFragment();
            secondFragment.setArguments(bundle);

            requireActivity().getSupportFragmentManager().beginTransaction().
                    replace(R.id.fragmentContainer,secondFragment).addToBackStack(null).commit();

        });

    }

}
