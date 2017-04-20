package br.com.xti.heranca;

public class AnimalTest {
	public static void barulho(Animal animal){
		animal.fazerBarulho();
	}
	public static void main(String[] args) {

		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		//toto.dormir();
		//toto.enterrouOsso();
		barulho(toto);
		
		Galinha carijo = new Galinha();
		carijo.peso = 4;
		barulho(carijo);
		//carijo.botar();

		Coruja coruja = new Coruja();
		coruja.peso = 3;
		//coruja.comida = "ND";
		//coruja.voar();
		// avaliar o tipo de objeto
		//System.out.println(toto instanceof Cachorro);
		//System.out.println(toto instanceof Animal);
		//System.out.println(carijo instanceof Ave);

		//System.out.println(toto.equals(coruja));// compara os tipos
		//System.out.println(toto.getClass());// verifica a classe do objeto
		//System.out.println(toto.toString());
		
		

	}

}
