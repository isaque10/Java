/**
 * CONCLUIDO
 */

package br.com.xti.exercicios;

import javax.swing.JOptionPane;

public class PessoaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome",JOptionPane.QUESTION_MESSAGE);
		String idade = JOptionPane.showInputDialog("Quantos anos você tem",JOptionPane.QUESTION_MESSAGE);
		int i = Integer.parseInt(idade);
		String altura = JOptionPane.showInputDialog("Qual a sua altura",JOptionPane.QUESTION_MESSAGE);
		double a = Double.parseDouble(altura);
		p1.setCadastroPessoa(nome, i, a);
		
		JOptionPane.showMessageDialog(null,"Olá "+ nome + " você tem "+ i + " anos\n" + "e " + a +" metros de altura");
	}

}
