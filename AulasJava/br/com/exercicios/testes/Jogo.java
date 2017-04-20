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
				System.out.println("O n�mero que voc� digitou � maior." + "\nTente novamente");
				escolha = Integer.parseInt(s.nextLine());
				total++;
			}
			else if(escolha < num){
				System.out.println("O numero que voc� digitou � menor." + "\nTente novamente");
				escolha = Integer.parseInt(s.nextLine());
				total++;
			}
			else{
				System.out.println("Voc� acertou em " + total + " tentativas!!" + "\nO n�mero � " + num);
				correto = false;
			}
		}
	}

}
