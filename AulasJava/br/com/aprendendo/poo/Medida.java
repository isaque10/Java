package br.com.aprendendo.poo;

public enum Medida{
	
	MM("Mil�metro"), CM("Cent�metro"), M("Metro");
	//M�todo para retornar valor correspondente
	public String titulo;
	Medida(String titulo){
		this.titulo = titulo;
	}
}
