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
        String sql = "create table " + AppConstant.TABLE_USER + "(" + AppConstant.USER_ID + " integer primary key, " + AppConstant.USER_NAME + " text not null," + AppConstant.USER_EMAIL + " text not null," + AppConstant.USER_PHONE + " text not null," + AppConstant.USER_PASSWORD + " text not null," + AppConstant.USER_ADDRESS + " text not null" + ")";
        sqLiteDatabase.execSQL(sql);

        sql = "create table " + AppConstant.TABLE_PRODUCT + "(" +
                AppConstant.PRODUCT_ID + " integer primary key, " +
                AppConstant.PRODUCT_ID_CATEGORY + " integer not null, " +
                AppConstant.PRODUCT_NAME + " text not null, " +
                AppConstant.PRODUCT_COUNT_FEEDBACK + " integer not null, " +
                AppConstant.PRODUCT_PRICE + " integer not null, " +
                AppConstant.PRODUCT_MORE + " text not null , " +
                AppConstant.PRODUCT_IMAGE + " text not null" + ")";
        sqLiteDatabase.execSQL(sql);

// váy là id là 3
        // áo là 1
        // quần là 2
        //đầm là 4
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Cap Sleeves Midi Taffeta Dress' ,23 , 15, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/large/_vqv5804-1680923465.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Cyan Round Collar Raw Vest' ,34 , 54, 'Cyan Round Collar Raw Vest' , 'https://sixdo.vn/images/products/2023/original/_vqv5867-1679884572.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Pink Apricot Blossom Off-shoulder Midi Dress' ,44 , 76, 'Pink Apricot Blossom Off-shoulder Midi Dress' , 'https://sixdo.vn/images/products/2023/original/_vqv6039-1679885900.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Raw Pants 1' ,13 , 32, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/_vqv5844-1679884181.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Yellow Chrysanthemum Mini Dress' ,54 , 54, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/dscf5933say-1675925609-1678953069.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Dark Red Slit Sleeves Midi Woven Dress' ,57 , 65, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq00033-1667552161-1672905224-1675043596.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Notch Lapel Vest (Áo vest)' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2022/original/vnq08495-1663061982.jpg' )";
        sqLiteDatabase.execSQL(sql);

        // đầm

        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Midi Linen Dress (Đầm freesize)' ,23 , 15, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq05219-1679280204.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Black Lily Mini Dress' ,34 , 54, 'Cyan Round Collar Raw Vest' , 'https://sixdo.vn/images/products/2023/original/vnq02631say-1680160163.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Black Lily Puff-sleeves Midi Voile Dress' ,44 , 76, 'Pink Apricot Blossom Off-shoulder Midi Dress' , 'https://sixdo.vn/images/products/2023/original/vnq02499say-1680159961.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Dark Red Lily Midi Brocade Dress' ,13 , 32, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq03468say-1680162273.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Light Pink Lily Cape Midi Brocade Dress' ,54 , 54, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq03345say-1680162066.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Dark Red Lily Mini Brocade Dress' ,57 , 65, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq03394say-1680232673.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Black Check Midi Raw Dress' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i1820say-1679382628.jpg' )";
        sqLiteDatabase.execSQL(sql);


        // áo

        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'White Lily Silk Shirt' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq03198say-1680161633.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Black Lily Sleeveless Top' ,5 , 76, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq03024say-1680161209.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'White Check Bowtie Top' ,54 , 22, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i1951say-1679382707.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Black Pleated Voile Top' ,22 , 65, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2396say-1679459205.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Black Check Bowtie Shirt' ,12 , 43, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2535say-1679384108.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Light Blue Square Neck Raw Top' ,34 , 45, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2630say-1679385049.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Yellow-Green Strappy Raw Top' ,87 , 65, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2605say-1679384822.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'White Butterfly Bowtie Top' ,45 , 76, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq07883-1678170328.jpg' )";
        sqLiteDatabase.execSQL(sql);

        //quần

        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Black Check Raw Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2078say-1679382854.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Light Blue Wide Leg Raw Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2621say-1679385234.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Yellow-Green Wide Leg Raw Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2588say-1679384920.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Black Woven Pants With Belt' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2561say-1679384190.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Black Wide Leg Woven Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/aj2i2337say-1679383458.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Black Raw Trouser' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/vnq06305-1679474798.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Dark Violet Split-front Wide Leg Raw Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/sbt_4029-1677637271.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Dark Violet Flare Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/sbt_4608-1677635584.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Mallard Green Wide Leg Silk Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/_vqv2586-1677641140.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Moss Green Wide Leg Silk Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/_vqv2109-1677639832.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Brick Silk Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/_vqv1903-1677638701.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Nude Wide Leg Raw Pants' ,24 , 34, 'Áo phong nữ chất vải Cottom thoáng mát cao cấp' , 'https://sixdo.vn/images/products/2023/original/_vqv6041-1676683742.jpg' )";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + AppConstant.TABLE_USER);
        onCreate(sqLiteDatabase);
    }
}
