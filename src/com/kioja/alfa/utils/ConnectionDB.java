package com.kioja.alfa.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class ConnectionDB {
	private static final String NOME_BANCO = "ALFABD";
	private static SQLiteDatabase db;
		
	private ConnectionDB(Context ctx) {
		db = ctx.openOrCreateDatabase(NOME_BANCO, Context.MODE_PRIVATE, null);
	}
	
	public static SQLiteDatabase getInstance(Context ctx) {
		if (db == null) {
			new ConnectionDB(ctx);
		}
		return db;
	}
}
