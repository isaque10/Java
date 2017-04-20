package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDao {
	
	private Connection connection;
	
	public FuncionarioDao(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Funcionario funcionario){
		String sql = "insert into funcionarios (nome, usuario, senha)"+
					 " values(?,?,?)";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			
			stmt.execute();
			System.out.println("Funcionario Adicionado");
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Funcionario> getLista(){
		try{
			PreparedStatement stmt = connection.prepareStatement("select * from funcionarios");
			ResultSet rs = stmt.executeQuery();
			List<Funcionario> funcionarios = new ArrayList<>();
			
			while(rs.next()){
				Funcionario funcionario = new Funcionario();
				
				funcionario.setNome(rs.getString("nome"));
				funcionario.setUsuario(rs.getString("usuario"));
				funcionario.setSenha(rs.getString("senha"));
				
				funcionarios.add(funcionario);
			}
			
			rs.close();
			stmt.close();
			return funcionarios;
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Funcionario funcionario){
		try{
			PreparedStatement stmt = connection.prepareStatement("delete from funcionarios where id=?");
			stmt.setLong(1, funcionario.getId());
			stmt.execute();
			System.out.println("Funcionario Removido");
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Funcionario funcionario){
		try{
			PreparedStatement stmt = connection.prepareStatement("update funcionarios set nome=?, usuario=?, senha=? where id=?");
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			stmt.setLong(4, funcionario.getId());
			
			stmt.execute();
			stmt.close();
			System.out.println("Funcionario Alterado");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
