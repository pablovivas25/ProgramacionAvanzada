
public class Luchador {
	private int peso;
	private int altura;
	
	public Luchador(int peso, int altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + altura;
		result = prime * result + peso;
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
		Luchador other = (Luchador) obj;
		if (altura != other.altura)
			return false;
		if (peso != other.peso)
			return false;
		return true;
	}
	
	
	
	
	
	
}
