package br.com.aprendendo.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.MAY, 18);
		Date data = c.getTime();
		
		Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt", "BR");
		Locale eua = new Locale("en", "UE");
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(data));//locale BR

		f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println(f.format(data));//locale BR
		
		f = DateFormat.getDateInstance(DateFormat.FULL, eua);
		System.out.println(f.format(data));//locale EUA
		
	}

}
