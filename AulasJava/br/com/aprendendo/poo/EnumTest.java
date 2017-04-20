package br.com.aprendendo.poo;

public class EnumTest {

	public static final double PI = 3.14;
	
	public static void andar(Medida medida, int total){
		if(medida == Medida.M){
			System.out.println("Voc� andou " + total + " " + Medida.M.titulo);
		}
		else if(medida == Medida.CM){
			System.out.println("Voc� andou " + total + " " + Medida.CM.titulo);
		}
		else if(medida == Medida.MM){
			System.out.println("Voc� andou " + total + " " + Medida.MM.titulo);
		}
	}
	/**
	 * Testando enumera��es (Constantes)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pe�asXadrez.BISPO);
		System.out.println(Medida.M.titulo);
		
		for(Medida m : Medida.values()){
			System.out.println(m + " : " + m.titulo);
		}
		andar(Medida.M, 15);
	}

}
