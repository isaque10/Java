package br.com.caelum.argentum.testes;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;

import br.com.caelum.argentum.GeradorDeSerie;
import br.com.caelum.argentum.SerieTemporal;
import br.com.caelum.argentum.grafico.GeradorDeGrafico;
import br.com.caelum.argentum.indicadores.IndicadorFechamento;
import br.com.caelum.argentum.indicadores.MediaMovelPonderada;
import br.com.caelum.argentum.indicadores.MediaMovelSimples;

public class TestaGrafico{

	public static void main(String[] args) throws IOException{
		
		
		
		SerieTemporal serie = GeradorDeSerie.criaSerie(40, 51, 23, 34, 58 ,44, 33, 34, 35, 36, 37, 38, 39 ,40, 44, 45, 46, 47, 48, 43,49, 55, 52, 51, 44, 43, 44, 43, 55, 43,44, 45,46,47,48);
		GeradorDeGrafico g =new GeradorDeGrafico(serie, 3, 32);
		g.plotaIndicador(new MediaMovelSimples(new IndicadorFechamento()));
		g.plotaIndicador(new IndicadorFechamento());
		g.plotaIndicador(new MediaMovelPonderada(new IndicadorFechamento()));
		g.salva(new FileOutputStream("grafico.png"));
		
		JFrame frame = new JFrame("Minha Janela");
		frame.add(g.getPanel());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
