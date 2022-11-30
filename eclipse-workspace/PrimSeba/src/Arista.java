
public class Arista implements Comparable<Arista>{
	private Nodo NodoInicial;
	private Nodo NodoFinal;
	private int Peso;
	


	public Arista(Nodo NodoInicial, Nodo NodoFinal, int peso) {
		super();
		this.NodoInicial = NodoInicial;
		this.NodoFinal = NodoFinal;
		Peso = peso;
	}
	
	
	


	public Nodo getNodoInicial() {
		return NodoInicial;
	}
	
	
	public Nodo getNodoFinal() {
		return NodoFinal;
	}
	
	
	public int getPeso() {
		return Peso;
	}





	@Override
	public int compareTo(Arista o) {
		return this.Peso-o.Peso;
		
	}
}
