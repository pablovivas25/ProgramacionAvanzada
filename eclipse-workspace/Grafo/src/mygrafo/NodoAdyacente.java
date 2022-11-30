package mygrafo;

public class NodoAdyacente implements Comparable<NodoAdyacente> {
	
	private Nodo nodo;
	private int costo;
	public Nodo getNodo() {
		return nodo;
	}
	public void setNodo(Nodo nodo) {
		this.nodo = nodo;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public NodoAdyacente(Nodo nodo, int costo) {
		super();
		this.nodo = nodo;
		this.costo = costo;
	}
	@Override
	public int compareTo(NodoAdyacente o) {
		
		return this.costo-o.getCosto();
	}
	
	

}
