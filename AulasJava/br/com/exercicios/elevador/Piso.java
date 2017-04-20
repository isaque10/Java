package br.com.exercicios.elevador;

public class Piso{
	
	private int num;
	
	public Piso(int num){
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
	 
	public int chamarElevador(Elevador e1, Elevador e2){
		//elevador 1 mais próximo
		if(Math.abs(e1.getAndar()-num) <= Math.abs(e2.getAndar()-num)){
			if(e1.getAndar() < num){
				e1.setAndarAnterior(e1.getAndar());
				e1.subir();
				e1.setAndar(num);
			} else if(e1.getAndar() > num){
				e1.setAndarAnterior(e1.getAndar());
				e1.descer();
				e1.setAndar(num);
			} else {
				e1.abrirPorta();
			}
			return 1;
		}
		//elevador 2 mais próximo
		else{
			if(e2.getAndar() < num){
				e2.setAndarAnterior(e2.getAndar());
				e2.subir();
				e2.setAndar(num);
			} else if(e2.getAndar() > num){
				e2.setAndarAnterior(e2.getAndar());
				e2.descer();
				e2.setAndar(num);
			} else {
				e2.abrirPorta();
			}
			return 2;
		}
	}
}
