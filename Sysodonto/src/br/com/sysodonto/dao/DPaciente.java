/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.dao;

import br.com.sysodonto.entity.Paciente;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;


public class DPaciente extends Dao {
    
    public boolean cadastrar(Paciente paciente){
        String comando = "insert into paciente (nome, sexo, cpf, email, telefone, endereco, data_nascimento) values (?, ?, ?, ?, ?, ?, ?)";
        
        try{
            this.conectar();
            this.stmt = conn.prepareStatement(comando);
            this.stmt.setString(1, paciente.getNome());
            this.stmt.setString(2, paciente.getSexo());
            this.stmt.setString(3, paciente.getCpf());
            this.stmt.setString(4, paciente.getEmail());
            this.stmt.setString(5, paciente.getTelefone());
            this.stmt.setString(6, paciente.getEndereco());
            this.stmt.setDate(7, new Date(paciente.getDataNascimento().getTimeInMillis()));
            
            this.stmt.execute();
            
        }catch(SQLException e){
            System.out.println("Erro ao inserir Paciente! " + e.getMessage());
            return false;
        }
        System.out.println("Cadastro realizado com Sucesso!");
        return true;
    }
    
    //busca completa
    public List<Paciente> getPacientes() {
        
        String comando = "SELECT * FROM PACIENTE";
        ResultSet rs = null;
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
            rs = stmt.executeQuery();
            while (rs.next()) {
                    Paciente paciente = new Paciente();

                    paciente.setId(rs.getInt("id"));
                    paciente.setNome(rs.getString("nome"));
                    paciente.setCpf(rs.getString("cpf"));
                    paciente.setTelefone(rs.getString("telefone"));
                    paciente.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    paciente.setDataNascimento(c);
                    pacientes.add(paciente);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar pacientes" + e.getMessage());
        }
        return pacientes;
    }
    
    public List<Paciente> getPacientesOrder() {
        
        String comando = "SELECT * FROM PACIENTE ORDER BY nome ASC";
        ResultSet rs = null;
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
            rs = stmt.executeQuery();
            while (rs.next()) {
                    Paciente paciente = new Paciente();

                    paciente.setId(rs.getInt("id"));
                    paciente.setNome(rs.getString("nome"));
                    paciente.setCpf(rs.getString("cpf"));
                    paciente.setTelefone(rs.getString("telefone"));
                    paciente.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    paciente.setDataNascimento(c);
                    pacientes.add(paciente);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar pacientes" + e.getMessage());
        }
        return pacientes;
    }
    
    //busca pelo id
    public Paciente getPaciente(int id){
        
        String comando = "SELECT * FROM PACIENTE WHERE ID = ?";
        ResultSet rs = null;
        Paciente paciente = new Paciente();
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setEmail(rs.getString("email"));
                paciente.setEndereco(rs.getString("endereco"));
                //conversao de Date.sql para Calendar
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("data_nascimento"));
                paciente.setDataNascimento(c);
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar paciente" + e.getMessage());
        }
        return paciente;
    }
    
    //busca pelo cpf
    public Paciente getPaciente(String cpf){
        
        String comando = "SELECT * FROM PACIENTE WHERE cpf = ?";
        ResultSet rs = null;
        Paciente paciente = new Paciente();
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setString(1, cpf);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setEmail(rs.getString("email"));
                //conversao de Date.sql para Calendar
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("data_nascimento"));
                paciente.setDataNascimento(c);
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar paciente" + e.getMessage());
        }
        return paciente;
    }
    
    //busca pelo nome ou parte
    public List<Paciente> getPacientes(String nome) {
        
        String comando = "SELECT * FROM PACIENTE WHERE NOME LIKE '%" + nome + "%'";
        System.out.println(comando);
        ResultSet rs = null;
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
 
            rs = stmt.executeQuery();
            while (rs.next()) {
                    Paciente paciente = new Paciente();

                    paciente.setId(rs.getInt("id"));
                    paciente.setNome(rs.getString("nome"));
                    paciente.setCpf(rs.getString("cpf"));
                    paciente.setTelefone(rs.getString("telefone"));
                    paciente.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    paciente.setDataNascimento(c);
                    pacientes.add(paciente);
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar pacientes" + e.getMessage());
        }
        return pacientes;
    }
    
    //busca unico paciente pelo nome
    public Paciente getPacienteUnico(String nome) {
        
        String comando = "SELECT * FROM PACIENTE WHERE NOME = ? " ;
        System.out.println(comando);
        ResultSet rs = null;
        Paciente paciente = new Paciente();
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            
            if (rs.next()) {

                    paciente.setId(rs.getInt("id"));
                    paciente.setNome(rs.getString("nome"));
                    paciente.setCpf(rs.getString("cpf"));
                    paciente.setTelefone(rs.getString("telefone"));
                    paciente.setEmail(rs.getString("email"));
                    //conversao de Date.sql para Calendar
                    Calendar c = Calendar.getInstance();
                    c.setTime(rs.getDate("data_nascimento"));
                    paciente.setDataNascimento(c);                    
            }        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar paciente" + e.getMessage());
        }
        return paciente;
    }
    
    public boolean atualizar(Paciente paciente){
        
        String comando = "UPDATE PACIENTE SET NOME=?, CPF=?, EMAIL=?, TELEFONE=?, ENDERECO=? WHERE ID = ?";
        try{
           this.conectar();
           stmt = conn.prepareStatement(comando);
           stmt.setString(1, paciente.getNome());
           stmt.setString(2, paciente.getCpf());
           stmt.setString(3, paciente.getEmail());
           stmt.setString(4, paciente.getTelefone());
           stmt.setString(5, paciente.getEndereco());
           stmt.setInt(6, paciente.getId());
           stmt.execute();
           
           return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(int id){
        
        String comando = "DELETE FROM PACIENTE WHERE ID = ?";
        
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            stmt.setInt(1, id);
            stmt.execute();
            
            return true;   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro! Paciente cadastrado em consulta", "Erro ao excluir", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
