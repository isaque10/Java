package br.com.xti.logica;
import java.util.Random;
import javax.swing.JOptionPane;

public class ArraySimples{
	
	public static void main(String[] args){
		
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","Dama","Valete","Rei"};
		String[] nipes = {"Copas","Espadas","Ouro","Paus"};
		int x;
		for(x=0;x<5;x++){
			
			Random r = new Random();
			int indiceFaces = r.nextInt(faces.length);
			String face = faces[indiceFaces];
		
			int indiceNipes = r.nextInt(nipes.length);
			String nipe = nipes[indiceNipes];
			
			String carta = face + " " + nipe;
			JOptionPane.showMessageDialog(null, carta );
		
			
		}
	}
}