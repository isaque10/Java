/**
 * Calcular IMC
 * IMC = peso/(altura*altura)
 * @author Isaque Felix da Silva
 */

package br.com.aprendendo.logica;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String peso,altura;
		double pesof,alturaf;
		peso = JOptionPane.showInputDialog("Qual o seu peso em Quilogramas");
		pesof = Double.parseDouble(peso);
		
		altura = JOptionPane.showInputDialog("Qual a sua altura em metros");
		alturaf = Double.parseDouble(altura);
		double imc = pesof/(alturaf*alturaf);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do peso";		
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
