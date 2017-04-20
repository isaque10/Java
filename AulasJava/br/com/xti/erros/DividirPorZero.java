package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorZero {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		do{
			try{
				System.out.print("Digite um numero: ");
				int a = s.nextInt();
				System.out.print("Digite um numero: ");
				int b = s.nextInt();
				
				System.out.println(a/b);
				continua = false;
			}
			catch(ArithmeticException e1){
				System.out.println("Diviso não pode ser zero.");
				s.nextLine();
			}
			catch(InputMismatchException e2){
				System.out.println("Apenas numeros inteiros.");
				s.nextLine();
			}
			
		}while(continua);
		
		
	}

}
