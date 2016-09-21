package com.kioja.palavra;

import java.util.ArrayList;
import java.util.List;

import com.kioja.alfa.utils.LetraUtil;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class PalavraDAOImpl implements PalavraDAO {

	private SQLiteDatabase db;
	private static final String NOME_TABELA = "TB_PALAVRA";
	private static final String CATEGORIA = "palavra";


	@Override
	public List<Palavra> listarAtual(Context ctx) {
		try {
			List<Palavra> palavras = new ArrayList<Palavra>();
			Cursor c = db.rawQuery(
					"SELECT * FROM TB_PALAVRA WHERE LETRA = '"+ LetraUtil.getInstance().getCurrentLetra() + "'", null);
			c.getCount();
			
			
			
			if (c.moveToFirst()) {

				int idxIdPalavra = c.getColumnIndex("ID_PALAVRA");
				int idxLetra = c.getColumnIndex("LETRA");
				int idxNome = c.getColumnIndex("NOME");
		
				
				do {

					Palavra palavra = new Palavra();
					
					palavra.setIdPalavra(c.getLong(idxIdPalavra));
					palavra.setLetra(c.getString(idxLetra));
					palavra.setNome(c.getString(idxNome));
					
					palavras.add(palavra);
				} while (c.moveToNext());

			}

			if (c != null && !c.isClosed()) {
				c.close();
			}

			return palavras;
		} catch (SQLException e) {
			Log.e(CATEGORIA, "Erro ao buscar pedidos: " + e.getMessage());
		}

		return null;
	}
	
	@Override
	public List<Palavra> listarOutra(Context ctx) {
		try {
			List<Palavra> palavras = new ArrayList<Palavra>();
			Cursor c = db.rawQuery(
					"SELECT * FROM TB_PALAVRA WHERE LETRA != '"+ LetraUtil.getInstance().getCurrentLetra() + "'", null);
			c.getCount();
			
			
			
			if (c.moveToFirst()) {

				int idxIdPalavra = c.getColumnIndex("ID_PALAVRA");
				int idxLetra = c.getColumnIndex("LETRA");
				int idxNome = c.getColumnIndex("NOME");
		
				
				do {

					Palavra palavra = new Palavra();
					
					palavra.setIdPalavra(c.getLong(idxIdPalavra));
					palavra.setLetra(c.getString(idxLetra));
					palavra.setNome(c.getString(idxNome));
					
					palavras.add(palavra);
				} while (c.moveToNext());

			}

			if (c != null && !c.isClosed()) {
				c.close();
			}

			return palavras;
		} catch (SQLException e) {
			Log.e(CATEGORIA, "Erro ao buscar pedidos: " + e.getMessage());
		}

		return null;
	}



	public SQLiteDatabase getDb() {
		return db;
	}

	public void setDb(SQLiteDatabase db) {
		this.db = db;
	}

}
