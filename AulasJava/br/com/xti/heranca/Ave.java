package br.com.xti.heranca;

public class Ave extends Animal {
	
	public Ave(){
		super(0,null);
	}
	void voar(){
		System.out.println("VOOU");
	}
	void botar(){
		System.out.println("Botou ovo");
	}
	@Override
	void fazerBarulho() {
		// TODO Auto-generated method stub
		
	}
}
