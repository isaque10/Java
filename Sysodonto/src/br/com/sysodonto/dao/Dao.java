
package br.com.sysodonto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Dao {
    
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    protected PreparedStatement stmt;
    protected Connection conn;
    
    public Dao(){
        this.servidor = "//localhost";
        this.banco = "sys_odonto";
        this.usuario = "root";
        this.senha = "";
    }
    
    public void conectar() throws SQLException{
        String url = "jdbc:mysql:" + this.servidor + "/" + this.banco;
        this.conn = (Connection)DriverManager.getConnection(url, this.usuario, this.senha);
        System.out.println("Conectado!");
    }
    
}
    