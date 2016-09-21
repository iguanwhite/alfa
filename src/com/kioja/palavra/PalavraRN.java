package com.kioja.palavra;


import java.util.List;

import com.kioja.alfa.utils.DAOFactory;




import android.content.Context;

public class PalavraRN {
	private PalavraDAO palavraDAO;

	public static Context currentCtx;


	public Context getCurrentContext() {
		return currentCtx;
	}

	public PalavraRN(Context ctx) {
		this.palavraDAO = DAOFactory.criarPalavraDAO(ctx);
		currentCtx = ctx;

	}

	public List listar(Context ctx) {
		return this.palavraDAO.listarAtual(ctx);
	}
	
	
	public List<Palavra> listarAtual(Context ctx){
		return this.palavraDAO.listarAtual(ctx);
	}
	
	public List<Palavra> listarOutra(Context ctx){
		return this.palavraDAO.listarOutra(ctx);
	}


	

}