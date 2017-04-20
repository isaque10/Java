package br.com.aprendendo.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {
		System.out.println("Numero: ");
		int a = s.nextInt();
		System.out.println("Divisor: ");
		int b = s.nextInt();

		System.out.println(a / b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		do {
			try {
				dividir(s);
				continua = false;
			}
			// multi catch
			/*catch (InputMismatchException | ArithmeticException e1) {
				System.out.println("Numero invalido!!");
				s.nextLine();
			}*/
			
			  catch (InputMismatchException e1) { System.err.println(
			  "Numeros devem ser inteiros"); s.nextLine();
			  
			  } catch (ArithmeticException e2) { System.err.println(
			  "Divisor diferente de zero!!"); s.nextLine(); }
			 

		} while (continua);
	}

}
