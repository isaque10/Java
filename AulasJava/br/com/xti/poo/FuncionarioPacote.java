package br.com.xti.poo;

public class FuncionarioPacote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f = new Funcionario();
		
		String nome = f.getNome();
		f.setNome("Jo�o");
		System.out.println(nome);
		
		
	}
}
