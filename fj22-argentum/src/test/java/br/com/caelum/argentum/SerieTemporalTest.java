package br.com.caelum.argentum;

import org.junit.Test;

public class SerieTemporalTest {

	@Test(expected = IllegalArgumentException.class)
	public void serieTemporalNaoRecebeListaNula(){
		SerieTemporal serie = GeradorDeSerie.criaSerie(null);
		
	}

}
