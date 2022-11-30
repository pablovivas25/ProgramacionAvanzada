package collection;

import java.util.PriorityQueue;
import java.util.Queue;

import paquetePersona.Persona;

public class UsoDePrioriryQueue  {
	
	public static void main(String[]args) {
		
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
		
		///HAY QUE IMPLEMENTAR EN LA CLASE PERSONA COMPARABLE PORQUE NECESITA TENER EL METODO COMPARETO
		PriorityQueue<Persona> cp=new PriorityQueue<Persona>();
		
		cp.add(p5);
		cp.add(p4);
		cp.add(p3);
		cp.add(p2);
		cp.add(p1);

		for(Persona p:cp)
			System.out.println(p.toString());
		
		System.out.println("----MOSTRANDO EL PRIMER ELEMENTO-----");
		System.out.println(cp.element());
	}



	
	
	
}
