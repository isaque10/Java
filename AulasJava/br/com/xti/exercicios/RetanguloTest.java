//CONCLUIDO

package br.com.xti.exercicios;

import java.util.Scanner;

public class RetanguloTest {

	public static void main(String[] args) {
		
		Retangulo r = new Retangulo();
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o comprimento do retangulo: ");
		String comprimento = s.nextLine();
		System.out.print("\nDigite a largura do retangulo: ");
		String largura = s.nextLine();
		double comp = Double.parseDouble(comprimento);
		double larg = Double.parseDouble(largura);		
		r.calculaArea(comp, larg);
		r.calculaPerimetro(comp, larg);
		r.imprime();

	}

}
