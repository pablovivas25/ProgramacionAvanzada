package paquetepruebas;

public class Persona implements Cloneable {
	private String nombre;
	private String apellido;
	private int DNI;
	
	public Persona(String name,String app,int dni) {
		this.nombre=name;
		this.apellido=app;
		this.DNI=dni;
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}
	
	public Persona clone() throws CloneNotSupportedException {
		return (Persona)super.clone();
	}
	
}
