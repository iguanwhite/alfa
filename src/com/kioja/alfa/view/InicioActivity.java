package com.kioja.alfa.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView;

import com.kioja.alfa.R;
import com.kioja.alfa.utils.LetraUtil;

public class InicioActivity extends Activity {

	ImageView fundo;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inicio);

		// fundo = (ImageView) findViewById(R.id.fundo);

		ImageView btnA = (ImageView) findViewById(R.id.btnA);
		btnA.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("A");
				acessarLetra();
			}
		});

		ImageView btnB = (ImageView) findViewById(R.id.btnB);
		btnB.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("B");
				acessarLetra();
			}
		});

		ImageView btnC = (ImageView) findViewById(R.id.btnC);
		btnC.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("C");
				acessarLetra();
			}
		});

		ImageView btnD = (ImageView) findViewById(R.id.btnD);
		btnD.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("D");
				acessarLetra();
			}
		});

		ImageView btnE = (ImageView) findViewById(R.id.btnE);
		btnE.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("E");
				acessarLetra();
			}
		});

		ImageView btnF = (ImageView) findViewById(R.id.btnF);
		btnF.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("F");
				acessarLetra();
			}
		});

		ImageView btnG = (ImageView) findViewById(R.id.btnG);
		btnG.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("G");
				acessarLetra();
			}
		});

		ImageView btnH = (ImageView) findViewById(R.id.btnH);
		btnH.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("H");
				acessarLetra();
			}
		});

		ImageView btnI = (ImageView) findViewById(R.id.btnI);
		btnI.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("I");
				acessarLetra();
			}
		});

		ImageView btnJ = (ImageView) findViewById(R.id.btnJ);
		btnJ.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("J");
				acessarLetra();
			}
		});

		ImageView btnK = (ImageView) findViewById(R.id.btnK);
		btnK.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("K");
				acessarLetra();
			}
		});

		ImageView btnL = (ImageView) findViewById(R.id.btnL);
		btnL.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("L");
				acessarLetra();
			}
		});

		ImageView btnM = (ImageView) findViewById(R.id.btnM);
		btnM.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("M");
				acessarLetra();
			}
		});

		ImageView btnN = (ImageView) findViewById(R.id.btnN);
		btnN.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("N");
				acessarLetra();
			}
		});

		ImageView btnO = (ImageView) findViewById(R.id.btnO);
		btnO.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("O");
				acessarLetra();
			}
		});

		ImageView btnP = (ImageView) findViewById(R.id.btnP);
		btnP.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("P");
				acessarLetra();
			}
		});

		ImageView btnQ = (ImageView) findViewById(R.id.btnQ);
		btnQ.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("Q");
				acessarLetra();
			}
		});

		ImageView btnR = (ImageView) findViewById(R.id.btnR);
		btnR.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("R");
				acessarLetra();
			}
		});

		ImageView btnS = (ImageView) findViewById(R.id.btnS);
		btnS.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("S");
				acessarLetra();
			}
		});

		ImageView btnT = (ImageView) findViewById(R.id.btnT);
		btnT.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("T");
				acessarLetra();
			}
		});

		ImageView btnU = (ImageView) findViewById(R.id.btnU);
		btnU.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("U");
				acessarLetra();
			}
		});

		ImageView btnV = (ImageView) findViewById(R.id.btnV);
		btnV.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("V");
				acessarLetra();
			}
		});

		ImageView btnW = (ImageView) findViewById(R.id.btnW);
		btnW.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("W");
				acessarLetra();
			}
		});

		ImageView btnX = (ImageView) findViewById(R.id.btnX);
		btnX.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("X");
				acessarLetra();
			}
		});

		ImageView btnY = (ImageView) findViewById(R.id.btnY);
		btnY.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("Y");
				acessarLetra();
			}
		});

		ImageView btnZ = (ImageView) findViewById(R.id.btnZ);
		btnZ.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				aplicarLetra("Z");
				acessarLetra();
			}
		});

	}

	@Override
	public void onResume() {
		super.onResume();

	}

	// private void acessarSincronismo() {
	// startActivity(new Intent(getApplication(), Sincronismo2Activity.class));
	// overridePendingTransition(android.R.anim.fade_in,
	// android.R.anim.fade_out);
	// finish();
	//
	// }

	private void aplicarLetra(String l) {
		LetraUtil.getInstance().setCurrentLetra(l);
	}

	private void acessarLetra() {

		startActivity(new Intent(getApplication(), LetraActivity.class));
		overridePendingTransition(android.R.anim.fade_in,
				android.R.anim.fade_out);

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (Integer.valueOf(android.os.Build.VERSION.SDK) < 7 // Instead use
																// android.os.Build.VERSION.SDK_INT
																// <
																// android.os.Build.VERSION_CODES.ECLAIR
				&& keyCode == KeyEvent.KEYCODE_BACK
				|| keyCode == KeyEvent.KEYCODE_HOME
				&& event.getRepeatCount() == 0) {
			// Take care of calling this method on earlier versions of
			// the platform where it doesn't exist.
			onBackPressed();
		}

		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onBackPressed() {
		// code here to show dialog
		return;
	}

}