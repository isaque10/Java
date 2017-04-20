/**
 * Conta
 * @author Isaque
 */
package br.com.aprendendo.poo;

public class Conta implements java.io.Serializable{
	// Atributos
	
	String cliente;
	double saldo;
	
	public Conta(){}
	public Conta(String cliente, Double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	// Métodos
	
	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}

	// Métodos com parametros

	public String getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	void saca(double valor) {
		saldo -= valor;
	}

	void deposita(double valor) {
		saldo += valor;
	}

	void tranferePara(Conta destino, double valor) {
		//desta conta para....
		this.saca(valor);
		destino.deposita(valor);
	}
}
