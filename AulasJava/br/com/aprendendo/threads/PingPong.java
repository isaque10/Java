package br.com.aprendendo.threads;

public class PingPong extends Thread {
	
	String palavra;
	long tempo;
	
	public PingPong(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run(){
		try {
			for(int i = 0; i<5 ; i++){
				System.out.println(palavra);
				Thread.sleep(tempo);//método de espaço de tempo
			}
		} catch (InterruptedException e) {
			return;
		}
	}
	
	public static void main(String[] args) {
		
		new PingPong("ping", 2000).start();
		new PingPong("PONG", 3000).start();
		
	}

}
