/**
 * AutoBoxing
 * @author Isaque
 */
package br.com.aprendendo.logica;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer x = new Integer(555);//empacotado
		int a = x.intValue();//desempacotado
		a++;
		x = new Integer(a);//re-empacotar
		System.out.println(x.intValue());
		
	}

}
