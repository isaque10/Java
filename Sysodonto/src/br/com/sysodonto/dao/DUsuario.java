/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.dao;

import br.com.sysodonto.entity.Usuario;
import java.sql.SQLException;


public class DUsuario extends Dao{
    
    public boolean cadastrar(Usuario usuario){
        String comando = "insert into usuario (nome, email, senha) values (?, ?, ?)";
        
        try{
            this.conectar();
            this.stmt = conn.prepareStatement(comando);
            this.stmt.setString(1, usuario.getNome());
            this.stmt.setString(2, usuario.getEmail());
            this.stmt.setString(3, usuario.getSenha());
            this.stmt.execute();
            
        }catch(SQLException e){
            System.out.println("Erro ao inserir Usuário" + e.getMessage());
            return false;
        }
        System.out.println("Cadastro realizado com Sucesso!");
        return true;
    }
    
}
