package br.com.xti.logica;
public class Fibonacci{
	
	public static void main(String[] args){
		//Sequência fibonacci
		
		int numeroEsquerda=0,numeroDireita=1;
		for(int i=0;i<20;i++){
			System.out.print(numeroEsquerda + " ");
			numeroEsquerda = numeroEsquerda+numeroDireita;
			System.out.print(numeroDireita + " ");
			numeroDireita = numeroDireita+numeroEsquerda;
		}
	}
}