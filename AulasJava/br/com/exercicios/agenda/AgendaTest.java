package br.com.exercicios.agenda;

import java.util.Scanner;

public class AgendaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda a1 = new Agenda();
		
		/*
		 * a1.armazenaPessoa("isaque", 23, 1.71); a1.armazenaPessoa("João", 25,
		 * 1.80);
		 * 
		 * a1.quantidadePessoas(); int a = a1.buscaPessoa("João");
		 * System.out.println(a+1);
		 * 
		 * a1.imprimePessoa(1); a1.imprimeAgenda();
		 * 
		 * a1.quantidadePessoas(); a1.removePessoa("isaque");
		 * a1.quantidadePessoas();
		 * 
		 * a1.armazenaPessoa("lucas", 23, 1.70); a1.quantidadePessoas();
		 * a1.imprimePessoa(1);
		 */
		
		int escolha;
		boolean continua = true;
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("Escolha uma Opção.");
			System.out.println(
					"1= Cadastrar Pessoa\n2= Buscar Pessoa\n3= Exibir Pessoa\n4= Remover Pessoa\n5= Exibir Agenda\n\n");
			int x = s.nextInt();
			switch (x) {
			case 1:
				s.nextLine();
				System.out.println("Nome: ");
				String nome1 = s.nextLine();
				System.out.println("Idade: ");
				int idade1 = s.nextInt();
				s.nextLine();
				System.out.println("Altura: ");
				String altura = s.nextLine();
				double altura1 = Double.parseDouble(altura);
				a1.armazenaPessoa(nome1, idade1, altura1);
				System.out.println("\n\n");
				break;
			case 2:
				System.out.println("Nome do Contato: ");
				s.nextLine();
				nome1 = s.nextLine();
				int a = a1.buscaPessoa(nome1);
				System.out.println("Posição na Agenda: " + (a+1) + "\n");
				break;
			case 3:
				System.out.println("Indice do Contato: ");
				int i = s.nextInt();
				i--;
				a1.imprimePessoa(i);
				break;
			case 4:
				nome1 = s.nextLine();
				a1.removePessoa(nome1);
				break;
			case 5:
				a1.imprimeAgenda();
				break;
			default:
				System.out.println("Valor incorreto!!");
				continua = false;
				break;
			}
		}while(continua);
		

	}

}