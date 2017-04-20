/**
 * Break Continue e rótulos
 * @author Isaque Felix da Silva
 */
package br.com.aprendendo.logica;

public class Fluxo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] matrix=
			{
					{false, true, false, false,false},
					{false, false,false,false, false}
			};
		busca:
		for(int a=0; a < matrix.length; a++){
			System.out.print("A ");
			for(int b=0; b < matrix[a].length; b++){
				if(matrix[a][b]){
					System.out.print("TRUE ");
					continue busca;
				}
				else
					System.out.print("B ");
			}
		}
	}

}
