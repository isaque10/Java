/**
 * FOREACH
 * @author Isaque Felix da Silva
 */
package br.com.aprendendo.logica;

import java.util.ArrayList;
public class Fluxo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] pares = {2,4,6,8};
		
		for(int i=0; i<pares.length; i++){
			int par = pares[i];
			System.out.println(par);
		}
		
		for(int par : pares){
			System.out.println(par);
		}*/
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		for(Integer numero : list){
			System.out.println(numero);
		}
	}

}
