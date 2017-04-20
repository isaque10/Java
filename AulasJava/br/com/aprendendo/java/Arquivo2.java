package br.com.aprendendo.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Path path = Paths.get("C:/java/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		/* Escrita*/
		BufferedWriter w = null;
		try{
			w = Files.newBufferedWriter(path, utf8 );
			w.write("Texto\n");
			w.write("Texto\n");
			w.write("Outro Texto\n");
			w.write("Final");
			
			w.flush();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			if(w != null)
				w.close();
		}
		
		/*Leitura*/
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
				
				
	}

}
