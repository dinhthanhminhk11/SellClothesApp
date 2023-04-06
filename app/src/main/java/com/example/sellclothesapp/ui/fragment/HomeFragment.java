package com.example.sellclothesapp.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.sellclothesapp.R;
import com.example.sellclothesapp.databinding.FragmentHomeBinding;
import com.example.sellclothesapp.model.Category;
import com.example.sellclothesapp.ui.adapter.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    private List<Category> categoryList;

    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initView() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Tất cả", R.drawable.ic_all_item));
        categoryList.add(new Category(1, "Áo", R.drawable.shirt_sleeveless_svgrepo_com));
        categoryList.add(new Category(1, "Quần", R.drawable.trousers_svgrepo_com));
        categoryList.add(new Category(1, "Váy", R.drawable.dress_svgrepo_com));
        categoryList.add(new Category(1, "Đầm", R.drawable.dress_svgrepo_com__1_));

        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryList);
        binding.listCategoryHomeFragment.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        binding.listCategoryHomeFragment.setAdapter(categoryAdapter);
    }
}