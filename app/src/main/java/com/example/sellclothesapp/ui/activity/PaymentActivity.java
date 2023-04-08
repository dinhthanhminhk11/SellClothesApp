package com.example.sellclothesapp.ui.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.sellclothesapp.databinding.ActivityPaymentBinding;
import com.example.sellclothesapp.model.Payment;
import com.example.sellclothesapp.ui.adapter.PaymentAdapter;

import java.util.ArrayList;
import java.util.List;

public class PaymentActivity extends AppCompatActivity {

    private List<Payment> listPayment;
    private ActivityPaymentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initToolbar();
        initView();

    }

    private void initToolbar() {
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initView() {
        listPayment = new ArrayList<>();
        listPayment.add(new Payment(1, "Thanh toán nhận hàng"));
        listPayment.add(new Payment(2, "Stripe"));
        listPayment.add(new Payment(3, "MoMo"));
        listPayment.add(new Payment(4, "VISA"));
        binding.listPayment.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        PaymentAdapter paymentAdapter = new PaymentAdapter(listPayment);
        binding.listPayment.setAdapter(paymentAdapter);
    }

}