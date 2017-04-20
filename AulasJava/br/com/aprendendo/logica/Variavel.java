/**
 * Apresentar os conceitos de V·riavel
 * @author Isaque Felix da Silva
 */
package br.com.aprendendo.logica;

public class Variavel {
	
	public static void main(String[] args){
		
		//Vari·vel Primitiva
		//int x = 7;
		
		//Vari·vel de Refer ncia
		String y = "XTI";
		System.out.println(y);
		y = "xti.com.br";
		System.out.println(y);
		
		//Limpar vari·vel
		y = null;
		
		System.out.println(y);
		
		//CONSTANTES
		//final double PI = 3.14159;
		
		//WRAPER
		//Double preco = new Double("12.45");
		//double d = preco.doubleValue();
		//int i = preco.intValue();
		
	}
}
