package com.example.sellclothesapp.ui.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.sellclothesapp.R;
import com.example.sellclothesapp.constants.AppConstant;
import com.example.sellclothesapp.databinding.ActivityDetailProductBinding;
import com.example.sellclothesapp.model.Color;
import com.example.sellclothesapp.model.Product;
import com.example.sellclothesapp.model.Size;
import com.example.sellclothesapp.ui.adapter.ColorAdapter;
import com.example.sellclothesapp.ui.adapter.SizeAdapter;

import java.util.ArrayList;
import java.util.List;

public class DetailProductActivity extends AppCompatActivity {
    private boolean isClickSpeed = true;
    private ActivityDetailProductBinding binding;
    private List<Color> listColor;
    private List<Size> listSize;
    private Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        iniData();
        initView();
    }

    private void iniData() {
        product = (Product) getIntent().getSerializableExtra(AppConstant.TABLE_PRODUCT);
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
        listSize.add(new Size(1, "S"));
        listSize.add(new Size(2, "M"));
        listSize.add(new Size(3, "L"));
        listSize.add(new Size(4, "XXL"));

        binding.listSize.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter sizeAdapter = new SizeAdapter(listSize);
        binding.listSize.setAdapter(sizeAdapter);

        binding.name.setText(product.getName());
        binding.price.setText(product.getPrice() + " $");
        binding.more.setText(product.getMore());
        binding.countFeedback.setText(product.getCountFeedback() + " đánh giá");
        RequestOptions options = new RequestOptions().centerCrop().placeholder(R.drawable.img).error(R.drawable.img);
        Glide.with(this).load(product.getImage()).apply(options).dontAnimate().into(binding.image);
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        binding.btnFavor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClickSpeed) {
                    binding.imageFavor.setImageResource(R.drawable.ic_favorite_full);
                    isClickSpeed = false;
                } else {
                    binding.imageFavor.setImageResource(R.drawable.ic_favorite_border_24);
                    isClickSpeed = true;
                }
            }
        });

    }
}