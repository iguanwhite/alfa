package com.kioja.alfa;



import java.util.ArrayList;
import java.util.List;

import com.kioja.alfa.utils.DataHelper;
import com.kioja.alfa.utils.LetraUtil;
import com.kioja.alfa.view.InicioActivity;
import com.kioja.alfa.view.KiojaActivity;


import com.kioja.palavra.Palavra;
import com.kioja.palavra.PalavraRN;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class Alfa1Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    	importarDadosBD();
    	
    	setupHandlerCloseSplash();
    	   }
    
    private void importarDadosBD() {

		// Cria instancia do DataHelper que controla as versoes do banco e suas
		// respectivas tabelas.
		DataHelper.getInstance(this);

		// if (DatabaseUtil.getInstance().isRenew()) {
		// DatabaseUtil.getInstance().popularBanco(this);
		// }

	}
    
    
	private void setupHandlerCloseSplash() {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
			
				 startActivity(new Intent(getApplication(), InicioActivity.class));
				overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
				finish();
				
			}
		};

		new Handler().postDelayed(runnable, 2300);
		
		kioja();
	}
	
	private void kioja(){
		 startActivity(new Intent(getApplication(), KiojaActivity.class));
			overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
		
	}
    
    
    
    
    
    
}