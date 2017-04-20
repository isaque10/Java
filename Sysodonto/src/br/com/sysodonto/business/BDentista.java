/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.business;

import br.com.sysodonto.dao.DDentista;
import br.com.sysodonto.entity.Dentista;
import java.util.List;

public class BDentista {
    
    public boolean cadastrarDentista(Dentista dentista){
        return new DDentista().cadastrar(dentista);
    }
    
    public boolean buscarDentista(Dentista dentista){
        return false;//new DPaciente().getPacientes();
    }
    
    public boolean atualizarDentista(Dentista dentista){
        return new DDentista().atualizar(dentista);
    }
    
    public boolean excluirDentista(int id){
        return new DDentista().excluir(id);
    }

    public Dentista getDentistaUnico(String nome) {
        return new DDentista().getDentistaUnico(nome);
    }

    public List<Dentista> getDentistas() {
        return new DDentista().getDentistas();
    }

    public Dentista getDentista(int id) {
        return new DDentista().getDentista(id);
    }

    
    public Dentista getDentista(String cro) {
        return new DDentista().getDentista(cro);
    }
    
    public List<Dentista> getDentistas(String nome) {
        return new DDentista().getDentistas(nome);
    }

    public List<Dentista> getDentistasOrder() {
        return new DDentista().getDentistasOrder();
    }
}
