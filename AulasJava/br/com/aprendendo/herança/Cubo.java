package br.com.aprendendo.heran�a;

public class Cubo implements VolumeCalculavel, AreaCalculavel{

	double lado;
	
	public Cubo(double lado){
		this.lado = lado;
	}
		
	@Override
	public double calculaVolume() {
		// TODO Auto-generated method stub
		return 6 * lado * lado;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return lado * lado * lado;
	}
	
	
}
