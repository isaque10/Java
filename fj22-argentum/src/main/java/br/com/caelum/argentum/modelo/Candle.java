package br.com.caelum.argentum.modelo;

import java.text.DateFormat;
import java.util.Calendar;

public final class Candle {
	
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	//reescrita do metodo toString
	@Override
	public String toString() {
		String msg = "[ Abertura " + this.getAbertura() 
		+ ", Fechamento " + this.getFechamento() 
		+ ", Minima " + this.getMinimo() 
		+ ", Maxima " + this.getMaximo()
		+ ", Volume " + this.getVolume()
		+ ", Data " + this.getData() + " ]";
		return msg;
	}
	
	//contrutor da Candle
	public Candle(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		if(minimo > maximo){
			throw new IllegalArgumentException("Valor minimo maior que o valor maximo!");
		}
		if(data == null){
			throw new IllegalArgumentException("Data nao pode ser nula!");
		}
		if(abertura < 0 || fechamento < 0 || minimo < 0 || maximo < 0 || volume < 0){
			throw new IllegalArgumentException("Nao pode conter valor negativo!");
		}
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}
	
	//return da data no padrao DD/MM/YYYY
	public String getData() {
		DateFormat f = DateFormat.getDateInstance();
		String data = f.format(this.data.getTime());
		return data;
	}
	
	public boolean isAlta(){
		return this.abertura <= this.fechamento;
	}
	
	public boolean isBaixa(){
		return this.abertura > this.fechamento;
	}
	
}
