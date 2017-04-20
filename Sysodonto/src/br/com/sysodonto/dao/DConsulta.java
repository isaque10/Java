/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.dao;

import br.com.sysodonto.entity.Consulta;
import br.com.sysodonto.entity.Dentista;
import br.com.sysodonto.entity.Paciente;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class DConsulta extends Dao{
    
    public boolean cadastrar(Consulta consulta){
        String comando = "insert into consulta (data, hora, id_paciente, id_dentista) values ( ?, ?, ?, ?)";
        
        try{
            this.conectar();
            this.stmt = conn.prepareStatement(comando);
            this.stmt.setDate(1, new Date(consulta.getData().getTimeInMillis()));
            this.stmt.setString(2, consulta.getHora());
            this.stmt.setInt(3, consulta.getPaciente().getId());
            this.stmt.setInt(4, consulta.getDentista().getId());
            
            this.stmt.execute();
            
        }catch(SQLException e){
            System.out.println("Erro ao inserir Consulta! " + e.getMessage());
            return false;
        }
        System.out.println("Cadastro realizado com Sucesso!");
        return true;
    }
    
    public List<Consulta> getConsultas(Calendar data){
        
        List<Consulta> consultas = new ArrayList<>();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = f.format(data.getTime());
        
        String comando = "SELECT c.id AS ID, c.data AS Data, c.hora AS Hora, p.nome AS 'Nome Paciente', d.nome AS 'Nome Dentista'"
                         + " FROM consulta c"
                         + " JOIN paciente p ON c.id_paciente = p.id"
                         + " JOIN dentista d ON c.id_dentista = d.id"
                         + " WHERE DATA"
                         + " BETWEEN '"+ dataFormatada + "'"
                         + " AND '" + dataFormatada + "'"
                         + " ORDER BY HORA ASC";
                         
                         
        ResultSet rs = null;
        
        
        try {
            this.conectar();
            stmt = conn.prepareStatement(comando);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Consulta consulta = new Consulta();
                
                consulta.setId(rs.getInt("id"));
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("data"));
                consulta.setData(c);
                
                consulta.setHora(rs.getString("hora"));
                consulta.setPaciente(new Paciente(rs.getString("Nome Paciente")));
                consulta.setDentista(new Dentista(rs.getString("Nome Dentista")));
                
                
                consultas.add(consulta);
                
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar consulta!! Dao" + e.getMessage());
        }
        
        return consultas;
    }
    
    public Consulta getConsulta(int id){
        
        String comando = "SELECT c.id AS ID, c.data AS Data, c.hora AS Hora, p.nome AS 'Nome Paciente', d.nome AS 'Nome Dentista'"
                         + " FROM consulta c"
                         + " JOIN paciente p ON c.id_paciente = p.id"
                         + " JOIN dentista d ON c.id_dentista = d.id"
                         + " WHERE c.id = " + id;
        
        
        ResultSet rs = null;
        Consulta consulta = new Consulta();
        try{
            this.conectar();
            stmt = conn.prepareStatement(comando);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                consulta.setId(rs.getInt("id"));
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("data"));
                consulta.setData(c);
                consulta.setHora(rs.getString("hora"));
                Paciente p = new Paciente();
                Dentista d = new Dentista();
                
                p.setNome(rs.getString("Nome Paciente"));
                d.setNome(rs.getString("Nome Dentista"));
                
                consulta.setPaciente(p);
                consulta.setDentista(d);
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao listar Consulta");
        }
        
        
        return consulta;
    }
    
    public boolean atualizar(Consulta consulta){
        String comando = "UPDATE CONSULTA SET DATA = ?, HORA = ? WHERE ID = ?";
        
        try {
            this.conectar();
            stmt = conn.prepareCall(comando);
            stmt.setDate(1, new Date(consulta.getData().getTimeInMillis()));
            stmt.setString(2, consulta.getHora());
            stmt.setInt(3, consulta.getId());
            
            stmt.execute();
            
        return true;    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar consulta!");
            return false;
        }
        
    }
    
    public boolean excluir(int id){
        String comando = "DELETE FROM CONSULTA WHERE ID = ?";
        
        try {
            this.conectar();
            stmt = conn.prepareCall(comando);
            stmt.setInt(1, id);
            
            stmt.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Consulta! " + e.getMessage());
            return false;
        }
    }
    
    
}
