package br.com.xti.poo;

public class Motor {
	
	String tipo;
	int potencia;
	/*CONSTRUTOR VAZIO*/
	public Motor(){
		
	}	
	
	/*CONSTRUTOR COM PARAMETROS*/
	public Motor(String tipo, int potencia){
		this.potencia = potencia;
		this.tipo = tipo;	
	}
}
