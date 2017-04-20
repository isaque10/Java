package br.com.caelum.jdbc.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		
		funcionario1.setNome("Carlos");
		funcionario1.setUsuario("carlos");
		funcionario1.setSenha("carlos123");
		funcionario1.setId(Long.parseLong(String.format("%d", 4)));

		funcionario2.setNome("João");
		funcionario2.setUsuario("joao");
		funcionario2.setSenha("joao");
		
		funcionario3.setNome("Lucas");
		funcionario3.setUsuario("lucas");
		funcionario3.setSenha("lucas");
		
		
		//dao.remove(funcionario1);
		//dao.adiciona(funcionario1);
		dao.altera(funcionario1);
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios = dao.getLista();
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Id: " + funcionario.getId());
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Usuário: " + funcionario.getUsuario());
			System.out.println("Senha: " + funcionario.getSenha() + "\n");
		}
	}

}
