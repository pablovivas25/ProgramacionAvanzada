
public class Conexion {
	private Computadora c1;
	private Computadora c2;
	private String letra;
	public Computadora getC1() {
		return c1;
	}
	public void setC1(Computadora c1) {
		this.c1 = c1;
	}
	public Computadora getC2() {
		return c2;
	}
	public void setC2(Computadora c2) {
		this.c2 = c2;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Conexion(Computadora c1, Computadora c2, String letra) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.letra = letra;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c1 == null) ? 0 : c1.hashCode());
		result = prime * result + ((c2 == null) ? 0 : c2.hashCode());
		result = prime * result + ((letra == null) ? 0 : letra.hashCode());
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
		Conexion other = (Conexion) obj;
		if (c1 == null) {
			if (other.c1 != null)
				return false;
		} else if (!c1.equals(other.c1))
			return false;
		if (c2 == null) {
			if (other.c2 != null)
				return false;
		} else if (!c2.equals(other.c2))
			return false;
		if (letra == null) {
			if (other.letra != null)
				return false;
		} else if (!letra.equals(other.letra))
			return false;
		return true;
	}

	
}
