package collection;

import java.util.Stack;

import paquetePersona.Persona;

public class UsoStack {

	public static void  main(String []args) {
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
		
		Stack<Persona> sp=new Stack<Persona>();
		
		sp.add(p5);
		sp.add(p4);
		sp.add(p3);
		sp.add(p2);
		sp.add(p1);

		for(Persona p:sp)
			System.out.println(p.toString());
		
		System.out.println("----PRIMER ELEMENTO DE LA PILA----");
		System.out.println(sp.firstElement());
		System.out.println("----ULTIMO ELEMENTO DE LA PILA-----");
		System.out.println(sp.lastElement());
	
		sp.push(p5);
		System.out.println("----MOSTRANDO ELEMENTOS DE LA PILA-----");
		for(Persona p:sp)
			System.out.println(p.toString());
		System.out.println("----MOSTRANDO EL ELEMENTO DEL TOPE-----");
		System.out.println(sp.peek().toString());
	}
}
