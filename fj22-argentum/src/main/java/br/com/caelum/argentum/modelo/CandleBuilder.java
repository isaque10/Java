package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public class CandleBuilder {
	
	private double abertura;
	private double fechamento;
	private double minimo;
	private double maximo;
	private double volume;
	private Calendar data;
	private int contaChamadas = 0;
	
	public CandleBuilder comAbertura(double abertura) {
		this.abertura = abertura;
		contaChamadas++;
		return this;
	}
	public CandleBuilder comFechamento(double fechamento) {
		this.fechamento = fechamento;
		contaChamadas++;
		return this;
	}
	public CandleBuilder comMinimo(double minimo) {
		this.minimo = minimo;
		contaChamadas++;
		return this;
	}
	public CandleBuilder comMaximo(double maximo) {
		this.maximo = maximo;
		contaChamadas++;
		return this;
	}
	public CandleBuilder comVolume(double volume) {
		this.volume = volume;
		contaChamadas++;
		return this;
	}
	public CandleBuilder comData(Calendar data) {
		this.data = data;
		contaChamadas++;
		return this;
	}
	
	public Candle geraCandle(){
		if(contaChamadas != 6){
			throw new IllegalArgumentException("Todos os campos devem estar preenchidos");
		}
		return new Candle(abertura, fechamento, minimo, maximo, volume, data);
	}
	
}
