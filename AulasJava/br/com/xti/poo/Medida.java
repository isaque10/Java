package br.com.xti.poo;

public enum Medida {

	MM("Milimetro"), CM("Centimetro"), M("Metro");

	public String titulo;

	Medida(String titulo) {
		this.titulo = titulo;
	}

	public static void andar(String medida, int total) {
		if (medida == "metros") {
			System.out.println("Voce andou " + total + " Metros");
		}
	}

}
