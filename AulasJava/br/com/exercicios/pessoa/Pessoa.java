package br.com.exercicios.pessoa;

public class Pessoa {

	private String nome;
	private int peso, idade;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int p) {
		this.peso = p;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int i) {
		this.idade = i;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double a) {
		this.altura = a;
	}

	public void imprimeDados() {
		System.out.println("Nome: " + nome + "\nIdade: " + idade + " anos\n" + "Peso: " + peso + "Kg\n" + "Altura: "
				+ altura + " metros\n");
	}
}
