package br.com.caelum.argentum.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class CandleFactory {
	
	public Candle constroiCandleParaData(Calendar data, List<Negociacao> negociacoes){
		double maximo = negociacoes.isEmpty() ? 0 : 0;
		double minimo = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double volume = 0;
		
		
		for (Negociacao negociacao : negociacoes) {
			volume += negociacao.getVolume();
			
			
			double preco = negociacao.getPreco();
			if(negociacoes.size() == 1){
				maximo = preco;
				minimo = preco;
			}
			else{
				if(preco > maximo){
					maximo = preco;
				} else if(preco < minimo){
					minimo = preco;
				}
			}
		}
		
		
		
		double abertura = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double fechamento = negociacoes.isEmpty() ? 0 : negociacoes.get(negociacoes.size() - 1).getPreco();
		
		return new Candle(abertura,fechamento,minimo,maximo,volume,data);
		
	}
	
	/**
	 * Metodo para criar lista de candles
	 * @param lista de Negociacao --> todasNegociacoes
	 * @return lista de candles
	 */
	public List<Candle> constroiCandles(List<Negociacao> todasNegociacoes) {
		
		//cria a lista de candles
		List<Candle> candles = new ArrayList<Candle>();
		
		//cria a lista de negociacoes do Dia
		List<Negociacao> negociacoesDoDia = new ArrayList<>();
		
		//cria uma data com o valor da 1 negociacao da lista --> todasNegociacoes
		Calendar dataAtual = todasNegociacoes.get(0).getData();
		
		for (Negociacao negociacao : todasNegociacoes) {
			//Collections.sort(todasNegociacoes);
			
			//lanca excecao se nao estiver em ordem
			if(negociacao.getData().before(dataAtual)){
				throw new IllegalStateException("Negociacoes em ordem errada!!");
			}
			
			//se nao for mesmo dia, fecha candle e reinicia variaveis
			if(!negociacao.isMesmoDia(dataAtual)){
				criaEGuardaCandle(candles, negociacoesDoDia, dataAtual);
				negociacoesDoDia = new ArrayList<Negociacao>();
				dataAtual = negociacao.getData();
			}
			negociacoesDoDia.add(negociacao);
		}
		
		criaEGuardaCandle(candles, negociacoesDoDia, dataAtual);
		
		return candles;
	}

	private void criaEGuardaCandle(List<Candle> candles, List<Negociacao> negociacoesDoDia, Calendar dataAtual) {
		Candle candleDoDia = constroiCandleParaData(dataAtual, negociacoesDoDia);
		
		candles.add(candleDoDia);
	}
}
