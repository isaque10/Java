/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.entity;

import java.util.Calendar;

public class Paciente {
    private int id;
    private String nome;
    private char sexo;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private Calendar dataNascimento;

    public Paciente(String nome, char sexo, String cpf, String email, String telefone, String endereco, Calendar dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public Paciente(){
        
    }

    public Paciente(String id, String cpf, String nome) {
        this.id = Integer.parseInt(id);
        this.cpf = cpf;
        this.nome = nome;
    }

    public Paciente(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        String sexo = String.valueOf(this.sexo);
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
