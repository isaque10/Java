package br.com.xti.exercicios;

import javax.swing.JOptionPane;

public class Porcentagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variaveis

		double valorProduto = 0;
		int codigoAumento = 0;
		double novoValor = 0;
		// mensagem ao usuario

		valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do produto",
				"Valor do Produto", JOptionPane.QUESTION_MESSAGE));
		codigoAumento = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual o codigo de aumento\n1 = 10%\n3 = 25%\n4 = 30%\n8 = 50%",
						"Codigo Aumento", JOptionPane.QUESTION_MESSAGE));
		if (codigoAumento != 1 && codigoAumento != 3 && codigoAumento != 4 &&codigoAumento != 8) {
			JOptionPane.showMessageDialog(null, "Código Incorreto!",null, JOptionPane.ERROR_MESSAGE);
		} else {
			switch (codigoAumento) {
			
			case 1:
				novoValor = valorProduto+(valorProduto*0.1);
				break;
			case 3:
				novoValor = valorProduto+(valorProduto*0.25);
				break;
			case 4:
				novoValor = valorProduto+(valorProduto*0.3);
				break;
			case 8:
				novoValor = valorProduto+(valorProduto*0.5);
				break;
			}
			JOptionPane.showMessageDialog(null, "R$"+ novoValor,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);
		}
	}

}
