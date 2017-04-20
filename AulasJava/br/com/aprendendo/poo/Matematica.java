/**
 * Matematica
 * @author Isaque
 */
package br.com.aprendendo.poo;

public class Matematica {

	/**
	 * @return o maior dos dois numeros
	 */
	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}

	/**
	 * com varios argumentos dentro do parenteses
	 * @return a soma dos numeros
	 */
	double soma(double ... numeros) {
		double total = 0;
		for(double n : numeros){
			total += n;
		}
		return total;
	}
	/**
	 * @param valor
	 * @return raiz quadrada do valor.. com equação de PEll
	 */
	int raiz(int valor){
		int raiz = 0;
		int impar = 1;
		while(valor-impar >= 0){
			valor = valor - impar;
			impar +=2;
			raiz++;
		}
		return raiz;	}
		/**
		 * 	Métodos para calcular a média 
		 * @return media
		 */
		double media(double x, double y){
			System.out.println("(double x, double y)");
			return (x + y) / 2;
		}
		double media(String x, String y){
			double ix = Double.parseDouble(x);
			double iy = Double.parseDouble(y);
			System.out.println("(String x, String y)");
			return (ix + iy) / 2;
		}
		double media(int x){
			System.out.println("(int x)");
			return x;
		}
		
		double media(double ... numeros){
			System.out.println("(double ... numeros)");
			return this.soma(numeros)/numeros.length;
		}
}
