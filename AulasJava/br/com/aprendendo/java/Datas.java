package br.com.aprendendo.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		/* 01 de jan 1970*/
		
		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000_000L);
		/*métodos*/
		
		data.getTime();
		data.setTime(1_000_000_000_000L);
		data.compareTo(agora);
		
		/*GregorianCalendar*/
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		
		System.out.println(c.get(Calendar.YEAR));//ano
		System.out.println(c.get(Calendar.MONTH));//Mes
		
		c.set(Calendar.YEAR, 1972);//altera o ano
		System.out.println(c.get(Calendar.YEAR));//ano
		
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_MONTH, 1);//não altera o mês, somente o dia
		
		/*Saudação de Bom Dia, Boa Tarde ou Boa noite*/
		
		Calendar c1 = Calendar.getInstance();
		
		
		c1.set(Calendar.HOUR_OF_DAY, 12);
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora >= 12 && hora < 18) {
			System.out.println("Boa Tarde");
		}
		else
			System.out.println("Boa noite");
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
	}
	
}
