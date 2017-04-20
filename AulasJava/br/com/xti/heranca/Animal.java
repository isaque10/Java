package br.com.xti.heranca;

public abstract class Animal {
	
	protected int serial;
	double peso;
	String comida;

	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}

	void dormir() {
		System.out.println("Dormiu");
	}

	abstract void fazerBarulho();
}
