package br.com.aprendendo.poo;

public enum Medida{
	
	MM("Milímetro"), CM("Centímetro"), M("Metro");
	//Método para retornar valor correspondente
	public String titulo;
	Medida(String titulo){
		this.titulo = titulo;
	}
}
