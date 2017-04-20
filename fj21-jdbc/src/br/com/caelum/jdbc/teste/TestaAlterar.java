package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAlterar {

	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		
		contato.setId(Long.parseLong("1"));
		contato.setNome("José");
		contato.setEmail("jose@caelum.com.br");
		contato.setEndereco("Rua Alba");
		contato.setDataNascimento(Calendar.getInstance());
		
		dao.altera(contato);
	}

}
