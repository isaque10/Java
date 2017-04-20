package br.com.xti.poo;

public class Carro {

	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;

	/*construtor vazio*/
	public Carro() {

	}
	
	/*contrutor com parametros COM CHAMADA*/
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this(modelo,velocidadeMaxima,segundosZeroACem,null);
	}
	
	/*construtor com parametros*/
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
	}

}
