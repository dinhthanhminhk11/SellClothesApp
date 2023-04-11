package com.example.sellclothesapp.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.sellclothesapp.constants.AppConstant;
import com.example.sellclothesapp.database.MySqlHelper;
import com.example.sellclothesapp.model.Product;
import com.example.sellclothesapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private MySqlHelper mySqlHelper;
    private SQLiteDatabase sqLiteDatabase;

    public Controller(Context context) {
        mySqlHelper = new MySqlHelper(context);
    }

    public User getUserLogin(String email, String password) {
        this.sqLiteDatabase = mySqlHelper.getReadableDatabase();
        String sql = "select * from " + AppConstant.TABLE_USER + " where " + AppConstant.USER_EMAIL + "=' " + email + "' and " + AppConstant.USER_PASSWORD + "= '" + password + "'";
        Cursor cursor = this.sqLiteDatabase.rawQuery(sql, null);
        User user = new User();
        if (cursor.moveToFirst()) {
            user.setId(Integer.parseInt(cursor.getString(0)));
            user.setName(cursor.getString(1));
            user.setEmail(cursor.getString(2));
            user.setPhone(cursor.getString(3));
            user.setPassword(cursor.getString(4));
            user.setAddress(cursor.getString(5));
        }
        cursor.close();
        this.sqLiteDatabase.close();
        return user;
    }

    public boolean registerUser(User user) {
        this.sqLiteDatabase = mySqlHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AppConstant.USER_NAME, user.getName());
        contentValues.put(AppConstant.USER_EMAIL, user.getEmail());
        contentValues.put(AppConstant.USER_PHONE, user.getPhone());
        contentValues.put(AppConstant.USER_PASSWORD, user.getPassword());
        contentValues.put(AppConstant.USER_ADDRESS, user.getAddress());
        long result = this.sqLiteDatabase.insert(AppConstant.TABLE_USER, null, contentValues);
        return result > 0;
    }

    public List<Product> getAllListProduct() {
        List<Product> list = new ArrayList<Product>();
        this.sqLiteDatabase = mySqlHelper.getReadableDatabase();
        String sql = "select * from " + AppConstant.TABLE_PRODUCT;
        Cursor cursor = this.sqLiteDatabase.rawQuery(sql, null);
        Product product;
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                product = new Product(Integer.parseInt(cursor.getString(0)), cursor.getString(2), Integer.parseInt(cursor.getString(1)) == 1 ? "Áo" : Integer.parseInt(cursor.getString(1)) == 2 ? "Quần" : Integer.parseInt(cursor.getString(1)) == 3 ? "Váy" : "Đầm", cursor.getString(6), cursor.getInt(4), cursor.getInt(3), cursor.getString(5)

                );
                list.add(product);
                cursor.moveToNext();
            }
        }
        cursor.close();
        this.sqLiteDatabase.close();
        return list;
    }

    public List<Product> getListProductByCategory(int id) {
        List<Product> list = new ArrayList<Product>();
        this.sqLiteDatabase = mySqlHelper.getReadableDatabase();
        String sql = "select * from " + AppConstant.TABLE_PRODUCT + " where " + AppConstant.PRODUCT_ID_CATEGORY + " ='" + id + "'";
        Cursor cursor = this.sqLiteDatabase.rawQuery(sql, null);
        Product product;
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                product = new Product(Integer.parseInt(cursor.getString(0)), cursor.getString(2), Integer.parseInt(cursor.getString(1)) == 1 ? "Áo" : Integer.parseInt(cursor.getString(1)) == 2 ? "Quần" : Integer.parseInt(cursor.getString(1)) == 3 ? "Váy" : "Đầm", cursor.getString(6), cursor.getInt(4), cursor.getInt(3), cursor.getString(5));
                list.add(product);
                cursor.moveToNext();
            }
        }
        cursor.close();
        this.sqLiteDatabase.close();
        return list;
    }

}
