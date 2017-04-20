package br.com.xti.heranca;

public class Cachorro extends Animal {
	
	public Cachorro(){
		super(30,"carne");
		
	}
	void enterrouOsso(){
		System.out.println("Enterrou Osso");
	}
	
	void fazerBarulho(){
		System.out.println("Au, Au!");
	}
}
