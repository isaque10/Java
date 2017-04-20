/**
 * Conta Test
 * @author Isaque
 */
package br.com.aprendendo.poo;

public class ContaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta1 = new Conta();
		conta1.cliente = "Isaque";
		conta1.saldo = 250.00;
		conta1.exibeSaldo();

		conta1.saca(70.00);
		conta1.exibeSaldo();
		
		conta1.deposita(1000);
		conta1.exibeSaldo();
		
		Conta conta2 = new Conta();
		conta2.cliente = "João";
		conta2.saldo = 500.00;
		conta2.exibeSaldo();
		
		conta1.tranferePara(conta2, 500.50);
		conta1.exibeSaldo();
		conta2.exibeSaldo();
	}

}
