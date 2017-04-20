package br.com.caelum;

public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados;
	int contaFuncionario = 0;
	void adiciona(Funcionario f){
		this.empregados[contaFuncionario] = f;
		this.contaFuncionario++;
	}
	
	void mostraEmpregados(){
		for(int i=0;i<this.contaFuncionario;i++){
			System.out.println("Funcionario na posicao " + i + "= " + empregados[i].nome);
			System.out.println("Salário: " + empregados[i].salario);
		}
	}
}
