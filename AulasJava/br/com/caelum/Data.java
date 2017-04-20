package br.com.caelum;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(){
		
	}
	
	Data(int dia,int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	void mostraData(){
		System.out.println("Data: " + dia + "/" + mes + "/" + ano );
	}
	
}
