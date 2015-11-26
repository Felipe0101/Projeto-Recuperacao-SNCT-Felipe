package br.edu.ifpb.sct;

import br.edu.ifpb.sct.SCTOpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SCTDAO {
	private SCTOpenHelper helper;
	
	public void SCTOpenHelper(Context ctx){
		
		helper = new SCTOpenHelper(ctx);
	}
	
	public void inserir(Trabalho trabalho){
		
		SQLiteDatabase bancodedados = helper.getWritableDatabase();
		
		ContentValues vlr = new ContentValues();
		
		vlr.put(SCTOpenHelper.NOME_AVALIADOR,trabalho.getNOME_AVALIADOR());
		
		vlr.put(SCTOpenHelper.TITULO_TRABALHO,trabalho.getTITULO_TRABALHO());
		
		vlr.put(SCTOpenHelper.ID,trabalho.getID());
		
		vlr.put(SCTOpenHelper.NOTA,trabalho.getNOTA());
		
		vlr.put(SCTOpenHelper.COMENTARIO,trabalho.getCOMENTARIO());
		
		bancodedados.insert(SCTOpenHelper.TB_AVALIACAO, null, vlr);
		
		bancodedados.close();
		
	}
}
