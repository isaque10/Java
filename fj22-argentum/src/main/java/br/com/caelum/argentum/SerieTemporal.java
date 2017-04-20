package br.com.caelum.argentum;

import java.util.List;

import br.com.caelum.argentum.modelo.Candle;

public class SerieTemporal {
	
	private final List<Candle> candles;

	public SerieTemporal(List<Candle> candles) {
		if(candles == null){
			throw new NullPointerException("Lista nao pode ser nula!");
		}
		this.candles = candles;
	}
	public Candle getCandle(int i){
		return this.candles.get(i);
	}
	
	public int getTotal(){
		return this.candles.size();
	}
	
	
}
