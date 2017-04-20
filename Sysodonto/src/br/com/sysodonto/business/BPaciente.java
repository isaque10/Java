/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.business;

import br.com.sysodonto.dao.DPaciente;
import br.com.sysodonto.entity.Paciente;
import java.util.List;

public class BPaciente {
    
    public boolean cadastrarPaciente(Paciente paciente){
        return new DPaciente().cadastrar(paciente);
    }
    
    public List<Paciente> getPacientes(){
        return new DPaciente().getPacientes();
    }
    
    public boolean atualizarPaciente(Paciente paciente){
        return new DPaciente().atualizar(paciente);
    }
    
    public boolean excluirPaciente(int id){
        return new DPaciente().excluir(id);
    }

    public Paciente getPaciente(int id) {
        return new DPaciente().getPaciente(id);
    }
    
    public Paciente getPaciente(String cpf){
        return new DPaciente().getPaciente(cpf);
    }

    public List<Paciente> getPacientes(String nome) {
        return new DPaciente().getPacientes(nome);
    }

    public Paciente getPacienteUnico(String nome) {
        return new DPaciente().getPacienteUnico(nome);
    }

    public List<Paciente> getPacientesOrder() {
        return new DPaciente().getPacientesOrder();
    }
}
