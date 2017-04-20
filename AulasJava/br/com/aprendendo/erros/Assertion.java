package br.com.aprendendo.erros;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Entre um numero de 0 a 10");
		int numero = s.nextInt();
		
		assert (numero >= 0 && numero <=10) : "Numero inválido " + numero;
		
		System.out.println("Voce entrou " + numero);
	}

}
