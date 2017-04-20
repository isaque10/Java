package br.com.aprendendo.poo;

/* Teste dentro da classe Funcionário  */

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
	 * método para desencapsular para configuração
	 */
	public void setNome(String n) {
		/* Representa variavel nome dessa classe */
		this.nome = n;
	}

}
