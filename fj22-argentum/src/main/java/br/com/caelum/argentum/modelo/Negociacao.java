package br.com.caelum.argentum.modelo;

import java.util.Calendar;

import br.com.caelum.argentum.ui.Coluna;

public final class Negociacao implements Comparable<Negociacao> {
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negociacao(double preco, int quantidade, Calendar data) {
		if(data == null){
			throw new IllegalArgumentException("Data nao pode ser nula!");
		}
		
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}
	
	@Coluna(nome = "Preco", posicao = 0, formato= "R$ %.2f")
	public double getPreco() {
		return preco;
	}
	
	@Coluna(nome = "Quantidade", posicao = 1)
	public int getQuantidade() {
		return quantidade;
	}

	@Coluna(nome = "Data", posicao = 2, formato = "%1$td/%1$tm/%1$tY")
	public Calendar getData() {
		return (Calendar) this.data.clone();
	}
	
	@Coluna(nome = "Volume", posicao = 3, formato = "R$ %.2f")
	public double getVolume(){
		return quantidade * preco;
	}

	public boolean isMesmoDia(Calendar outraData) {
		return 
				data.get(Calendar.DAY_OF_MONTH) == outraData.get(Calendar.DAY_OF_MONTH) && 
				data.get(Calendar.MONTH) == outraData.get(Calendar.MONTH) &&
				data.get(Calendar.YEAR) == outraData.get(Calendar.YEAR);
	}

	@Override
	public int compareTo(Negociacao outraNegociacao) {
		if(this.data.after(outraNegociacao.data)){
			return 1;
		}
		if(this.data.before(outraNegociacao.data)){
			return -1;
		}
		return 0;
	}
	
}
