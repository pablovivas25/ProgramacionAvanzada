package mygrafo;

public class Nodo {
	private int numero;
	private int grado=0;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	public void incrementarGrado() {
		this.grado++;
	}
	public Nodo(int numero) {
		super();
		this.setNumero(numero);;
	}
	
	
	
	

}
