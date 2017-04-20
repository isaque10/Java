//CONCLUIDO

package br.com.xti.exercicios;

public class Retangulo {

	double comprimento, largura, area, perimetro;

	public double calculaArea(double comprimento, double largura) {
		area = comprimento*largura;
		return area;
	}

	public double calculaPerimetro(double comprimento,double largura) {
		perimetro = (2*comprimento)+(2*largura);
		return perimetro;
	}

	public void imprime() {
		System.out.println("Area = " + area + "\n" + "Perimetro = " + perimetro);
	}
}
