package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		Contato contato = new Contato();
		contato.setId(Long.parseLong("2"));
		dao.remove(contato);

	}

}
