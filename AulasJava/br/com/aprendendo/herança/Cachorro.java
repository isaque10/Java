package br.com.aprendendo.heran�a;

public class Cachorro extends Animal {

	public Cachorro() {
		super(30, "Carne");
	}

	@Override
	void fazerBarulho() {
		System.out.println("Au Au!!");
	}
}
