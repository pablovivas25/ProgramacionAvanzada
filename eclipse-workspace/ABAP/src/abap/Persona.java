package abap;

public class Persona {
	private int ID;
	private String nombre;

	public Persona(int id, String nomb) {
		this.ID = id;
		this.nombre = nomb;
	}

	public int getID() {
		return ID;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Persona [ID=" + ID + ", nombre=" + nombre + "]";
	}

}
