/**
 * @author Isaque
 */
package br.com.aprendendo.poo;

public class Carro {

	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;

	public Carro() {

	}

	//cria��o de m�todo com parametros mais compacto..
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this(modelo, velocidadeMaxima, segundosZeroACem, null);
	}
	
	//cria��o de metodo com parametros sem modo compacto..
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
	}
}
