package unlam.progava.oia;

public class Mesada {
	private int largo;
	private int ancho;

	public Mesada(int largo, int ancho) {
		super();
		this.largo = largo;
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public boolean sePuedeApilar(Mesada otro) {
		if (this.ancho >= otro.ancho && this.largo >= otro.largo)
			return true;
		else if (this.ancho >= otro.largo && this.largo >= otro.ancho)
			return true;
		return false;
	}

	public int getAncho() {
		return ancho;
	}
}
