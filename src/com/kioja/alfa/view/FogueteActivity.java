package com.kioja.alfa.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;

import com.kioja.alfa.R;



public class FogueteActivity extends Activity {


	ImageView fundo;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kioja);
	
		
		fundo = (ImageView) findViewById(R.id.fundo);
		
		fundo.setImageDrawable(getResources().getDrawable(
				R.drawable.logo));

	}


	@Override
	public void onResume() {
		super.onResume();
	
	}



}