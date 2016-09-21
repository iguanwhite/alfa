package com.kioja.alfa.utils;





import com.kioja.palavra.PalavraDAO;
import com.kioja.palavra.PalavraDAOImpl;

import android.content.Context;

public class DAOFactory {

		
	public static PalavraDAO criarPalavraDAO (Context ctx) {
		PalavraDAOImpl palavraDAO = new PalavraDAOImpl();
		palavraDAO.setDb(ConnectionDB.getInstance(ctx));

		return palavraDAO;
	}
	
	
	
	
	

}