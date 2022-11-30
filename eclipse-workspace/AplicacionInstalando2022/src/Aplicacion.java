
public class Aplicacion  {
	private int memoria;

	public int getMemoria() {
		return memoria;
	}

	public Aplicacion(int memoria) {
		super();
		this.memoria = memoria;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + memoria;
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
		Aplicacion other = (Aplicacion) obj;
		if (memoria != other.memoria)
			return false;
		return true;
	}
	
	
	
	
}
