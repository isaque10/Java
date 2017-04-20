package br.com.xti.poo;

public class Matematica {
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return O MAIOR DOS DOIS NUMEROS
	 */
	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}

	/**
	 * 
	 * @param numeros
	 * @return a soma de numeros
	 */
	double soma(double... numeros) {
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}

	/**
	 * Calculo da Raiz-- 9(um)-1(impar) = 8 y++ 8(um)-3(impar) = 5 ||
	 * 5(um)-5(impar) = 0 ||
	 */
	int raiz(int um) {
		int y = 0;
		int impar = 1;
		for (int x = 1; x < um; x++) {
			um -= impar;
			impar += 2;
			y++;
		}
		return y;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return media de numeros;
	 */
	double media(double x, double y) {
		System.out.println("Media");
		return (x + y) / 2;
	}

	double media(String x, String y) {
		double ix = Double.parseDouble(x);
		double iy = Double.parseDouble(y);
		System.out.println("Media");
		return (ix + iy) / 2;
	}

	double media(double... numeros) {
		double total = 0;
		for (double n : numeros) {
			total += n;
		}

		System.out.println("Media");
		return (total) / numeros.length;
	}
}
