package interfaz;

import paquetePersona.Persona;

public interface Pila {
	public boolean IsEmpty();
	public void empty();
	///public int search(Persona p);
	public Persona peek();
	public int push(Persona p);
	public Persona pop();
}
