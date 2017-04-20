/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.entity;

import java.util.Calendar;

/**
 *
 * @author Samsung
 */
public class Consulta {
    
    private int id;
    private Calendar data;
    private String hora;
    private Paciente paciente;
    private Dentista dentista;

    public Consulta(Calendar data,String hora, Paciente paciente, Dentista dentista) {
        
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
        this.dentista = dentista;
    }

    public Consulta(){
        
        
    }
    
    public int getId() {
        return id;
    }

    public Calendar getData() {
        return data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }
    
    
    
}
