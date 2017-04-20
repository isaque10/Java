package br.com.aprendendo.herança;

public class InterfaceTest {
	
	public static void area(AreaCalculavel o){
		System.out.println(o.calculaArea());
	}
	
	public static void volume(VolumeCalculavel o){
		System.out.println(o.calculaVolume());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		area(new Quadrado(2));
		area(new Cubo(2));
		volume(new Cubo(2));
	}

}
