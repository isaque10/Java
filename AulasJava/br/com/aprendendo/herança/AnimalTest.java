/**
 * Classe para testar os animais
 * @author isaque
 */
package br.com.aprendendo.herança;

public class AnimalTest {
	
	public static void barulho(Animal animal){
		animal.fazerBarulho();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.dormir();
		
		toto.fazerBarulho();
		carijo.fazerBarulho();
		//metodo direto...
		barulho(toto);
	}

}
/*
//exibe se o objeto x pertence a classe y
System.out.println(toto instanceof Cachorro );
//compara objetos
System.out.println(toto.equals(carijo));
//exibe a classe do objeto
System.out.println(toto.getClass());
// exibe objeto na forma de String
System.out.println(toto.toString());
*/