package com.kioja.alfa.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;




import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper {
	private static final String NOME_BANCO = "ALFABD";
	private static final int VERSAO_BANCO = 3;

	private Context ctx;
	private static SQLiteDatabase db;

	private static final String CATEGORIA = "alfa";
	private static DataHelper instance;

	private DataHelper(Context ctx) {
		this.ctx = ctx;
		OpenHelper openHelper = new OpenHelper(this.ctx);
		db = openHelper.getWritableDatabase();

		/*
		 * try { copiaBanco(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */

	}

	public static DataHelper getInstance(Context ctx) {
		if (instance == null) {
			instance = new DataHelper(ctx);
		}
		return instance;
	}

	public void fecharConexao() {
		db.close();
	}

	public void copiaBanco() throws IOException {

		AssetManager assetManager = ctx.getResources().getAssets();

		String[] files = assetManager.list("Files");
		String[] str = null;

		for (int i = 0; i < files.length; i++) {
			str[i] = "\n=" + " file=" + " :" + i + "=" + " name=" + "> "
					+ files[i];
		}
		Log.v("len=", "" + files.length);

		try {
			// Abre o arquivo que deve estar na pasta assets
			InputStream is = ctx.getResources().getAssets().open(NOME_BANCO);

			// InputStream is = ctx.getAssets().open(NOME_BANCO);
			// Abre o arquivo do banco vazio ele fica em:
			// /data/data/nome.do.pacote.da.app/databases

			// 2.0
			try {
				final AssetManager assetMgr = ctx.getResources().getAssets();
				is = assetMgr.open("sb/example/simple1.html");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			FileOutputStream fos = new FileOutputStream(
					ctx.getDatabasePath(NOME_BANCO));

			// Copia byte a byte o arquivo do assets para
			// o aparelho/emulador
			byte[] buffer = new byte[1024];
			int read;
			while ((read = is.read(buffer)) > 0) {
				fos.write(buffer, 0, read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static class OpenHelper extends SQLiteOpenHelper {
		OpenHelper(Context ctx) {
			super(ctx, NOME_BANCO, null, VERSAO_BANCO);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			

			db.execSQL("CREATE TABLE TB_PALAVRA (ID_PALAVRA INTEGER, LETRA TEXT(1), NOME TEXT(30))");
			cadastrarDadosTeste(db);
			

			DatabaseUtil.getInstance().setRenew(true);

		}
		
		private void cadastrarDadosTeste(SQLiteDatabase db){
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (1,'A','Abelha')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (2,'A','Árvore')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (3,'A','Astronauta')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (4,'A','Avião')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (5,'B','Balão')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (6,'B','Bicicleta')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (7,'B','Bola')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (8,'B','Borboleta')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (9,'C','Carro')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (10,'C','Cesta')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (11,'C','Circo')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (12,'C','Coelho')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (13,'D','Dado')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (14,'D','Dança')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (15,'D','Dente')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (16,'D','Doce')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (17,'E','Elefante')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (18,'E','Escola')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (19,'E','Espada')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (20,'E','Estátua')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (21,'F','Fábrica')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (22,'F','Família')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (23,'F','Flor')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (24,'F','Formiga')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (25,'G','Gato')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (26,'G','Gelo')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (27,'G','Girassol')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (28,'G','Guitarra')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (29,'H','Hambúrguer')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (30,'H','Helicóptero')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (31,'H','Homem-Aranha')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (32,'H','Hospital')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (33,'I','Igreja')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (34,'I','Ilha')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (35,'I','Índio')");
			//TODO - Falta 1
			
						
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (37,'J','Janela')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (38,'J','Jardineiro')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (39,'J','Jornal')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (40,'J','Jacaré')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (41,'L','Lápis')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (42,'L','Leão')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (43,'L','Livro')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (44,'L','Lua')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (45,'M','Macaco')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (46,'M','Médico')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (47,'M','Melancia')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (48,'M','Moto')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (49,'N','Natação')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (50,'N','Navio')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (51,'N','Noite')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (52,'N','Nuvem')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (53,'P','Palhaço')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (54,'P','Peixe')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (55,'P','Porta')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (56,'P','Princesa')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (57,'Q','Quadra')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (58,'Q','Quarto')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (59,'Q','Queijo')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (60,'Q','Quinze')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (61,'R','Rato')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (62,'R','Régua')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (63,'R','Rosa')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (64,'R','Rua')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (65,'S','Sapato')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (66,'S','Sapo')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (67,'S','Sol')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (68,'S','Suco')");
		
				
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (69,'T','Tartaruga')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (70,'T','Televisão')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (71,'T','Tigre')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (72,'T','Três')");
			
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (73,'U','Uva')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (74,'U','Urso')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (75,'U','Urubu')");
			db.execSQL("INSERT INTO TB_PALAVRA VALUES (76,'U','Universo')");
			
			//TODO - V para frente
			
			
			
			
			
			
			
			//db.execSQL("INSERT INTO TB_CONFIGURACAO VALUES (1,'http','192.168.1.109','8084','sincro','')");
			
			
			
		
			
		}
	
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			Log.w(CATEGORIA,
					"Atualizando banco de dados!!! As tabelas serão deletadas e recriadas.");

			db.execSQL("DROP TABLE IF EXISTS TB_PALAVRA");
		//	db.execSQL("DROP TABLE IF EXISTS TB_CONFIGURACAO");
			
	
			onCreate(db);

		}
	}

}
