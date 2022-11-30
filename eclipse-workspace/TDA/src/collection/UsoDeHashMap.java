package collection;

import java.util.HashMap;
import java.util.Iterator;

import paquetePersona.Persona;

public class UsoDeHashMap {

	public static void main(String[] args) {
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
		
		HashMap<Integer,Persona> hp=new HashMap<Integer,Persona>();
		
		hp.put(555, p1);
		hp.put(444, p2);
		hp.put(333, p3);
		hp.put(222, p4);
		hp.put(111, p5);
		
		Iterator<Integer> it=hp.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key=(Integer)it.next();
			System.out.println(key+" "+hp.get(key));
		}
		
	}

}
