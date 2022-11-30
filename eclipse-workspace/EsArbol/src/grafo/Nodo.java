package grafo;


public class Nodo implements Comparable<Nodo>{
	private int numero;
	private int grado = 0;

	public Nodo(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void incrementarGrado() {
		this.grado++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grado;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		if (grado != other.grado)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public int compareTo(Nodo o) {
		
		return this.numero-o.getNumero();
	}

}
