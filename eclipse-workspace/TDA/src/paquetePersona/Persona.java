package paquetePersona;

public class Persona implements Comparable{
	private String nombre;
	private String apellido;
	private int DNI;
	
	public Persona(String n,String a,int dni) {
		this.nombre=n;
		this.apellido=a;
		this.DNI=dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DNI;
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
		Persona other = (Persona) obj;
		if (DNI != other.DNI)
			return false;
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	@Override
	public int compareTo(Object o) {
		Persona p=(Persona)o;
		
		if(this.DNI-p.DNI<0)
			return -1;
		else if(this.DNI-p.DNI>0)
			return 1;
		else 
			return 0;
	}



	
	
}
