package com.example.sellclothesapp.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.sellclothesapp.constants.AppConstant;
import com.example.sellclothesapp.database.MySqlHelper;
import com.example.sellclothesapp.model.User;

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

}
