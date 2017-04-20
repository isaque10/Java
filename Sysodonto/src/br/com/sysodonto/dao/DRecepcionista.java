/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.dao;

import br.com.sysodonto.entity.Recepcionista;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class DRecepcionista extends Dao {
    
    public boolean cadastrar(Recepcionista recep){
        String comando = "insert into recepcionista (nome, cpf, email, telefone, endereco, data_nascimento) values (?, ?, ?, ?, ?, ?)";
        
        try{
            this.conectar();
            this.stmt = conn.prepareStatement(comando);
            this.stmt.setString(1, recep.getNome());
            this.stmt.setString(2, recep.getCpf());
            this.stmt.setString(3, recep.getEmail());
            this.stmt.setString(4, recep.getTelefone());
            this.stmt.setString(5, recep.getEndereco());
            this.stmt.setDate(6, new Date(recep.getDataNascimento().getTimeInMillis()));
            
            this.stmt.execute();
            
        }catch(SQLException e){
            System.out.println("Erro ao inserir Recepcionista! " + e.getMessage());
            return false;
        }
        System.out.println("Cadastro realizado com Sucesso!");
        return true;
    }
    
    //busca completa
    public List<Recepcionista> getRecepcionistas() {
        
        String comando = "SELECT * FROM RECEPCIONISTA";
        ResultSet rs = null;
        ArrayList<Recepcionista> receps = new ArrayList<>();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
            rs = stmt.executeQuery();
            while (rs.next()) {
                    Recepcionista recep = new Recepcionista();

                    recep.setId(rs.getInt("id"));
                    recep.setNome(rs.getString("nome"));
                    recep.setCpf(rs.getString("cpf"));
                    recep.setTelefone(rs.getString("telefone"));
                    recep.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    recep.setDataNascimento(c);
                    receps.add(recep);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar recepcionistas" + e.getMessage());
        }
        return receps;
    }
    
    //busca pelo id
    public Recepcionista getRecepcionista(int id){
        
        String comando = "SELECT * FROM RECEPCIONISTA WHERE ID = ?";
        ResultSet rs = null;
        Recepcionista recep = new Recepcionista();
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                recep.setId(rs.getInt("id"));
                recep.setNome(rs.getString("nome"));
                recep.setCpf(rs.getString("cpf"));
                recep.setTelefone(rs.getString("telefone"));
                recep.setEmail(rs.getString("email"));
                recep.setEndereco(rs.getString("endereco"));
                //conversao de Date.sql para Calendar
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("data_nascimento"));
                recep.setDataNascimento(c);
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar recepcionista" + e.getMessage());
        }
        return recep;
    }
    
    //busca pelo cpf
    public Recepcionista getRecepcionista(String cpf){
        
        String comando = "SELECT * FROM RECEPCIONISTA WHERE cpf = ?";
        ResultSet rs = null;
        Recepcionista recep = new Recepcionista();
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setString(1, cpf);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                recep.setId(rs.getInt("id"));
                recep.setNome(rs.getString("nome"));
                recep.setCpf(rs.getString("cpf"));
                recep.setTelefone(rs.getString("telefone"));
                recep.setEmail(rs.getString("email"));
                //conversao de Date.sql para Calendar
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("data_nascimento"));
                recep.setDataNascimento(c);
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar recepcionista" + e.getMessage());
        }
        return recep;
    }
    
    //busca pelo nome ou parte
    public List<Recepcionista> getRecepcionistas(String nome) {
        
        String comando = "SELECT * FROM RECEPCIONISTA WHERE NOME LIKE '%" + nome + "%'";
        ResultSet rs = null;
        ArrayList<Recepcionista> receps = new ArrayList<>();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
 
            rs = stmt.executeQuery();
            while (rs.next()) {
                    Recepcionista recep = new Recepcionista();

                    recep.setId(rs.getInt("id"));
                    recep.setNome(rs.getString("nome"));
                    recep.setCpf(rs.getString("cpf"));
                    recep.setTelefone(rs.getString("telefone"));
                    recep.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    recep.setDataNascimento(c);
                    receps.add(recep);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar pacientes" + e.getMessage());
        }
        return receps;
    }
    
    public boolean atualizar(Recepcionista recep){
        
        String comando = "UPDATE RECEPCIONISTA SET NOME=?, CPF=?, EMAIL=?, TELEFONE=?, ENDERECO=? WHERE ID = ?";
        try{
           this.conectar();
           stmt = conn.prepareStatement(comando);
           stmt.setString(1, recep.getNome());
           stmt.setString(2, recep.getCpf());
           stmt.setString(3, recep.getEmail());
           stmt.setString(4, recep.getTelefone());
           stmt.setString(5, recep.getEndereco());
           stmt.setInt(6, recep.getId());
           stmt.execute();
           
           return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(int id){
        
        String comando = "DELETE FROM RECEPCIONISTA WHERE ID = ?";
        
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setInt(1, id);
            stmt.execute();
            
            return true;   
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
}
