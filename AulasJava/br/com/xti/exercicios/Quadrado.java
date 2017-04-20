/**
 * CONCLUIDO
 */

package br.com.xti.exercicios;

import javax.swing.JOptionPane;

public class Quadrado {

	public String entrada() {
		String quadrado = JOptionPane.showInputDialog("Digite o lado do quadrado: ", JOptionPane.QUESTION_MESSAGE);
		return quadrado;
	}

	public double calculaArea(double lado) {
		return lado * lado;
	}

	public double calculaPerimetro(double lado) {
		return 4 * lado;
	}

	public void imprime(double area, double perimetro) {
		JOptionPane.showMessageDialog(null, "Área do quadrado: " + area + "\n" + "Perimetro do quadrado: " + perimetro);
	}
}
