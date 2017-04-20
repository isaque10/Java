package br.com.xti.logica;

import java.util.Random;
import javax.swing.JOptionPane;

public class JogoDados {

	public static void main(String[] args) {
		int volta;
		// usuário escolhe um numero do dado
		do {
			JOptionPane.showMessageDialog(null, "*Vamos comecar o Jogo*");
			String escolha1 = /* s.nextLine() */ JOptionPane
					.showInputDialog("Dado 1" + "\nEscolha um numero de 1 a 6:");
			String escolha2 = /* s.nextLine() */ JOptionPane
					.showInputDialog("Dado 2" + "\nEscolha outro numero de 1 a 6:");
			

			int escolha1Numero = Integer.parseInt(escolha1);
			int escolha2Numero = Integer.parseInt(escolha2);

			int somaEscolha = escolha1Numero + escolha2Numero;
			if (escolha1Numero >= 1 && escolha1Numero <= 6 && escolha2Numero >= 1 && escolha2Numero <= 6) {
				// Programa joga o dado

				int[] numeros = { 1, 2, 3, 4, 5, 6 };
				Random r = new Random();
				int indice = r.nextInt(numeros.length);
				int dado1 = numeros[indice];
				Random r1 = new Random();
				int indice1 = r1.nextInt(numeros.length);
				int dado2 = numeros[indice1];

				int somaDado = dado1 + dado2;
				// System.out.println("Numero que saiu no dado= " + dado);

				// Program Informa se usuário acertou ou não
				if (somaDado == somaEscolha) {
					JOptionPane.showMessageDialog(null,
							"Escolha 1 = " + escolha1Numero + "\n" + "Escolha 2 = " + escolha2Numero
									+ "\n_______________\n" + "Dado 1 = " + dado1 + "\n" + "Dado 2 = " + dado2 + "\n"
									+ "A soma dos dados = " + (dado1 + dado2) + "\n" + "Voce acertou!");
					// System.out.println("Voce acertou!");
				} else {
					JOptionPane.showMessageDialog(null,
							"Escolha 1 = " + escolha1Numero + "\n" + "Escolha 2 = " + escolha2Numero
									+ "\n_______________\n" + "Dado 1 = " + dado1 + "\n" + "Dado 2 = " + dado2 + "\n"
									+ "A soma dos dados = " + (dado1 + dado2) + "\n" + "Voce errou!");
					// System.out.println("Voce errou!");

				}
			} else {
				System.out.println("Valor Incorreto!!");
			}
			String voltar = JOptionPane.showInputDialog("Deseja continuar o Jogo: 1-Sim  2-N�o");
			volta = Integer.parseInt(voltar);

		} while (volta == 1);

	}
}