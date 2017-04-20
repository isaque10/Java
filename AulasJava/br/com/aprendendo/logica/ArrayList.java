/**
 * Arraylist
 * @author Isaque Felix da Silva
 */
package br.com.aprendendo.logica;


public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.ArrayList<String> cores = new java.util.ArrayList<>();
		cores.add("Branco");
		cores.add("Azul");
		cores.add("Preto");
		
		System.out.println(cores.toString());
		//tamanho
		System.out.println("Tamanho = " + cores.size());
		//qual pertence a posicao 2
		System.out.println("Elemento2= " + cores.get(2));
		//indice do elemeto
		System.out.println("Indice Branco= " + cores.indexOf("Branco"));;
		cores.remove("Branco");
		// busca um valor no array
		System.out.println(cores.contains("Azul"));
	
	}

}
