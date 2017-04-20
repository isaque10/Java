package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("João");
		contato.setEmail("joao@caelum.com.br");
		contato.setEndereco("R.Vergueiro");
		contato.setDataNascimento(Calendar.getInstance());
		
		//GRAVE NESSA CONEXAO
		ContatoDao dao = new ContatoDao();
		
		//metodo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado");
		
	}

}
