/**
 * Cachorro test
 * @author Isaque
 */
package br.com.aprendendo.poo;

public class CachorroTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criando novo objeto cachorro
		Cachorro pitbull = new Cachorro();
			
		//acessando atributos e ações
		pitbull.raça = "Pit Bull";
		pitbull.tamanho = 40;
		pitbull.latir();
		
		Cachorro viralata = new Cachorro();
		viralata.raça = "Vira-Lata";
		viralata.tamanho = 30;
		viralata.latir();
		
		Cachorro poodle = new Cachorro();
		poodle.peso = 7;
		poodle.raça = "Poodle";
		poodle.tamanho = 35;
		poodle.dormir();
		poodle.latir();		
	}

}
