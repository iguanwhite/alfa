package com.kioja.palavra;


import java.util.List;

import android.content.Context;

public interface PalavraDAO {
		
	public List<Palavra> listarAtual(Context ctx);
	
	public List<Palavra> listarOutra(Context ctx);
	
}
