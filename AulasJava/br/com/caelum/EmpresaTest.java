package br.com.caelum;

public class EmpresaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.salario = 1400;
		f1.nome = "Jos�";
		
		Funcionario f2 = new Funcionario();
		f2.salario = 1000;
		f2.nome = "Jo�o";
		
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		
		empresa.mostraEmpregados();
	}

}
