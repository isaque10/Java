/**
 * Array Multidimensional
 * @author Isaque Felix da Silva
 */
package br.com.aprendendo.logica;

import java.util.Arrays;
import java.util.Random;

public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] duas = {{"Ricardo","M", "DF"},{"Sandra", "F", "PR"},{"Isaque", "M", "SP"}};
		System.out.println(Arrays.toString(duas[0]));
	
		String[] faces = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] nipes = {"Espadas", "Ouro", "Paus", "Copas"};
		
		Random f = new Random();
		int indiceFace = f.nextInt(faces.length);
		String faceFinal = faces[indiceFace];
		
		Random n = new Random();
		int indiceNipe = n.nextInt(nipes.length);
		String nipeFinal = nipes[indiceNipe];
		
		System.out.println(faceFinal + " " + nipeFinal);
		
	}
}
