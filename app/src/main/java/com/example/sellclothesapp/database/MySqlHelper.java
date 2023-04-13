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
        String sql = "create table " + AppConstant.TABLE_USER + "(" + AppConstant.USER_ID + " integer primary key AUTOINCREMENT, " + AppConstant.USER_NAME + " text not null," + AppConstant.USER_EMAIL + " text not null," + AppConstant.USER_PHONE + " text not null," + AppConstant.USER_PASSWORD + " text not null," + AppConstant.USER_ADDRESS + " text not null" + ")";
        sqLiteDatabase.execSQL(sql);

        sql = "create table " + AppConstant.TABLE_PRODUCT + "(" + AppConstant.PRODUCT_ID + " integer primary key AUTOINCREMENT, " + AppConstant.PRODUCT_ID_CATEGORY + " integer not null, " + AppConstant.PRODUCT_NAME + " text not null, " + AppConstant.PRODUCT_COUNT_FEEDBACK + " integer not null, " + AppConstant.PRODUCT_PRICE + " integer not null, " + AppConstant.PRODUCT_MORE + " text not null , " + AppConstant.PRODUCT_IMAGE + " text not null" + ")";
        sqLiteDatabase.execSQL(sql);

        sql = "create table " + AppConstant.TABLE_BOOKMARK + "(" + AppConstant.BOOKMARK_ID + " integer primary key AUTOINCREMENT, " + AppConstant.BOOKMARK_ID_USER + " integer not null, " + AppConstant.BOOKMARK_ID_PRODUCT + " integer not null" + ")";
        sqLiteDatabase.execSQL(sql);

        sql = "create table " + AppConstant.TABLE_CARD + "(" + AppConstant.CARD_ID + " integer primary key AUTOINCREMENT, " + AppConstant.CARD_ID_USER + " integer not null, " + AppConstant.CARD_ID_PRODUCT + " integer not null," + AppConstant.CARD_SIZE + " integer not null," + AppConstant.CARD_QUALITY + " integer not null" + ")";
        sqLiteDatabase.execSQL(sql);

        sql = "create table " + AppConstant.TABLE_BILL + "(" + AppConstant.BILL_ID + " integer primary key, " + AppConstant.BILL_ID_USER + " integer not null, " + AppConstant.BILL_NAME_USER + " text not null," + AppConstant.BILL_PHONE_USER + " text not null," + AppConstant.BILL_ADDRESS_USER + " text not null," + AppConstant.BILL_PAYMENT + " integer not null," + AppConstant.BILL_PRICE + " integer not null" + ")";
        sqLiteDatabase.execSQL(sql);

        sql = "create table " + AppConstant.TABLE_BILL_INFO + "(" + AppConstant.BILL_INFO_ID + " integer primary key AUTOINCREMENT, " + AppConstant.BILL_INFO_ID_BILL + " integer not null, " + AppConstant.BILL_INFO_ID_USER + " integer not null," + AppConstant.BILL_INFO_ID_PRODUCT + " integer not null," + AppConstant.BILL_INFO_COUNT_PRODUCT + " integer not null" + ")";
        sqLiteDatabase.execSQL(sql);

