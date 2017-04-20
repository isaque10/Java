package br.com.aprendendo.herança;

public class Quadrado implements AreaCalculavel {
	
	double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}
}
