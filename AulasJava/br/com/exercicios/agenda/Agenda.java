package br.com.exercicios.agenda;

public class Agenda {

	java.util.ArrayList<String> nomes = new java.util.ArrayList<>();
	java.util.ArrayList<Integer> idades = new java.util.ArrayList<>();
	java.util.ArrayList<Double> alturas = new java.util.ArrayList<>();

	void armazenaPessoa(String nome, int idade, double altura) {
		nomes.add(nome);
		idades.add(idade);
		alturas.add(altura);
	}

	void removePessoa(String nome) {
		int x = nomes.indexOf(nome);
		nomes.remove(x);
		idades.remove(x);
		alturas.remove(x);
	}

	int buscaPessoa(String nome) {
		return nomes.indexOf(nome);
	}

	void imprimeAgenda() {
		for(int x=0 ; x < nomes.size() ; x++){
			System.out.println(x+1 + "\nNome: " + nomes.get(x) + "\nIdade: " + idades.get(x) + "\nAltura: " + alturas.get(x) + "\n");
		}
	}

	void quantidadePessoas() {
		System.out.println("Quantidade = " + nomes.size());
	}

	// exibe pessoa do indice i..
	void imprimePessoa(int i) {
		System.out.println("Posição " + (i+1) + ":\nNome: " + nomes.get(i) + "\nIdade: " + idades.get(i) + "\nAltura: "
				+ alturas.get(i) + "\n\n");
	}
}
