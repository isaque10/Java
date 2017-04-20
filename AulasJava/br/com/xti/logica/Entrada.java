package br.com.xti.logica;
//pacote para solicitar ao usuário import java.util.Scanner;

//pacote para interagir com o usuário
import javax.swing.JOptionPane;



public class Entrada{
	
	
	public static void main(String[] args){
		//Chamada do programa
		//System.out.println(args[0]);
		
		//Interagindo com o usuario
		//Scanner s = new Scanner (System.in);
		//System.out.println("Qual o seu nome?");
		//String nome = s.nextLine();
		//System.out.println("Bem Vindo " + nome);
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, nome);
	}
}