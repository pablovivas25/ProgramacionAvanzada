package collection;

import java.util.TreeSet;

import paquetePersona.Persona;

public class UsoDeTreeSet {
	public static void  main(String []args) {
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
	
	TreeSet<Persona> tp=new TreeSet<Persona>();
	
	tp.add(p4);
	tp.add(p2);
	tp.add(p3);
	tp.add(p1);
	tp.add(p5);
	
	///LO INSERTA ORDENADO
	///ES NECESARIO IMPLEMENTAR COMPARABLE
	
	for(Persona p: tp)
		System.out.println(p.toString());
	System.out.println("---MOSTRANDO EL ULTIMO------");
	System.out.println(tp.last().toString());
	System.out.println("----MOSTRANDO EL PRIMERO-----");
	System.out.println(tp.first().toString());
	}
}
