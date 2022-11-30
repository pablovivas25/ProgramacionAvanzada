package collection;

import java.util.Vector;

import paquetePersona.Persona;

public class Vect {
	public static void main(String [] args) {
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
		
		Vector<Persona> vp= new Vector<Persona>();
		vp.add(p1);
		vp.add(p2);
		vp.add(p3);
		vp.add(p4);
		vp.add(p5);
		
		System.out.println("------ELEMENTOS DEL VECTOR -------------");
		for(Persona p:vp)
			System.out.println(p.toString());
		vp.remove(p1);
		System.out.println("------MOSTRANDO ELEMENTOS DESPUES DE ELIMINAR PRIMERA POSICION------");
		for(Persona p:vp)
			System.out.println(p.toString());
		
	}
}
