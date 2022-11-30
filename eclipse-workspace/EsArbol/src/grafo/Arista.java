package grafo;




public class Arista {
	private Nodo nodo1;
	private Nodo nodo2;
	
	public Arista(Nodo nodo1, Nodo nodo2) {
		super();
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
	}

	public Nodo getNodo1() {
		return nodo1;
	}

	public Nodo getNodo2() {
		return nodo2;
	}
	
	
}
