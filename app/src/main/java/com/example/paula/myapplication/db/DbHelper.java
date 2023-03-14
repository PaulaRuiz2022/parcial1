package com.example.paula.myapplication.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NOMBRE = "agenda.db";
    public static final String TABLE_CONTACTOS ="t_contactos";


    public DbHelper(@Nullable Context context){
        super(context, DATABASE_NOMBRE, factory null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqliteDatabase){

        sqliteDatabase.exeSQL("CREATE TABLE"+ TABLE_CONTACTOS + "("+
                = Nombre TEXT NOT NULL," +
                = Edad INTEGER,"+
                = Ciudad TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase)
}
