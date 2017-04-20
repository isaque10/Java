package br.com.caelum.argentum.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.AssertionFailedError;

public class NegociacaoTest {

	@Test
	public void dataDaNegociacaoEhImutavel(){
		//se cria um negocio no dia 15
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		Negociacao n = new Negociacao(10, 5, c);
		
		//ainda que eu tente mudar a data para 20..
		n.getData().set(Calendar.DAY_OF_MONTH, 20);
		
		//ele continua 15
		Assert.assertEquals(15, n.getData().get(Calendar.DAY_OF_MONTH));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoCriaNegociacaoComDataNula(){
		new Negociacao(10, 5, null);
	}
	
	@Test
	public void mesmoMilissegundoEhDoMesmoDia(){
		Calendar agora = Calendar.getInstance();
		Calendar mesmoMomento = (Calendar) agora.clone();
		
		Negociacao negociacao = new Negociacao(40.0, 100, agora);
		
		Assert.assertTrue(negociacao.isMesmoDia(mesmoMomento));
		
	}

	@Test
	public void comHorariosDiferentesEhMesmoDia(){
		//usando Gregorian Calendar (ano, mes, dia, hora, minuto)
		Calendar manha = new GregorianCalendar(2011, 10, 20, 8, 30);
		Calendar tarde = new GregorianCalendar(2011, 10, 20, 15, 30);
		
		Negociacao negociacao = new Negociacao(40.0, 100, manha);
		Assert.assertTrue(negociacao.isMesmoDia(tarde));
		
	}

	@Test
	public void mesmoDiaMasMesesDiferenteNaoEhMesmoDia(){
		Calendar mesAtual = new GregorianCalendar(2011, 10, 20, 8, 30);
		Calendar outroMes = new GregorianCalendar(2011, 11, 20, 8, 30);
		
		Negociacao negociacao = new Negociacao(40.0, 100, mesAtual);
		
		Assert.assertFalse(negociacao.isMesmoDia(outroMes));
	}

	@Test
	public void mesmoDiaEMesMasAnosDiferenteNaoSaoDoMesmoDia(){
		Calendar esseAno = new GregorianCalendar(2011, 10, 20, 8, 30);
		Calendar outroAno = new GregorianCalendar(2012, 10, 20, 8, 30);
		
		Negociacao negociacao = new Negociacao(40.0, 100, esseAno);
		
		Assert.assertFalse(negociacao.isMesmoDia(outroAno));
	}
}
