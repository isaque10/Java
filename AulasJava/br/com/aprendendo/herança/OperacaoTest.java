package br.com.aprendendo.herança;

public class OperacaoTest {

	public static void calcule(Operacaomatematica o, double x, double y) {
		System.out.println(o.calcular(x, y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);
	}

}
