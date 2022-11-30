package interfaz;

import paquetePersona.Persona;

public interface Cola {
	public int add(Persona p);
	public int offer(Persona p);
	public Persona remove();
	public Persona poll();
	public Persona element();
	public Persona peek();
	public boolean isEmpty();
	public void empty();
}
