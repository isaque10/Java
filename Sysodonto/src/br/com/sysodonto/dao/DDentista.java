/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.dao;

import br.com.sysodonto.entity.Dentista;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;


public class DDentista extends Dao {
    
    public boolean cadastrar(Dentista dentista){
        String comando = "insert into dentista (nome, sexo, cro, email, telefone, endereco, data_nascimento) values (?, ?, ?, ?, ?, ?, ?)";
        
        try{
            this.conectar();
            this.stmt = conn.prepareStatement(comando);
            this.stmt.setString(1, dentista.getNome());
            this.stmt.setString(2, dentista.getSexo());
            this.stmt.setString(3, dentista.getCro());
            this.stmt.setString(4, dentista.getEmail());
            this.stmt.setString(5, dentista.getTelefone());
            this.stmt.setString(6, dentista.getEndereco());
            this.stmt.setDate(7, new Date(dentista.getDataNascimento().getTimeInMillis()));
            
            this.stmt.execute();
            
        }catch(SQLException e){
            System.out.println("Erro ao inserir Dentista! " + e.getMessage());
            return false;
        }
        System.out.println("Cadastro realizado com Sucesso!");
        return true;
    }
    
    //busca completa
    public List<Dentista> getDentistas() {
        
        String comando = "SELECT * FROM Dentista";
        ResultSet rs = null;
        ArrayList<Dentista> dentistas = new ArrayList<Dentista>();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
            rs = stmt.executeQuery();
            while (rs.next()) {
                    Dentista dentista = new Dentista();

                    dentista.setId(rs.getInt("id"));
                    dentista.setNome(rs.getString("nome"));
                    dentista.setCro(rs.getString("cro"));
                    dentista.setTelefone(rs.getString("telefone"));
                    dentista.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    dentista.setDataNascimento(c);
                    dentistas.add(dentista);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar dentistas" + e.getMessage());
        }
        return dentistas;
    }
    
    public List<Dentista> getDentistasOrder() {
        
        String comando = "SELECT * FROM Dentista ORDER BY nome ASC";
        ResultSet rs = null;
        ArrayList<Dentista> dentistas = new ArrayList<Dentista>();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
            rs = stmt.executeQuery();
            while (rs.next()) {
                    Dentista dentista = new Dentista();

                    dentista.setId(rs.getInt("id"));
                    dentista.setNome(rs.getString("nome"));
                    dentista.setCro(rs.getString("cro"));
                    dentista.setTelefone(rs.getString("telefone"));
                    dentista.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    dentista.setDataNascimento(c);
                    dentistas.add(dentista);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar dentistas" + e.getMessage());
        }
        return dentistas;
    }
    
    //busca pelo id
    public Dentista getDentista(int id){
        
        String comando = "SELECT * FROM dentista WHERE ID = ?";
        ResultSet rs = null;
        Dentista dentista = new Dentista();
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                dentista.setId(rs.getInt("id"));
                dentista.setNome(rs.getString("nome"));
                dentista.setCro(rs.getString("cro"));
                dentista.setTelefone(rs.getString("telefone"));
                dentista.setEmail(rs.getString("email"));
                dentista.setEndereco(rs.getString("endereco"));
                //conversao de Date.sql para Calendar
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("data_nascimento"));
                dentista.setDataNascimento(c);
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar dentista" + e.getMessage());
        }
        return dentista;
    }
    
    //busca pelo cpf
    public Dentista getDentista(String cro){
        
        String comando = "SELECT * FROM dentista WHERE cro = ?";
        ResultSet rs = null;
        Dentista dentista = new Dentista();
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setString(1, cro);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                dentista.setId(rs.getInt("id"));
                dentista.setNome(rs.getString("nome"));
                dentista.setCro(rs.getString("cro"));
                dentista.setTelefone(rs.getString("telefone"));
                dentista.setEmail(rs.getString("email"));
                //conversao de Date.sql para Calendar
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("data_nascimento"));
                dentista.setDataNascimento(c);
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar dentista" + e.getMessage());
        }
        return dentista;
    }
    
    //busca pelo nome ou parte
    public List<Dentista> getDentistas(String nome) {
        
        String comando = "SELECT * FROM dentista WHERE NOME LIKE '%" + nome + "%'";
        System.out.println(comando);
        ResultSet rs = null;
        ArrayList<Dentista> dentistas = new ArrayList<>();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
 
            rs = stmt.executeQuery();
            while (rs.next()) {
                    Dentista dentista = new Dentista();

                    dentista.setId(rs.getInt("id"));
                    dentista.setNome(rs.getString("nome"));
                    dentista.setCro(rs.getString("cro"));
                    dentista.setTelefone(rs.getString("telefone"));
                    dentista.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    dentista.setDataNascimento(c);
                    dentistas.add(dentista);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar dentistas" + e.getMessage());
        }
        return dentistas;
    }
    
    //busca unico dentista pelo nome
    public Dentista getDentistaUnico(String nome) {
        
        String comando = "SELECT * FROM dentista WHERE NOME = ?" ;
        System.out.println(comando);
        ResultSet rs = null;
        Dentista dentista = new Dentista();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                    
                    dentista.setId(rs.getInt("id"));
                    dentista.setNome(rs.getString("nome"));
                    dentista.setCro(rs.getString("cro"));
                    dentista.setTelefone(rs.getString("telefone"));
                    dentista.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    dentista.setDataNascimento(c);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar dentista" + e.getMessage());
        }
        return dentista;
    }
    
    public boolean atualizar(Dentista dentista){
        
        String comando = "UPDATE dentista SET NOME=?, CRO=?, EMAIL=?, TELEFONE=?, ENDERECO=? WHERE ID = ?";
        try{
           this.conectar();
           stmt = conn.prepareStatement(comando);
           stmt.setString(1, dentista.getNome());
           stmt.setString(2, dentista.getCro());
           stmt.setString(3, dentista.getEmail());
           stmt.setString(4, dentista.getTelefone());
           stmt.setString(5, dentista.getEndereco());
           stmt.setInt(6, dentista.getId());
           stmt.execute();
           
           return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(int id){
        
        String comando = "DELETE FROM dentista WHERE ID = ?";
        
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
