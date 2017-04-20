/**
 * CONCLUIDO
 */

package br.com.xti.exercicios;


public class QuadradoTest {

	public static void main(String[] args) {

		Quadrado q1 = new Quadrado();
		String quadrado = q1.entrada();
		double q = Double.parseDouble(quadrado);

		double area = q1.calculaArea(q);
		double perimetro = q1.calculaPerimetro(q);

		q1.imprime(area, perimetro);

	}

}
