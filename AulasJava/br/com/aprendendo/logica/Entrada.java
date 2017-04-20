/**
 * Entrada de dados
 * @author Isaque Felix da Silva
 */
package br.com.aprendendo.logica;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Interagindo com o usuário
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem vindo " + nome);
		*/
		
		//Painel de entrada
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, nome);
	}

}
