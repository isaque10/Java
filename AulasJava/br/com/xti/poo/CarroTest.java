package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*COM CONSTRUTOR VAZIO*/
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		/*CRIA O MOTOR*/
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12;// adiciona o motor ao carro
		
		/*COM CONSTRUTOR COM PARAMETROS*/
		Carro k = new Carro("Koenigsegg CCXR", 430, 3.1);
		Motor v8 = new Motor("V8",1018);
		k.motor = v8;
		
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);
		
		
	

	}

}
