import java.util.ArrayList;

public class Persona implements Comparable<Persona>{
	private int dni;
	private String nombre;
	private int edad;
	
	public Persona(int dni,String nombre,int edad) {
		this.dni=dni;
		this.nombre=nombre;
		this.edad=edad;
	}
	@Override
	public int compareTo(Persona obj) {
		return this.dni-obj.dni;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	

	
	public static void main(String[] args) {
		
	}

}
