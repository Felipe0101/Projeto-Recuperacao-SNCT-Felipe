package br.edu.ifpb.sct;

import java.io.Serializable; 
public class Trabalho implements Serializable { 
private static final long serialVersionUID = 1633833011084400384L; 
int ID;
int NOTA;
String NOME_AVALIADOR;
String TITULO_TRABALHO; 
String COMENTARIO;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getNOTA() {
	return NOTA;
}
public void setNOTA(int nOTA) {
	NOTA = nOTA;
}
public String getNOME_AVALIADOR() {
	return NOME_AVALIADOR;
}
public void setNOME_AVALIADOR(String nOME_AVALIADOR) {
	NOME_AVALIADOR = nOME_AVALIADOR;
}
public String getTITULO_TRABALHO() {
	return TITULO_TRABALHO;
}
public void setTITULO_TRABALHO(String tITULO_TRABALHO) {
	TITULO_TRABALHO = tITULO_TRABALHO;
}
public String getCOMENTARIO() {
	return COMENTARIO;
}
public void setCOMENTARIO(String cOMENTARIO) {
	COMENTARIO = cOMENTARIO;
} 

}
