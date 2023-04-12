package com.example.sellclothesapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sellclothesapp.MainActivity;
import com.example.sellclothesapp.dao.Controller;
import com.example.sellclothesapp.databinding.ActivityRegisterBinding;
import com.example.sellclothesapp.model.User;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.name.setText("Minh dinh");
        binding.email.setText("dinhthanhminhk11@gmail.com");
        binding.phone.setText("0375784487");
        binding.password.setText("123456");
        binding.address.setText("Ninh Giang hải dương");
        controller = new Controller(this);
        binding.btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }

    private void register() {
        if (binding.name.getText().toString().isEmpty() || binding.name.getText().toString() == null) {
            Toast.makeText(this, "Chưa nhập họ tên", Toast.LENGTH_SHORT).show();
            return;
        } else if (binding.email.getText().toString().isEmpty() || binding.email.getText().toString() == null) {
            Toast.makeText(this, "Chưa nhập email", Toast.LENGTH_SHORT).show();
            return;
        } else if (binding.phone.getText().toString().isEmpty() || binding.phone.getText().toString() == null) {
            Toast.makeText(this, "Chưa nhập số điện thoại", Toast.LENGTH_SHORT).show();
            return;
        } else if (binding.password.getText().toString().isEmpty() || binding.password.getText().toString() == null) {
            Toast.makeText(this, "Chưa nhập mật khẩu", Toast.LENGTH_SHORT).show();
            return;
        } else if (binding.address.getText().toString().isEmpty() || binding.address.getText().toString() == null) {
            Toast.makeText(this, "Chưa nhập địa chỉ", Toast.LENGTH_SHORT).show();
            return;
        } else {
            User user = new User(0, binding.name.getText().toString(), binding.email.getText().toString(), binding.phone.getText().toString(), binding.password.getText().toString(), binding.address.getText().toString());
            if (controller.registerUser(user)) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                User user1 = User.getInstance();
                user1.setName(user.getName());
                user1.setEmail(user.getEmail());
                user1.setPhone(user.getPhone());
                user1.setAddress(user.getAddress());
                user1.setId(user.getId());
            } else {
                Toast.makeText(this, "Đăng kí thất bại", Toast.LENGTH_SHORT).show();
            }
        }
    }
}