package br.com.aprendendo.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.aprendendo.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String[] nomes = {"Ricardo", "Beatriz", "Sandra"};
		
		Conta conta1 = new Conta("xti", 1111.11);
		Conta conta2 = new Conta("bx", 212.21);
		
		/*Escrita de objeto*/
		
		FileOutputStream fos = new FileOutputStream("C:/java/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		/*Leitura de objeto*/
		
		FileInputStream fis = new FileInputStream("C:/java/files/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		ois.close();
	
		c1.exibeSaldo();
		c2.exibeSaldo();
	}

}
