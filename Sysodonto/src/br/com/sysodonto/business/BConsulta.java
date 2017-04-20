/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.business;

import br.com.sysodonto.dao.DConsulta;
import br.com.sysodonto.entity.Consulta;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Samsung
 */
public class BConsulta {
    
    public boolean cadastraConsulta(Consulta consulta){
        return new DConsulta().cadastrar(consulta);
    }
    
    public List<Consulta> getConsultas(Calendar data){
        return new DConsulta().getConsultas(data);
    }
        
    public Consulta getConsulta(int id){
        return new DConsulta().getConsulta(id);
    }    
    
    public boolean atualizarConsulta(Consulta consulta){
        return new DConsulta().atualizar(consulta);
    }
    
    public boolean excluirConsulta(int id){
        return new DConsulta().excluir(id);
    }
}
