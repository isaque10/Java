package br.com.aprendendo.threads;

public class ContaConjunta {
	private int saldo = 100;
	
	public int getSaldo(){
		return saldo;
	}
	
	public synchronized void sacar(int valor, String cliente){
		int saldoOriginal = saldo;
		if(saldo >= valor){
			System.out.println(cliente + " vai sacar");
			try {
				System.out.println("Aguarde um momento!");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//aguardando processamento
			saldo -= valor;
			System.out.println(cliente + " SACOU " + valor);
			System.out.println(" [Saldo Original]: " + saldoOriginal + " [Saldo Final]: " + saldo);
		} else{
			System.out.println(cliente + " Saldo insuficiente");
		}
	}
	
}
