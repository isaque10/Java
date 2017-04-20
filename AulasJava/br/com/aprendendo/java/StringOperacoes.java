package br.com.aprendendo.java;

public class StringOperacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inicialização de strings
		String s1 = "Write Once";
		String s2 = s1 + "Run AnyWhere";
		String s3 = new String ("Java Virtual Machine");
		
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		//OPERAÇÕES
		int tamanho = s1.length();//numero de caracteres
		char letra = s1.charAt(0);//localiza caracter no indice x..
		String texto = s1.toString();//retorna a String
		
		//LOCALIZAÇÃO
		int posicao = s3.indexOf("Virtual");//retorna posição da letra, ou que começa a palavra
		int ultima = s3.lastIndexOf('a');
		boolean vazia = s3.isEmpty();
		//System.out.println(vazia);
		
		//COMPARAÇÃO
		String xti = "XTI";
		//boolean x = xti.equals("xti");
		//boolean x = xti.equalsIgnoreCase("xti");//ignora maiusculas ou minusculas
		//boolean x = xti.startsWith("XT");
		boolean x = xti.endsWith("TI");
		int c = "amor".compareTo("bola");//-1 palavra menor
		
		//String so = "olhe, olhe!";
		//boolean o = so.regionMatches(6, "olhe", 0, 4); frequencia que aparece a palavra
		
		//EXTRAÇÃO
		String l = "O Brasil é Lindo";
		//String sl = l.substring(11);//extrai apartir do indice
		String sl = l.substring(2,8);// extrai parte da string
		
		
		//MODIFICAÇÃO
		sl = l.concat(" que Maravilha");//concatena
		sl = l.replace('s', 'z');//troca letras
		sl = l.replaceFirst(" ", "X");//altera um espaço pelo X
		sl = l.replaceAll(" ", "x");
		
		sl = l.toUpperCase();
		sl = l.toLowerCase();
		
		
		System.out.println("     espaços    ".trim());//remove espaços das extremidades
		
		
		
		
	}

}
