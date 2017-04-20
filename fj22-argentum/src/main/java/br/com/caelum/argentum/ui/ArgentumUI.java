package br.com.caelum.argentum.ui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import br.com.caelum.argentum.GeradorDeSerie;
import br.com.caelum.argentum.SerieTemporal;
import br.com.caelum.argentum.grafico.GeradorDeGrafico;
import br.com.caelum.argentum.indicadores.IndicadorAbertura;
import br.com.caelum.argentum.indicadores.IndicadorFechamento;
import br.com.caelum.argentum.indicadores.MediaMovelPonderada;
import br.com.caelum.argentum.indicadores.MediaMovelSimples;
import br.com.caelum.argentum.modelo.Candle;
import br.com.caelum.argentum.modelo.CandleFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class ArgentumUI {
	private JFrame janela;
	private JPanel painelPrincipal;
	private JTable tabela;
	private JPanel painelBotoes;
	private JTabbedPane abas;
	
	public static void main(String[] args){
		new ArgentumUI().montaTela();
	}

	private void montaTela() {
		preparaJanela();
		preparaPainelPrincipal();
		preparaAbas();
		preparaTitulo();
		preparaTabela();
		preparaPainelBotoes();
		preparaBotaoCarregar();
		preparaBotaoSair();
		mostraJanela();
		
	}

	
	private void preparaAbas() {
		abas = new JTabbedPane();
		abas.add("Tabela", null);
		abas.add("Grafico", null);
		painelPrincipal.add(abas);
	}

	private void preparaPainelBotoes() {
		painelBotoes = new JPanel(new GridLayout());
		painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);
		
	}

	private void preparaTitulo() {
		JLabel titulo = new JLabel("Lista de Negociacoes", SwingConstants.CENTER);
		titulo.setFont(new Font("Verdana", Font.BOLD, 25));
		painelPrincipal.add(titulo, BorderLayout.NORTH);
	}

	private void preparaTabela() {
		tabela = new JTable();
		
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add(tabela);
		
		abas.setComponentAt(0, scroll);
	}

	private void preparaBotaoSair() {
		JButton botaoSair = new JButton("Sair");
		botaoSair.setMnemonic('S');
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		painelBotoes.add(botaoSair);
	}

	private void mostraJanela() {
		janela.pack();
		janela.setSize(540, 540);
		janela.setVisible(true);
	}

	private void preparaBotaoCarregar() {
		JButton botaoCarregar = new JButton("Carregar XML");
		botaoCarregar.setMnemonic('C');
		botaoCarregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					carregaDados();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		painelBotoes.add(botaoCarregar);
		
	}

	private void preparaPainelPrincipal() {
		painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		janela.add(painelPrincipal);
	}

	private void preparaJanela() {
		janela = new JFrame("Argentum");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void carregaDados() throws FileNotFoundException, IOException {
		List<Negociacao> lista = new EscolhedorDeXml().escolhe();
		ArgentumTableModel model = new ArgentumTableModel(lista);
		tabela.setModel(model);
		
		CandleFactory fabrica = new CandleFactory();
		List<Candle> candles = fabrica.constroiCandles(lista);
		SerieTemporal serie = new SerieTemporal(candles);
		
		GeradorDeGrafico gerador = new GeradorDeGrafico(serie, 2, serie.getTotal() - 1);
		gerador.plotaIndicador(new MediaMovelSimples(new IndicadorFechamento()));
		gerador.plotaIndicador(new IndicadorFechamento());
		gerador.plotaIndicador(new MediaMovelPonderada(new IndicadorAbertura()));
		gerador.salva(new FileOutputStream("Grafico2.png"));
		
		abas.setComponentAt(1, gerador.getPanel());
	}
	
}
