package br.com.aprendendo.poo;

/* Teste dentro da classe Funcion�rio  */

public class Funcionario {

	private String nome;
	//private boolean ativo;

	/**
	 * Encapsulamento Para captura
	 */
	public String getNome() {
		return nome;
	}

	/*
	 * m�todo para desencapsular para configura��o
	 */
	public void setNome(String n) {
		/* Representa variavel nome dessa classe */
		this.nome = n;
	}

}
