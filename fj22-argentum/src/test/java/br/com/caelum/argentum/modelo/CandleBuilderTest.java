package br.com.caelum.argentum.modelo;

import java.util.Calendar;

import org.junit.Test;

public class CandleBuilderTest {

	@Test(expected = IllegalArgumentException.class)
	public void geracaoDeCandleDeveTerTodosOsDadosNecessarios() {
		new CandleBuilder().comAbertura(40.5).comFechamento(42.3).comMaximo(45.0)
		.comVolume(145234.20).comData(Calendar.getInstance()).geraCandle();
	}
	
	
	
}
