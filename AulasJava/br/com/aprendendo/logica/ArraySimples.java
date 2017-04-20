/**
 * Array Simples
 * @author Isaque Felix da Silva
 */
package br.com.aprendendo.logica;

import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String[] paises = {"Brasil", "Russia", "India", "China"};
		System.out.println(paises[0]);
		System.out.println(paises.length);
		//exibe todos em um array
		System.out.println(Arrays.toString(paises));
		// exibe posicao de escolha
		System.out.println(Arrays.binarySearch(paises,"Russia"));
		//coloca em ordem
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
	}

}
