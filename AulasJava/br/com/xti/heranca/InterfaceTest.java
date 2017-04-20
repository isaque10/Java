package br.com.xti.heranca;

public class InterfaceTest {
	
	public static void area(AreaCalculavel o){
		System.out.println(o.calculaArea());
	}
	public static void volume(VolumeCalculavel v){
		System.out.println(v.calculaVolume());
	}
	public static void main(String[] args) {
		
		/*Quadrado q = */area(new Quadrado(2));
		//AreaCalculavel a = q;
		
		volume(new Cubo(2));
		
		
	}

}
