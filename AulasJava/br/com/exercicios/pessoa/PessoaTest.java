package br.com.exercicios.pessoa;

import java.util.Scanner;

public class PessoaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		p1.setNome("Isaque");
		p1.setIdade(23);
		p1.setPeso(65);
		p1.setAltura(1.71);
		p1.imprimeDados();
		
		Pessoa p2 = new Pessoa();
		p2.getNome();
		p2.setNome("João");
		p2.getIdade();
		p2.setIdade(33);
		p2.getPeso();
		p2.setPeso(59);
		p2.getAltura();
		p2.setAltura(1.98);
		p2.imprimeDados();
		
		//PESSOA COM ENTRADA DO USUÁRIO
		Pessoa p3 = new Pessoa();
		Scanner s = new Scanner(System.in);
		p3.setNome(s.nextLine());
		p3.setIdade(s.nextInt());
		p3.setPeso(s.nextInt());
		s.nextLine();
		String altura = s.nextLine();
		double a = Double.parseDouble(altura);
		p3.setAltura(a);
		p3.imprimeDados();
	}

}
