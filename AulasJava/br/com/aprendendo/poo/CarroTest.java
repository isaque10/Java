/**
 * Carro
 teste
 * @author Isaque
 */
package br.com.aprendendo.poo;

public class CarroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FERRARI
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12; //adiciona o motor ao carro..
		
		//KOENIGSEGG
		Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
		Motor v8 = new Motor("V8", 1018);
		koenigsegg.motor = v8;
		
		//BUGATTI
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		
		//MERCEDES
		Carro mercedes = new Carro();
		mercedes.modelo = "Lotec C1000";
		mercedes.velocidadeMaxima = 405;
		mercedes.segundosZeroACem = 3.2;
		mercedes.motor = new Motor("V8", 980);
		
		//PORSCHE
		Carro porsche = new Carro("Porche GT9-R", 413, 2.88, new Motor("F6", 1050));
		
		System.out.println(bugatti.modelo);
		System.out.println(koenigsegg.modelo);
		System.out.println(ferrari.modelo);
		System.out.println(mercedes.modelo);
		System.out.println(porsche.modelo);
	}

}
