package br.com.caelum.argentum.reader;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.util.List;

import org.junit.Test;

import com.thoughtworks.xstream.converters.ConversionException;

import br.com.caelum.argentum.modelo.Negociacao;
import junit.framework.Assert;

public class LeitorXMLTest {

	
	@Test
	public void carregaXmlComTresNegociacoesEmLista(){
			String xmlDeTeste = "<list>" +
								"<negocio>" +
									" <preco>43.5</preco>" +
									" <quantidade>1000</quantidade>" +
									" <data>" +
									" 	<time>1322233344455</time>" +
									" </data>" +
								"</negocio>" +
								"<negocio>" +
									" <preco>50.5</preco>" +
									" <quantidade>1000</quantidade>" +
									" <data>" +
									" 	<time>1322233344455</time>" +
									" </data>" +
								"</negocio>" +
								"<negocio>" +
									" <preco>38.5</preco>" +
									" <quantidade>1000</quantidade>" +
									" <data>" +
									" 	<time>1322233344455</time>" +
									" </data>" +
								"</negocio>" +
								"</list>";
			
			
			LeitorXML leitor = new LeitorXML();
			List<Negociacao> negocios = leitor.carrega(new StringReader(xmlDeTeste));
			
			Assert.assertEquals(3, negocios.size());
			Assert.assertEquals(50.5, negocios.get(1).getPreco(), 0.00001);
			Assert.assertEquals(1000, negocios.get(0).getQuantidade());
	}
	
	@Test
	public void carregaXmlComUmNegocioEmListaUnitaria() {
		String xmlDeTeste = "<list>" +
							" <negocio>" +
								" <preco>43.5</preco>" +
								" <quantidade>1000</quantidade>" +
								" <data>" +
								" 	<time>1322233344455</time>" +
								" </data>" +
							" </negocio>" +
							"</list>";
		
		
		LeitorXML leitor = new LeitorXML();
		List<Negociacao> negocios = leitor.carrega(new StringReader(xmlDeTeste));
		
		Assert.assertEquals(1, negocios.size());
		Assert.assertEquals(43.5, negocios.get(0).getPreco(), 0.00001);
		Assert.assertEquals(1000, negocios.get(0).getQuantidade());
	}
	
	@Test
	public void carregaXmlComUmaNegociacaoEmListaUnitaria() {
		String xmlDeTeste = "<list>" +
							  " <negociacao>" +
							  	"<preco>43.5</preco>" +
							  	"<quantidade>1000</quantidade>" +
							  	"<data>" + 
							  		"<time>1322233344455</time>" + 
							  	"</data>" +
							  "</negociacao>" +
							"</list>";
		
		LeitorXML leitor = new LeitorXML();
		InputStream xml = new ByteArrayInputStream(xmlDeTeste.getBytes());
		List<Negociacao> negociacoes = leitor.carrega(xml);
		
		Assert.assertEquals(1, negociacoes.size());
		Assert.assertEquals(43.5, negociacoes.get(0).getPreco(), 0.00001);
		Assert.assertEquals(1000, negociacoes.get(0).getQuantidade());
	}
	
	@Test(expected = ConversionException.class)
	public void todosOsCamposDoXmlDevemEstarPreenchidos(){
		String xmlDeTeste = "<list>" +
				  " <negociacao>" +
				  	"<preco></preco>" +
				  	"<quantidade></quantidade>" +
				  	"<data>" + 
				  		"<time>1322233344455</time>" + 
				  	"</data>" +
				  "</negociacao>" +
				"</list>";

		LeitorXML leitor = new LeitorXML();
		InputStream xml = new ByteArrayInputStream(xmlDeTeste.getBytes());	
		List<Negociacao> negociacoes = leitor.carrega(xml);
		
	}
}