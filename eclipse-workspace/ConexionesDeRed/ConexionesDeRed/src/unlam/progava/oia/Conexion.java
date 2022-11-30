package unlam.progava.oia;

public class Conexion {
	private Computadora nodo1;
	private Computadora nodo2;
	private String letra;
	
	public Conexion(Computadora nodo1, Computadora nodo2, String letra) {
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
		this.letra = letra;
	}

	public Computadora getNodo1() {
		return nodo1;
	}

	public void setNodo1(Computadora nodo1) {
		this.nodo1 = nodo1;
	}

	public Computadora getNodo2() {
		return nodo2;
	}

	public void setNodo2(Computadora nodo2) {
		this.nodo2 = nodo2;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}
}
