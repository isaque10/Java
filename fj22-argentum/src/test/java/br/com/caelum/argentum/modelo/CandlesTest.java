package br.com.caelum.argentum.modelo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CandlesTest {

	@Test(expected = IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo(){
		new Candle(10, 20, 20, 10, 10000, Calendar.getInstance());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoCriaCandleComDataNula(){
		new Candle(10, 20, 10, 20, 10000, null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoCriaCandleComValoresNegativos(){
		new Candle(-10, -20, 10, 20, 10000, Calendar.getInstance());
	}
	
	@Test
	public void quandoAberturaIgualFechamentoEhAlta(){
		Calendar hoje = Calendar.getInstance();
		
		Negociacao negociacao1 = new Negociacao(48.0,100,hoje);
		Negociacao negociacao2 = new Negociacao(48.0, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2);
		
		CandleFactory fabrica = new CandleFactory();
		Candle candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		Assert.assertTrue(candle.isAlta());
	}
}
