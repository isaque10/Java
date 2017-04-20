package br.com.exercicios.elevador;

public class Elevador {

	private int andar ,andarAnterior;
	private int capacidade;
	private String status;
	private boolean portaAberta = false;
	
	public Elevador(int andar, int capacidade, String status){
		this.andar = andar;
		this.capacidade = capacidade;
		this.status = status;		
	}
	
	public int getAndarAnterior(){
		return andarAnterior;
	}
	
	public void setAndarAnterior(int andarAnterior){
		this.andarAnterior = andarAnterior;
	}
	
	public int getAndar(){
		return andar;
	}
	public void setAndar(int andar){
		this.andar = andar;
	}
	
	public int getCapacidade(){
		return capacidade;
	}
	public void setCapacidade(int capacidade){
		this.capacidade = capacidade;
	}
	
	public String getStatus(){
		return status;
	}
	public void setStatus(String status){
		this.status = status;
	}
	
	public boolean isPortaAberta() {
		return portaAberta;
	}
	public void setPortaAberta(boolean portaAberta) {
		this.portaAberta = portaAberta;
	}
	
	public void subir(){
		setStatus("subindo");
	}
	
	public void descer(){
		setStatus("descendo");
	}
	
	public void abrirPorta(){
		setPortaAberta(true);
	}
	
	public void fecharPorta(){
		setPortaAberta(false);
	}
}
