package br.com.xti.exercicios;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variaveis

		int funcionarios = 0;
		float salarios = 0,totalSalario = 0;
		int contador;
		float media = 0;
		
		// Mensagem solicitando qnt func
		funcionarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos funcion�rios h� na empresa",
				"Numero de Funcion�rios", JOptionPane.QUESTION_MESSAGE));
		if (funcionarios == 0) {
			System.out.println("A empresa n�o possui funcion�rios!");
		} else {
			for (contador = 0; contador < funcionarios; contador++) {
				salarios = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salario do " + (contador + 1) + "� funcion�rio:","Sal�rio Funcion�rio", JOptionPane.QUESTION_MESSAGE));
				totalSalario += salarios;
			}
			media = totalSalario / funcionarios;
			System.out.println("M�dia salarial = "+media);
			
			System.exit(0);
		}
	}

}
