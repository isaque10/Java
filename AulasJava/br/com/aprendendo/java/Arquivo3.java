package br.com.aprendendo.java;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import br.com.aprendendo.poo.Conta;

public class Arquivo3 {
	
	private Path path = Paths.get("C:/java/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;
	public void escreve(ArrayList<Conta> array) throws IOException{
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
			
			for (Conta conta : array) {
				w.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<Conta> recuperarContas() throws IOException{
		ArrayList<Conta> contas = new ArrayList<>();
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine()) !=null){
				String [] t = line.split(";");
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
		return contas;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Arquivo3 arquivo = new Arquivo3();
		/*
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("João", 16000.23));
		contas.add(new Conta("José", 13000.23));
		contas.add(new Conta("Maria", 2000.23));
		
		arquivo.escreve(contas);
		*/ArrayList<Conta> contas2 = arquivo.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		}
	}

}
