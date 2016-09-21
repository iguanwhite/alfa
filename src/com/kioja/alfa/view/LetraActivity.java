package com.kioja.alfa.view;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

import com.kioja.alfa.R;
import com.kioja.alfa.utils.LetraUtil;
import com.kioja.palavra.Palavra;
import com.kioja.palavra.PalavraRN;

public class LetraActivity extends Activity {

	Palavra a = null, b = null, c = null, d = null;
	ImageView btnLetra, btnAShot, btnBShot, btnCShot, btnDShot, btnA, btnB,
			btnC, btnD, coracao1, coracao2;

	List<Palavra> lAtual, lOutra, lCorretos, lErrados;

	int erro, acerto;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.letra);

		btnLetra = (ImageView) findViewById(R.id.btnLetra);

		Drawable dr = getMyDrawable(getApplicationContext(), LetraUtil
				.getInstance().getCurrentLetra().toLowerCase());
		btnLetra.setImageDrawable(dr);

		btnAShot = (ImageView) findViewById(R.id.btnAShot);
		btnAShot.setVisibility(View.INVISIBLE);
		btnBShot = (ImageView) findViewById(R.id.btnBShot);
		btnBShot.setVisibility(View.INVISIBLE);
		btnCShot = (ImageView) findViewById(R.id.btnCShot);
		btnCShot.setVisibility(View.INVISIBLE);
		btnDShot = (ImageView) findViewById(R.id.btnDShot);
		btnDShot.setVisibility(View.INVISIBLE);

		coracao1 = (ImageView) findViewById(R.id.coracao1);
		coracao2 = (ImageView) findViewById(R.id.coracao2);

		btnA = (ImageView) findViewById(R.id.btnA);
		btnA.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				testeLetra("A");
			}
		});
		btnB = (ImageView) findViewById(R.id.btnB);
		btnB.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				testeLetra("B");
			}
		});
		btnC = (ImageView) findViewById(R.id.btnC);
		btnC.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				testeLetra("C");
			}
		});
		btnD = (ImageView) findViewById(R.id.btnD);
		btnD.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				testeLetra("D");
			}
		});

		gerarAletoriedades();

	}

	Drawable getMyDrawable(Context c, String ImageName) {
		return c.getResources().getDrawable(
				c.getResources().getIdentifier(ImageName, "drawable",
						c.getPackageName()));
	}

	@Override
	public void onResume() {
		super.onResume();

	}

	private void testeLetra(String o) {
		Drawable dr = null;

		if (o.equals("A")) {

			btnAShot.setVisibility(View.VISIBLE);
			if (a.getLetra().equals(LetraUtil.getInstance().getCurrentLetra())) {
				dr = getMyDrawable(getApplicationContext(), "ok");
				btnAShot.setImageDrawable(dr);
				acerto++;

			} else {
				dr = getMyDrawable(getApplicationContext(), "error");
				btnAShot.setImageDrawable(dr);
				erro++;
			}

		} else if (o.equals("B")) {
			btnBShot.setVisibility(View.VISIBLE);
			if (b.getLetra().equals(LetraUtil.getInstance().getCurrentLetra())) {
				dr = getMyDrawable(getApplicationContext(), "ok");
				btnBShot.setImageDrawable(dr);
				acerto++;
			} else {
				dr = getMyDrawable(getApplicationContext(), "error");
				btnBShot.setImageDrawable(dr);
				erro++;
			}

		} else if (o.equals("C")) {

			btnCShot.setVisibility(View.VISIBLE);
			if (c.getLetra().equals(LetraUtil.getInstance().getCurrentLetra())) {
				dr = getMyDrawable(getApplicationContext(), "ok");
				btnCShot.setImageDrawable(dr);
				acerto++;
			} else {
				dr = getMyDrawable(getApplicationContext(), "error");
				btnCShot.setImageDrawable(dr);
				erro++;
			}
		} else if (o.equals("D")) {

			btnDShot.setVisibility(View.VISIBLE);
			if (d.getLetra().equals(LetraUtil.getInstance().getCurrentLetra())) {
				dr = getMyDrawable(getApplicationContext(), "ok");
				btnDShot.setImageDrawable(dr);
				acerto++;
			} else {
				dr = getMyDrawable(getApplicationContext(), "error");
				btnDShot.setImageDrawable(dr);
				erro++;
			}
		}

		if (acerto == 2) {
			// TODO - animacao ganhou.
			finish();
		} else if (erro == 2) {
			// TODO - animacao perdeu.
			coracao1.setVisibility(View.INVISIBLE);
			finish();
		}else if (erro == 1) {
			coracao2.setVisibility(View.INVISIBLE);
		}

	}

	private void gerarAletoriedades() {

		PalavraRN pRN = new PalavraRN(getApplicationContext());

		lAtual = pRN.listarAtual(getApplicationContext());
		lOutra = pRN.listarOutra(getApplicationContext());

		lCorretos = new ArrayList();
		lErrados = new ArrayList();

		// Coletar dois caras da letra escolhida, aletoriamente.

		do {
			Integer randomInt = (int) (3.0 * Math.random());
			// lCorretos.add(lAtual.get(randomInt));

			if (!lCorretos.contains(lAtual.get(randomInt))) {
				lCorretos.add(lAtual.get(randomInt));
			}
		} while (lCorretos.size() < 2);

		// Coletar dois caras do resto do alfabeto, aletoriamente.

		// TODO - Verificar numero total de Palavras - 4 (Letra certa)
		// Atualmante tem 76. Menos 4 da letra escolhida

		do {
			Integer randomInt = (int) (70.0 * Math.random());
			if (!lErrados.contains(lOutra.get(randomInt))) {
				lErrados.add(lOutra.get(randomInt));
			}

		} while (lErrados.size() < 2);

		// Montar possibilidade de posições das figuras a serem aplicadas. (5
		// possibilidades)
		Integer p = (int) (5.0 * Math.random());

		if (p == 0) {
			a = lCorretos.get(0);
			b = lErrados.get(0);
			c = lCorretos.get(1);
			d = lErrados.get(1);
		} else if (p == 1) {
			a = lCorretos.get(0);
			b = lCorretos.get(1);
			c = lErrados.get(0);
			d = lErrados.get(1);
		} else if (p == 2) {
			a = lCorretos.get(0);
			b = lErrados.get(0);
			c = lErrados.get(1);
			d = lCorretos.get(1);
		} else if (p == 3) {
			a = lErrados.get(0);
			b = lCorretos.get(0);
			c = lCorretos.get(1);
			d = lErrados.get(1);
		} else if (p == 4) {
			a = lErrados.get(0);
			b = lCorretos.get(0);
			c = lErrados.get(1);
			d = lCorretos.get(1);
		} else if (p == 4) {
			a = lErrados.get(0);
			b = lErrados.get(1);
			c = lCorretos.get(0);
			d = lCorretos.get(1);
		}

		desenhar();

	}

	private void desenhar() {
		try {
			Drawable ba = getMyDrawable(getApplicationContext(),
					normalize(a.getNome()));
			btnA.setImageDrawable(ba);

			Drawable bb = getMyDrawable(getApplicationContext(),
					normalize(b.getNome()));
			btnB.setImageDrawable(bb);

			Drawable bc = getMyDrawable(getApplicationContext(),
					normalize(c.getNome()));
			btnC.setImageDrawable(bc);

			Drawable bd = getMyDrawable(getApplicationContext(),
					normalize(d.getNome()));
			btnD.setImageDrawable(bd);
		} catch (Exception e) {
			gerarAletoriedades();

		}

	}

	private static final char[] FIRST_CHAR = (" !'#$%&'()*+\\-./0123456789:;<->?@ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			+ "[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ E ,f'.++^%S<O Z  ''''.-"
			+ "-~Ts>o ZY !C#$Y|$'(a<--(_o+23'u .,1o>113?AAAAAAACEEEEIIIIDNOO"
			+ "OOOXOUUUUyTsaaaaaaaceeeeiiiidnooooo/ouuuuyty").toCharArray();
	/** Para a normalização dos caracteres de 32 a 255, segundo caracter */
	private static final char[] SECOND_CHAR = ("  '         ,                                               "
			+ "\\                                   $  r'. + o  E      ''  "
			+ "  M  e     #  =  'C.<  R .-..     ..>424     E E            "
			+ "   E E     hs    e e         h     e e     h ").toCharArray();

	/**
	 * Efetua as seguintes normalizações para obtenção de certificados: -
	 * Elimina acentos e cedilhas dos nomes; - Converte aspas duplas em simples;
	 * - Converte algumas letras estrangeiras para seus equivalentes ASCII (como
	 * ß, convertido para ss) - Põe um "\" antes de vírgulas, permitindo nomes
	 * como "Verisign, Corp." e de "\", permitindo nomes como " a \ b "; -
	 * Converte os sinais de = para - - Alguns caracteres são removidos: -> os
	 * superiores a 255, mesmo que possam ser representados por letras latinas
	 * normais (como s, = U+015E = Latin Capital Letter S With Cedilla); -> os
	 * caracteres de controle (exceto tab, que é trocado por um espaço)
	 * 
	 * @param str
	 *            A string a normalizar.
	 * @return A string normalizada.
	 */
	public static String normalize(String str) {
		char[] chars = str.toCharArray();
		StringBuffer ret = new StringBuffer(chars.length * 2);
		for (int i = 0; i < chars.length; ++i) {
			char aChar = chars[i];
			if (aChar == ' ' || aChar == '\t') {
				ret.append(' '); // convertido para espaço
			} else if (aChar > ' ' && aChar < 256) {
				if (FIRST_CHAR[aChar - ' '] != ' ') {
					ret.append(FIRST_CHAR[aChar - ' ']); // 1 caracter
				}
				if (SECOND_CHAR[aChar - ' '] != ' ') {
					ret.append(SECOND_CHAR[aChar - ' ']); // 2 caracteres
				}
			}
		}

		return ret.toString().toLowerCase();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		finish();
		// if (Integer.valueOf(android.os.Build.VERSION.SDK) < 7 // Instead use
		// // android.os.Build.VERSION.SDK_INT
		// // <
		// // android.os.Build.VERSION_CODES.ECLAIR
		// && keyCode == KeyEvent.KEYCODE_BACK
		// || keyCode == KeyEvent.KEYCODE_HOME
		// && event.getRepeatCount() == 0) {
		// // Take care of calling this method on earlier versions of
		// // the platform where it doesn't exist.
		// onBackPressed();
		// }

		return super.onKeyDown(keyCode, event);
	}

	// @Override
	// public void onBackPressed() {
	// // code here to show dialog
	// return;
	// }

}