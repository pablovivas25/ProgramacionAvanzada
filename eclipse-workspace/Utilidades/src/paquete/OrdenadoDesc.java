package paquete;

import java.util.Comparator;

public class OrdenadoDesc implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		
		return o2.getNombre().compareTo(o1.getNombre());
	}



}
