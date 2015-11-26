package br.edu.ifpb.sct;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SCTOpenHelper extends SQLiteOpenHelper {
	
	private static final String Nome_BD = "SNCT";	
	private static final int Versao_BD = 1;

	public static final String TB_AVALIACAO = "TB_AVALIACAO";
	public static final String ID = "ID";
	public static final String NOME_AVALIADOR = "NOME_AVALIADOR";
	public static final String TITULO_TRABALHO = "TITULO_TRABALHO";
	public static final String NOTA = "NOTA";
	public static final String COMENTARIO = "COMENTARIO";
	public SCTOpenHelper(Context ctx) {
		super(ctx, Nome_BD, null, Versao_BD);
	}		

	Int cont;

	@Override
	public void onCreate(SQLiteDatabase bd) {
		bd.execSQL(
				" CREATE TABLE " + TB_AVALIACAO
						+ " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
						+ NOME_AVALIADOR + " TEXT NOT NULL," +
						TITULO_TRABALHO + " TEXT NOT NULL," +
						NOTA + " INTEGER," +
						COMENTARIO + " TEXT NOT NULL)"
		);
	}

	@Override
	public void onUpgrade(SQLiteDatabase bd, Int ID2, String NOME_AVALIADOR2,String TITULO_TRABALHO2,int NOTA2, String COMENTARIO2) {
		bd.execSQL(
				"INSERT INTO" + TB_AVALIACAO +"" + "("
						+NOME_AVALIADOR+","
						+TITULO_TRABALHO+","
						+ NOTA + ","
						+ COMENTARIO + ")"
				        + " VALUES (" +
						NOME_AVALIADOR2 +","
						+ TITULO_TRABALHO2 +","
						+ NOTA2 +","
						+ COMENTARIO2 +");"
		);
		cont = cont+1;
	}

	public void onSearch(SQLiteDatabase bd, Int ID2, String NOME_AVALIADOR2,String TITULO_TRABALHO2,int NOTA2, String COMENTARIO2) {
		Notification notifica = new Notification();
		notifica.onClick(cont);
	}

}
