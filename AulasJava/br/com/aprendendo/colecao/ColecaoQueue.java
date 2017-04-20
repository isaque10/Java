package br.com.aprendendo.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("João");
		fila.add("Lucas");
		fila.offer("José");
		System.out.println(fila);
		System.out.println(fila.peek());
		System.out.println(fila.poll());//remove o elemento do inicio da fila
		System.out.println(fila);
		
		/*outros métodos disponiveis em LinkedList*/
		
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio");//coloca no inicio da fila
		f.addLast("Julio");
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
		
	}

}
