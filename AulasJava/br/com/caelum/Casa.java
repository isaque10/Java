package br.com.caelum;

public class Casa {
	String cor;
	Porta[] portas;
	int contaPortas = 0;
	void pinta(String s){
		this.cor = s;
	}
	
	int quantasPortasAbertas(){
		
		int portaAberta = 0;
		for(int i=0;i<this.contaPortas;i++){
			if(portas[i].portaAberta){
				portaAberta++;
			}
		}
		return portaAberta;
	}
	
	void adicionaPorta(Porta p){
		this.portas[this.contaPortas] = p;
		this.contaPortas++;
	}
	
	int totalDePortas(){
		return this.contaPortas;
	}
}
