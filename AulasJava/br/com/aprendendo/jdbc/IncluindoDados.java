package br.com.aprendendo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class IncluindoDados {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "insert into pessoa values (3, 'José', 'M', 'jose@email.com')";
		try (Connection con = DriverManager.getConnection(url, "xti", "xti123");
			PreparedStatement stm = con.prepareStatement(sql);
			) {
			
			stm.executeUpdate();
			
		}

	}

}
