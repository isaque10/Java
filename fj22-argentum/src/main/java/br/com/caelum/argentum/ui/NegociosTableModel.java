package br.com.caelum.argentum.ui;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import javax.swing.table.AbstractTableModel;

import br.com.caelum.argentum.modelo.Negociacao;

public class NegociosTableModel extends AbstractTableModel{

	private final List<Negociacao> lista;
	
	public NegociosTableModel(List<Negociacao> lista) {
		super();
		this.lista = lista;
	}

	@Override
	public int getRowCount() {
		return lista.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		Negociacao negociacao = lista.get(linha);
		
		switch(coluna){
			case 0:
				Locale brasil = new Locale("pt", "BR");
				NumberFormat formatadorDeMoeda = NumberFormat.getCurrencyInstance(brasil);
				
				return formatadorDeMoeda.format(negociacao.getPreco());
			case 1:
				return negociacao.getQuantidade();
			case 2:
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				return sdf.format(negociacao.getData().getTime());
		}
		return "";
	}
	
	@Override
	public String getColumnName(int column){
		switch(column){
			case 0:
				return "Preco";
			case 1:
				return "Quantidade";
			case 2:
				return "Data";		
		}
		return "";
	}
	
}
