/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.business;

import br.com.sysodonto.dao.DRecepcionista;
import br.com.sysodonto.entity.Recepcionista;
import java.util.List;



/**
 *
 * @author Samsung
 */
public class BRecepcionista {

    public boolean cadastrarRecepcionista(Recepcionista recep){
        return new DRecepcionista().cadastrar(recep);
    }
    
    public boolean atualizarRecepcionista(Recepcionista recep){
        return new DRecepcionista().atualizar(recep);
    }
    
    public boolean excluirRecepcionista(int id){
        return new DRecepcionista().excluir(id);
    }

    public List<Recepcionista> getRecepcionistas() {
        return new DRecepcionista().getRecepcionistas();
    }

    public Recepcionista getRecepcionista(int id) {
        return new DRecepcionista().getRecepcionista(id);
    }

    public List<Recepcionista> getRecepcionistas(String nome) {
        return new DRecepcionista().getRecepcionistas(nome);
    }
    
    public Recepcionista getRecepcionista(String cpf){
        return new DRecepcionista().getRecepcionista(cpf);
        
    }
    
}
