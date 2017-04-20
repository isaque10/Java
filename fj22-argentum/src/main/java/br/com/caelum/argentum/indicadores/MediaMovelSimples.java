package br.com.caelum.argentum.indicadores;

import br.com.caelum.argentum.SerieTemporal;

public class MediaMovelSimples implements Indicador {
	
	
	private Indicador outroIndicador;

	public MediaMovelSimples(Indicador outroIndicador) {
		this.outroIndicador = outroIndicador;
	
	}
	
	@Override
	public double calcula(int posicao, SerieTemporal serie){
		double soma = 0.0;
		
		for (int i = posicao - 2; i <= posicao ; i++) {
			soma += outroIndicador.calcula(i, serie);
		}
		return soma/3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Media Movel Simples do " + outroIndicador;
	}
	
}
