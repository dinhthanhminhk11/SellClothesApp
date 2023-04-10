package com.example.sellclothesapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sellclothesapp.constants.AppConstant;

public class MySqlHelper extends SQLiteOpenHelper {
    public MySqlHelper(Context context) {
        super(context, "database.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table " + AppConstant.TABLE_USER + "(" +
                AppConstant.USER_ID + " integer primary key, " +
                AppConstant.USER_NAME + " text not null," +
                AppConstant.USER_EMAIL + " text not null," +
                AppConstant.USER_PHONE + " text not null," +
                AppConstant.USER_PASSWORD + " text not null," +
                AppConstant.USER_ADDRESS + " text not null" + ")";
        sqLiteDatabase.execSQL(sql);

        sql = "create table " + AppConstant.TABLE_PRODUCT + "(" + AppConstant.PRODUCT_ID + " integer primary key, " + AppConstant.PRODUCT_ID_CATEGORY + " integer not null, " + AppConstant.PRODUCT_NAME + " text not null, " + AppConstant.PRODUCT_COUNT_FEEDBACK + " integer not null, " + AppConstant.PRODUCT_PRICE + " integer not null, " + AppConstant.PRODUCT_COLOR + " text not null, " + AppConstant.PRODUCT_SIZE + " text not null, " + AppConstant.PRODUCT_MORE + " text not null" + ")";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + AppConstant.TABLE_USER);
        onCreate(sqLiteDatabase);
    }
}
