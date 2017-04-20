package br.com.aprendendo.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("C:/java/files/texto.txt");
		System.out.println(path.toAbsolutePath());
		
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		
		/*CRIANDO DIRETÓRIO PARA ARMAZENAR O ARQUIVO*/
		Files.createDirectories(path.getParent());
		
		/*Escrever e ler arquivos*/
		byte[] bytes = "Meu texto".getBytes();
		Files.write(path, bytes);//cria,limpa,escreve
	
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
		
		
	}

}
