package com.example.paula.myapplication.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class dbContactos extends DbHelper{

    Context context;
    public dbContactos(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarContacto(String nombre, String ciudad, String edad){

        long id= 0;

        try{
        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nombre", nombre);
        values.put("ciudad",ciudad);
        values.put("edad",edad);

        id = db.insert(TABLE_CONTACTOS, null, values);
    }catch (Exception ex){
            ex.toString();
        }
        return id;
    }
}
