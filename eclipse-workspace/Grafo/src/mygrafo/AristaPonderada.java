package mygrafo;

public class AristaPonderada {
	private Nodo nodo1;
	private Nodo nodo2;
	private int peso;
	
	public Nodo getNodo1() {
		return nodo1;
	}
	public void setNodo1(Nodo nodo1) {
		this.nodo1 = nodo1;
	}
	public Nodo getNodo2() {
		return nodo2;
	}
	public void setNodo2(Nodo nodo2) {
		this.nodo2 = nodo2;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public AristaPonderada(Nodo nodo1, Nodo nodo2, int peso) {
		super();
		this.setNodo1(nodo1);
		this.setNodo2(nodo2);
		this.setPeso(peso);
	}
	
	
}
