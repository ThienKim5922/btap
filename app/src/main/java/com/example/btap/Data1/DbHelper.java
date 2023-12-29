package com.example.btap.Data1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

 public DbHelper(Context context){
     super(context,"QLSP",null,1);
 }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String SP = "CREATE TABLE SanPham(MASP INTEGER PRIMARY KEY AUTOINCREMENT, "+
             "TenSP TEXT, GiaTien REAL, Image TEXT)";
     db.execSQL(SP);
     String data = "INSERT INTO TODO VALUES(1, 'Veggie tomato mix', '19000', '@drawable/a')," +
             " (2, 'Fishwith', '29000', '@drawable/b')," +
             "(3, 'Orange', '39000', '@drawable/c')";
     db.execSQL(data);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1) {
            db.execSQL("DROP TABLE IF EXISTS SANPHAM");
            onCreate(db);
        }
    }
}


