package br.com.xti.logica;
import javax.swing.JOptionPane;

/**
* Calcular o IMC quilogramas / altura em metros * alturaem
*IMC = peso em
*/
public class IMC{
	public static void main(String[] args){
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso em Quilograma?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura em Metros?");

		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas/(alturaEmMetros*alturaEmMetros);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do Peso Ideal";
		msg = "IMC = " + imc + "\n" + msg;
		
		
		JOptionPane.showMessageDialog(null, msg);
		
	}

}