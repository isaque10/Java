package br.com.aprendendo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	public static void main(String[] args) throws Exception {
		
		String sql = "select codigo, nome, sexo, email from pessoa";
		
		//protocolo:subprotocolo::ip ou nome do servidor BD: Porta: tipo
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try (Connection con = DriverManager.getConnection(url, "xti", "xti123");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()){
			
			while(rs.next()){
				String s = rs.getString(1)
						+ " ; " + rs.getString(2)
						+ " ; " + rs.getString(3)
						+ " ; " + rs.getString(4)
						;
				System.out.println(s);
			}
			
		}
		
	}

}
