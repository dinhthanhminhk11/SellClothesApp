package com.example.sellclothesapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sellclothesapp.MainActivity;
import com.example.sellclothesapp.dao.Controller;
import com.example.sellclothesapp.databinding.ActivityLoginBinding;
import com.example.sellclothesapp.model.User;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.email.setText("dinhthanhminhk11@gmail.com");
        binding.password.setText("123456");
        controller = new Controller(this);
        binding.btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        binding.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        binding.forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Tính năng đang phát triển", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void login() {
        if (binding.email.getText().toString().isEmpty() || binding.email.getText().toString() == null) {
            Toast.makeText(this, "Chưa nhập email", Toast.LENGTH_SHORT).show();
            return;
        } else if (binding.password.getText().toString().isEmpty() || binding.password.getText().toString() == null) {
            Toast.makeText(this, "Chưa nhập mật khẩu", Toast.LENGTH_SHORT).show();
            return;
        } else {
            User user = controller.getUserLogin(binding.email.getText().toString(), binding.password.getText().toString());
            if (binding.email.getText().toString().equals(user.getEmail()) && binding.password.getText().toString().equals(user.getPassword())) {
                User user1 = User.getInstance();
                user1.setName(user.getName());
                user1.setEmail(user.getEmail());
                user1.setPhone(user.getPhone());
                user1.setAddress(user.getAddress());
                user1.setId(user.getId());
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Tài khoản hoặc mật khẩu không chính xác", Toast.LENGTH_SHORT).show();
            }
        }
    }

}