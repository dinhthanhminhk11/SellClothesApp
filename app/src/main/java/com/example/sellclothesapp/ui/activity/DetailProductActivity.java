package com.example.sellclothesapp.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.sellclothesapp.databinding.ActivityDetailProductBinding;
import com.example.sellclothesapp.model.Color;
import com.example.sellclothesapp.model.Size;
import com.example.sellclothesapp.ui.adapter.ColorAdapter;
import com.example.sellclothesapp.ui.adapter.SizeAdapter;

import java.util.ArrayList;
import java.util.List;

public class DetailProductActivity extends AppCompatActivity {

    private ActivityDetailProductBinding binding;
    private List<Color> listColor;
    private List<Size> listSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
    }

    private void initView() {
        listColor = new ArrayList<>();
        listColor.add(new Color(1, -16777216));
        listColor.add(new Color(2, android.graphics.Color.GREEN));
        listColor.add(new Color(3, android.graphics.Color.RED));
        listColor.add(new Color(4, android.graphics.Color.GRAY));
        binding.listColor.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter colorAdapter = new ColorAdapter(listColor);

        binding.listColor.setAdapter(colorAdapter);

        listSize = new ArrayList<>();
        listSize.add(new Size(1 , "S"));
        listSize.add(new Size(2 , "M"));
        listSize.add(new Size(3 , "L"));
        listSize.add(new Size(4 , "XXL"));
        binding.listSize.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL ,false));
        SizeAdapter sizeAdapter = new SizeAdapter(listSize);
        binding.listSize.setAdapter(sizeAdapter);


    }
}