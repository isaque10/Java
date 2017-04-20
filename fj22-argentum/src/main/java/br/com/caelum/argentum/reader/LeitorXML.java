package br.com.caelum.argentum.reader;

import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.caelum.argentum.modelo.Negociacao;

public class LeitorXML {
	//InputStream
	public List<Negociacao> carrega(InputStream inputStream){
		XStream stream = new XStream(new DomDriver());
		stream.alias("negociacao", Negociacao.class);
		return (List<Negociacao>) stream.fromXML(inputStream);
	}
	
	//Reader
	public List<Negociacao> carrega(Reader fonte){
		XStream stream = new XStream(new DomDriver());
		stream.alias("negocio", Negociacao.class);
		return (List<Negociacao>) stream.fromXML(fonte);
	}
	
}
