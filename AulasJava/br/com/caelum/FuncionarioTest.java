package br.com.caelum;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 =new Funcionario();
		
		f1.nome = "Danilo";
		f1.salario = 100;
		Data data = new Data(15,1,2015);
		f1.dataEntrada = data;
		
		System.out.println("salario atual: " + f1.salario);
		System.out.println("ganho anual: " + f1.calculaGanhoAnual());
		f1.dataEntrada.mostraData();
		Funcionario f2 = f1;
		
		if(f1 == f2){
			System.out.println("iguais");
		}
		else{
			System.out.println("diferentes");
		}
	}

}
