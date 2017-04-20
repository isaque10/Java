/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.view;

import br.com.sysodonto.entity.Consulta;
import br.com.sysodonto.entity.Dentista;
import br.com.sysodonto.entity.Paciente;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

class ConsultaTableModel extends AbstractTableModel {
    
    private final List<Consulta> lista;
    
    public ConsultaTableModel(List<Consulta> lista) {
        super();
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
       Consulta consulta  = lista.get(linha);
       
       switch(coluna){
           case 0:
               return consulta.getId();
           case 1:
               SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
               return f.format(consulta.getData().getTimeInMillis());
           case 2:
               return consulta.getHora();
           case 3:
               Paciente p = consulta.getPaciente();
               return p.getNome();
           case 4:
               Dentista d = consulta.getDentista();
               return d.getNome();
               
       }
       return "";
    }
    
    @Override
	public String getColumnName(int column){
            switch(column){
                    case 0:
                            return "Id";
                    case 1:
                            return "Data";
                    case 2:
                            return "Hora";
                    case 3:
                            return "Nome Paciente";		
                    case 4:
                            return "Nome Dentista";
            }
            return "";
    }
}
