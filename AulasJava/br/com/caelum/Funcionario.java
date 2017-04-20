package br.com.caelum;

public class Funcionario {
	String nome;
	double salario;
	Data dataEntrada;
	String rg;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double calculaGanhoAnual(){
		return salario*12;
	}
	
}