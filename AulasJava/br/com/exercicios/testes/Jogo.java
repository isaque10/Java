package br.com.exercicios.testes;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Random rand = new Random();
		boolean correto = true;
		int total = 1, num, escolha;
		num = rand.nextInt(99) + 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Jogo" + "\n Digite um numero de 1 a 100!");
		escolha = Integer.parseInt(s.nextLine());
		
		while(correto){
			if(escolha > num){
				System.out.println("O número que você digitou é maior." + "\nTente novamente");
				escolha = Integer.parseInt(s.nextLine());
				total++;
			}
			else if(escolha < num){
				System.out.println("O numero que você digitou é menor." + "\nTente novamente");
				escolha = Integer.parseInt(s.nextLine());
				total++;
			}
			else{
				System.out.println("Você acertou em " + total + " tentativas!!" + "\nO número é " + num);
				correto = false;
			}
		}
	}

}
