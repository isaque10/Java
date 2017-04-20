package br.com.aprendendo.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		
		/*Create*/
		Path path = Paths.get("C:/java/files/fonte.txt");
		Files.deleteIfExists(path);
		Files.createFile(path);
		Files.write(path,"Meu texto".getBytes());
		
		/*Copy*/
		Path copia = Paths.get("C:/java/files/copia.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		/*
		  
		/*Move*/
		Path mover = Paths.get("C:/java/files/move/fonte.txt");
		Files.createDirectories(mover.getParent());
		Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
		
		 /*
		System.out.println(Files.exists(path));
		System.out.println(Files.isDirectory(path));
		System.out.println(Files.isRegularFile(path));
		System.out.println(Files.size(path));
		System.out.println(Files.getLastModifiedTime(path));
		System.out.println(Files.getOwner(path));
		
		/*DELETE
		Files.delete(path);
		Files.deleteIfExists(path);
		*/
		
	}

}
