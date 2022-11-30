package collection;

import java.util.HashSet;
import java.util.Set;

import paquetePersona.Persona;

public class UsoHashSet {
	public static void  main(String []args) {
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
		
		Set<Persona> sp=new HashSet<Persona>();
		
		sp.add(p1);
		sp.add(p2);
		sp.add(p3);
		sp.add(p4);
		sp.add(p5);
		
		for(Persona p:sp)
			System.out.println(p.toString());
		
		sp.add(p1);
		sp.add(p2);
		sp.add(p4);
		
		///NO ADMITE DUPLICADOS
		///
		System.out.println("-----ELEMENTOS DESPUES DE AGREGAR P1------");
		for(Persona p:sp)
			System.out.println(p.toString());
	
		sp.remove(p1);
		System.out.println("----MOSTRANDO ELEMENTOS DESPUES DE ELIMINAR----");
		for(Persona p:sp)
			System.out.println(p.toString());
	
	}
}
