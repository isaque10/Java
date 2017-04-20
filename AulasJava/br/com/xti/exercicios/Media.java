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
		funcionarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos funcionários há na empresa",
				"Numero de Funcionários", JOptionPane.QUESTION_MESSAGE));
		if (funcionarios == 0) {
			System.out.println("A empresa não possui funcionários!");
		} else {
			for (contador = 0; contador < funcionarios; contador++) {
				salarios = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salario do " + (contador + 1) + "º funcionário:","Salário Funcionário", JOptionPane.QUESTION_MESSAGE));
				totalSalario += salarios;
			}
			media = totalSalario / funcionarios;
			System.out.println("Média salarial = "+media);
			
			System.exit(0);
		}
	}

}