// váy là id là 3
        // áo là 1
        // quần là 2
        //đầm là 4

        //RIENEVAN
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Hunter Football DSMH02401DOO (Đỏ)' ,23 , 15, 'KHÔNG ÁP DỤNG chung với chương trình giảm giá và quà tặng' , 'https://product.hstatic.net/1000230642/product/dsmh02401doo__3__d507b4f9573043e6a3dc5f7d82d90fb6.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Football Futsal DSMH09100DEN (Đen)' ,34 , 54, 'Mùa Hè trở lại kéo theo bầu không khí thể thao cuồng nhiệt từ những trận cầu đường phố lan tỏa khắp mọi nơi. ' , 'https://product.hstatic.net/1000230642/product/dsmh09100den__3__5213f426dd1140e8a14f5d3f220c0223.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Hunter Football Gen 2K21 Futsal DSMH07300CAM (Cam)' ,44 , 76, 'Lần đầu tiên, giày bóng đá Biti’s Hunter Football dòng đế bằng Futsal được ra mắt, dành riêng cho sân futsal, sân xi măng, sân trong nhà. Đặc biệt, với kiểu dáng trẻ trung, phối màu hiện đại và thời trang, mẫu thiết kế dễ dàng được tận dụng cho cả dịp đi chơi, đi học, đi làm.' , 'https://product.hstatic.net/1000230642/product/dsmh07300cam__3__cf8a73d30e2f4d83ac5d986865a785d5.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Hunter Football DSMH03801XMN (Xanh Mi Nơ)' ,13 , 32, 'KHÔNG ÁP DỤNG chung với chương trình giảm giá và quà tặng. ' , 'Hunter Football DSMH03801XMN (Xanh Mi Nơ)' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Hunter Football DSMH03801XDG (Xanh Dương)' ,54 , 54, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dsmh03801xdg_11c789b396e34801aa6c358df27834e1.png' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Hunter Football DSMH03801CAM (Cam)' ,57 , 65, 'KHÔNG ÁP DỤNG chung với chương trình giảm giá và quà tặng' , 'https://product.hstatic.net/1000230642/product/dsmh03801cam40_2__130f3ae50d8d4661b0ce16b1ae58e3a6.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,3,'Hunter Football DSMH02401VAG (Vàng)' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dsmh02401vag__3__92f53af6c636489bbeba62647625b1da.jpg' )";
        sqLiteDatabase.execSQL(sql);

        // MIDAZ

        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Giày Thể Thao Bé Gái' ,23 , 15, 'Giày Thể Thao Trẻ Em Biti được làm bằng chất liệu cao cấp, mềm mại, an toàn cho sức khỏe và làn da của trẻ, giúp trẻ tha hồ chạy nhảy suốt cả ngày.' , 'https://bitis.com.vn/products/giay-the-thao-be-gai-biti-s-hunter-dsgh00300trg-trang' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Hunter X Marvel Spider-man HSM000998DEN' ,34 , 54, 'Kết nối ý tưởng màu sắc nhân vật bản quyền Spiderman, kết hợp trang trí màng nhện tạo điểm nhấn mạnh mẽ.' , 'https://product.hstatic.net/1000230642/product/hsm000998den__2__02cff8b6f063420d960235e0edee10d7.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Hunter Core HSM000500REU (Rêu)' ,44 , 76, 'Do màn hình và điều kiện ánh sáng khác nhau, màu sắc thực tế của sản phẩm có thể chênh lệch khoảng 3-5%.' ,'https://product.hstatic.net/1000230642/product/hsm000500reu__2__80abe47bede4441782a5b31ef7f83602.jpg')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Hunter Football Futsal DSMH11100DOO (Đỏ)' ,13 , 32, 'Đế cao su tự nhiên mềm với phần đinh bám được thiết kế theo các đường rãnh tạo độ uốn gấp khi di chuyển cùng với độ cao 5mm đảm bảo được độ bám và đầy đủ tính năng cần thiết cho một đôi giày sử dụng trên sàn gỗ, sân xi măng hay trên đường phố.' , 'https://product.hstatic.net/1000230642/product/dsmh11100doo__2__e87eac958f51416ba4c565edce7e07f9.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Hunter Football Futsal DSMH11100XMN (Xanh Mi Nơ)' ,54 , 54, 'Giày Bóng Đá Nam Bitis Hunter Football được ứng dụng với nền tảng công nghệ TrueFit  X, sản phẩm giày đá banh từ Bitis Hunter với cam kết đem lại trải nghiệm vừa vặn nhất với đôi chân. ' , 'https://product.hstatic.net/1000230642/product/dsmh11100xmn__2__5ef7fd899f5849ca916369fe99969992.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Bóng Đá Nam Hunter Football Futsal DSMH11100XNH (Xanh Nhớt)' ,57 , 65, 'Quai da tổng hợp cao cấp chuyên dụng cho giày đá banh với độ dày 1.3mm nhưng vẫn đảm bảo được độ mềm, uốn gấp tạo cảm giác thoải mái và độ bền có khả năng chịu lực cao. ' , 'https://product.hstatic.net/1000230642/product/dsmh11100xnh__2__9229593c95e946bb88125aa241ac9137.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,4,'Hunter Football DSMH09600DOO (Đỏ)' ,24 , 34, 'Rãnh ma sát trên bề mặt giày tang “cảm giác bóng” và tang độ ổn dịnh khi tiếp xúc bóng. ' , 'https://product.hstatic.net/1000230642/product/dsmh09600doo__3__9b2a54007ea34f339f43397cd1fd3c4b.jpg' )";
        sqLiteDatabase.execSQL(sql);


        // Biti’s

        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Giày Thể Thao Bé Gái Biti Hunter DSGH00300TRG (Trắng)' ,24 , 34, 'Giày Thể Thao Trẻ Em Biti được làm bằng chất liệu cao cấp, mềm mại, an toàn cho sức khỏe và làn da của trẻ, giúp trẻ tha hồ chạy nhảy suốt cả ngày' , 'https://product.hstatic.net/1000230642/product/dsgh00300trg__3__da6d825a2420482f96c0bf1659aed9e6.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Giày Thể Thao Nam' ,5 , 76, 'Quá trình sản xuất mỗi đôi giày luôn dư ra lượng vật tư nhất định và không thể tiếp tục được sử dụng' , 'https://product.hstatic.net/1000230642/product/00100cam_da38d34d9e894560851d3e6dddb85501.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Giày Thể Thao Trẻ Em Hunter Street ' ,54 , 22, 'Mẫu dự án Xanh được thiết kế trên vật tư tận dụng. ' , 'https://product.hstatic.net/1000230642/product/rsbh00100den__2__0934cd4e42924d258028edce1a9ef861.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Giày Bóng Đá Nam' ,22 , 65, 'KHÔNG ÁP DỤNG chung với chương trình giảm giá và quà tặng' , 'https://product.hstatic.net/1000230642/product/dsmh03801cam40_2__130f3ae50d8d4661b0ce16b1ae58e3a6.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Giày Thể Thao Nam Biti' ,12 , 43, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dsmh03600__4__635fba02a403477fb8f869446669629e.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Collection Contras Black' ,34 , 45, 'Trả sau lên đến 12 tháng' , 'https://product.hstatic.net/1000230642/product/06700den__3__a713faf8f84e49aaa7fbebc33dac6200.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Giày Thể Thao Nữ' ,87 , 65, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dsuh00502den__2__5653d450a1374c3cac866d66af2f8a98.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,1,'Giày Thể Thao Cao Cấp Nữ' ,45 , 76, 'Do màn hình và điều kiện ánh sáng khác nhau, màu sắc thực tế của sản phẩm có thể chênh lệch khoảng 3-5%' , 'https://product.hstatic.net/1000230642/product/dswh02800hog_24f8045f1e0f4401be8f9411d0bf4572.png' )";
        sqLiteDatabase.execSQL(sql);

        //Ananas

        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Hunter Football DSMH02401CAM (Cam)' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dsmh02401cam__2__af2d98991c454035853ab18f1a302c21.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Giày Bóng Đá Nam Hunter Football DSMH03800DOG (Đồng)' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dsmh03800dog-2_7e8b7a1dbafb43f4a95a5fd22e6161d3_master.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Hunter Football DSMH03800VAG (Vàng)' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dbb010188den__7__6030c4e0064740208ae9595ca5f153f6.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Blush Pink DBW004500HOL (Hồng Lợt)' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dbw004500den__4__343bacc63c674e6b829f318aeb12faa5.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Êmbrace - Ceam White DBW004500KEM (Kem)' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://bitis.com.vn/products/giay-si-bup-be-nu-biti-s-bbw000488kem-kem' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Raven Black DBW004500DEN (Đen)' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://product.hstatic.net/1000230642/product/dsc_0142_391a82dfe181434ebcedc016aee03845.jpg' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'Giày Si Búp Bê Nữ Bits BBW000488KEM (Kem)' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://bitis.com.vn/products/giay-si-bup-be-nu-biti-s-bbw000488vdb-vang-da-bo' )";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO " + AppConstant.TABLE_PRODUCT + " VALUES ( null ,2,'' ,24 , 34, 'Thời gian áp dụng các mã khuyến mãi từ 14h30 ngày 06/04/2023 đến 23h59 ngày 15/04/2023' , 'https://bitis.com.vn/products/giay-si-bup-be-nu-biti-s-bbw000488kem-kem' )";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + AppConstant.TABLE_USER);
        onCreate(sqLiteDatabase);
    }
}
