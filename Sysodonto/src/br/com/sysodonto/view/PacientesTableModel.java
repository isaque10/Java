/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.view;

import br.com.sysodonto.entity.Paciente;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

class PacientesTableModel extends AbstractTableModel {
    
    private final List<Paciente> lista;
    
    public PacientesTableModel(List<Paciente> lista) {
        super();
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
       Paciente paciente  = lista.get(linha);
       
       switch(coluna){
           case 0:
               return paciente.getId();
           case 1:
               return paciente.getNome();
           case 2:
               return paciente.getCpf();
           case 3:
               return paciente.getTelefone();
           case 4:
               return paciente.getEmail();
           case 5:
               SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
               return f.format(paciente.getDataNascimento().getTimeInMillis());
       }
       return "";
    }
    
    @Override
	public String getColumnName(int column){
            switch(column){
                    case 0:
                            return "Id";
                    case 1:
                            return "Nome";
                    case 2:
                            return "CPF";
                    case 3:
                            return "Telefone";		
                    case 4:
                            return "Email";
                    case 5:
                            return "Data de Nascimento";
            }
            return "";
    }
}
