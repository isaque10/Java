package br.com.xti.poo;

public class ContaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.cliente = "Isaque";
		conta.saldo = 1_000.00;
		conta.exibeSaldo();
		
		conta.saca(500);
		conta.exibeSaldo();
		
		conta.deposita(180.00);
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "João";
		destino.saldo = 450.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino,210.00);
		
		conta.exibeSaldo();
		destino.exibeSaldo();
	}

}
