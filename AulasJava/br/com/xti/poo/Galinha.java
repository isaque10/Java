package br.com.xti.poo;

public class Galinha {

	public static int ovosDaGranja;// variavel global

	public int ovos;// total de ovos da galinha

	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaDeOvos(double galinhas){
		return Galinha.ovosDaGranja/galinhas;
	}
}
