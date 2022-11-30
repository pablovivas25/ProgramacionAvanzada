package paquete;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Persona{
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Persona p1=new Persona("Pablo");
		Persona p4=new Persona("Ana");
		Persona p2=new Persona("Noe");
		Persona p3=new Persona("Pablo");
		
		///Map<Persona,Integer> mapa=new HashMap<Persona,Integer>(); //No se puede ordenar
		Map<Persona,Integer> ordenado =new TreeMap<Persona,Integer>(new OrdenadoDesc());
		
		
		ordenado.put(p1, 1);
		ordenado.put(p2, 1);
		ordenado.put(p4, 1);
		
		if(ordenado.containsKey(p3))
			ordenado.put(p3, ordenado.get(p3)+1);
		
		System.out.println("ORDENADO");
		for(Persona per:ordenado.keySet())
			System.out.println(per + " "+ordenado.get(per));
		
		
	}



}
