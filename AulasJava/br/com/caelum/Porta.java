package br.com.caelum;

public class Porta {
	String cor;
	boolean portaAberta = false;
	
	void abrePorta(){
		this.portaAberta = true;
	}
	
	void fechaPorta(){
		this.portaAberta = false;
	}
}
