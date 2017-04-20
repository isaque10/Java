package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematica m = new Matematica();
		int ma = m.maior(15, 25);
		System.out.println("O MAIOR " + ma);

		double so = m.soma(10, 32, 15, 12);
		System.out.println("A Soma " + so);

		int raiz = m.raiz(2500);

		System.out.println("Resultado da Raiz " + raiz);

		System.out.println(m.media(5, 10));
		System.out.println(m.media("10", "15"));
		System.out.println(m.media(15,10));
	}

}
