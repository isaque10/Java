package br.com.aprendendo.colecao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtil {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Guaraná");
		list.add("Uva");
		list.add("Manga");
		list.add("Goiaba");
		list.add("Laranja");
		System.out.println(list);
		
		Collections.sort(list);//ordenar
		System.out.println(list);
		
		Collections.reverse(list);//ordem inversa
		System.out.println(list);
		
		Collections.shuffle(list);//embaralhar
		System.out.println(list);
		
		Collections.addAll(list, "Cupuaçu", "Abacate", "Laranja");
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Laranja"));
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guaraná");
		System.out.println(indice);
		
		/*coleção não modificada*/
		Collection<String> constante = Collections.unmodifiableCollection(list);
	}

}
