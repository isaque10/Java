/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.view;

import br.com.sysodonto.entity.Dentista;
import br.com.sysodonto.entity.Recepcionista;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

class DentistaTableModel extends AbstractTableModel {
    
    private final List<Dentista> lista;
    
    public DentistaTableModel(List<Dentista> lista) {
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
       Dentista dentista  = lista.get(linha);
       
       switch(coluna){
           case 0:
               return dentista.getId();
           case 1:
               return dentista.getNome();
           case 2:
               return dentista.getCro();
           case 3:
               return dentista.getTelefone();
           case 4:
               return dentista.getEmail();
           case 5:
               SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
               return f.format(dentista.getDataNascimento().getTimeInMillis());
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
                            return "CRO";
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
