package com.example.sellclothesapp.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sellclothesapp.databinding.ActivityOrderSuccessBinding;

public class OrderSuccessActivity extends AppCompatActivity {

    private ActivityOrderSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}