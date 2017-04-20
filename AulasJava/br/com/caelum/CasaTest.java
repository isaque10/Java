package br.com.caelum;

public class CasaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Porta p1 = new Porta();
		p1.cor = "azul";
		
		Porta p2 = new Porta();
		p2.cor = "azul";
		
		Casa casa = new Casa();
		casa.portas = new Porta[10];
		
		p1.abrePorta();
		p2.abrePorta();
		
		casa.adicionaPorta(p1);
		casa.adicionaPorta(p2);
		
		System.out.println(casa.quantasPortasAbertas());
		System.out.println(casa.totalDePortas());
	}

}
