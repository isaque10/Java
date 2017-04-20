package br.com.caelum.argentum.testes;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import br.com.caelum.argentum.modelo.*;

public class TestaCandlestickFactory {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		Calendar amanha = (Calendar) hoje.clone();
		amanha.add(Calendar.DAY_OF_MONTH, 1);
		
		Calendar depois = (Calendar) amanha.clone();
		depois.add(Calendar.DAY_OF_MONTH, 1);
		
		Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
		Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
		Negociacao negociacao3 = new Negociacao(39.8, 100, amanha);
		Negociacao negociacao4 = new Negociacao(42.3, 100, hoje);
		
		Negociacao negociacao5 = new Negociacao(48.8, 100, amanha);
		Negociacao negociacao6 = new Negociacao(49.3, 100, amanha);
		
		Negociacao negociacao7 = new Negociacao(51.8, 100, depois);
		Negociacao negociacao8 = new Negociacao(52.3, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4, negociacao5, negociacao6, negociacao7, negociacao8);
		
		CandleFactory fabrica = new CandleFactory();
		List<Candle> candles = fabrica.constroiCandles(negociacoes);
		
		for (Negociacao negociacao : negociacoes) {
			DateFormat f = DateFormat.getDateInstance();
			String data = f.format(negociacao.getData().getTime());
			
			System.out.println(data);
		}
		
	}

}
