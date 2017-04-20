/**
 * Matematica teste
 * @author Isaque
 */
package br.com.aprendendo.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matematica m = new Matematica();
		int qualMaior = m.maior(5, 10);
		System.out.println(qualMaior);
		
		double resultadoSoma = m.soma(10,22,2,3,45,5);
		System.out.println("Total = " + resultadoSoma);
		
		int raiz = m.raiz(81);
		System.out.println(raiz);
		
		System.out.println(m.media(5));
		System.out.println(m.media(5,3));
		System.out.println(m.media("50", "30"));
		System.out.println(m.media(5,5,5,5,8));
	}

}
