package com.example.sellclothesapp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.sellclothesapp.R;
import com.example.sellclothesapp.databinding.ItemProductBinding;
import com.example.sellclothesapp.model.Product;

import java.text.DecimalFormat;
import java.util.List;
import java.util.function.Consumer;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> data;

    private Consumer<Product> consumer;
    private DecimalFormat decimalFormat = new DecimalFormat("#.#");
    private boolean isClickSpeed = true;

    public ProductAdapter(Consumer<Product> consumer, Callback callback) {
        this.consumer = consumer;
        this.callback = callback;
    }

    private Callback callback;

    public void setData(List<Product> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemProductBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int position) {
        Product product = data.get(position);
        if (product != null) {
            RequestOptions options = new RequestOptions().centerCrop().placeholder(R.drawable.img).error(R.drawable.img);
            Glide.with(holder.itemProductBinding.img.getContext()).load(product.getImage()).apply(options).dontAnimate().into(holder.itemProductBinding.img);
            holder.itemProductBinding.countStar.setText(product.getStart() + "");
            holder.itemProductBinding.name.setText(product.getName());
            holder.itemProductBinding.price.setText(decimalFormat.format(product.getPrice()) + " $");
            holder.itemProductBinding.nameCategory.setText(product.getNameCategory());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    consumer.accept(product);
                }
            });

            holder.itemProductBinding.btnFavor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (isClickSpeed) {
                        callback.addBookmark(product.getId());
                        holder.itemProductBinding.imageFavorite.setImageResource(R.drawable.ic_favorite_full);
                        isClickSpeed = false;
                    } else {
                        callback.deleteBookmark(product.getId());
                        holder.itemProductBinding.imageFavorite.setImageResource(R.drawable.ic_favorite_border_24);
                        isClickSpeed = true;
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemProductBinding itemProductBinding;

        public ViewHolder(@NonNull ItemProductBinding biding) {
            super(biding.getRoot());
            itemProductBinding = biding;
        }
    }

    public interface Callback {
        void deleteBookmark(int id);

        void addBookmark(int id);
    }
}
