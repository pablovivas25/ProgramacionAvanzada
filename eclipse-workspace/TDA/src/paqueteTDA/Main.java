package paqueteTDA;

import paquetePersona.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
		///Persona sacar;
		/*
		PilaEstatica pila=new PilaEstatica();
		pila.push(p1);
		pila.push(p2);
		pila.push(p3);
		pila.push(p4);
		pila.push(p5);
		
		System.out.println("----MOSTRANDO ELEMENTOS DE LA PILA ESTATICA----");
		System.out.println(p3);
		System.out.println(p2);
		System.out.println(p1);
		System.out.println("----MOSTRANDO LO QUE HAY EN EL TOPE----");
		System.out.println(pila.peek().toString());
		System.out.println("----SACAMOS UN ELEMENTO DE LA PILA----");
		System.out.println(pila.pop().toString());
		System.out.println("----MOSTRAMOS EL NUEVO TOPE------");
		System.out.println(pila.peek().toString());
		System.out.println(pila.IsEmpty()==true?"ESTA VACIA":"NO ESTA VACIA");
		pila.pop();
		pila.pop();
		pila.pop();
		System.out.println(pila.peek().toString());
		pila.pop();
		System.out.println(pila.IsEmpty()==true?"ESTA VACIA":"NO ESTA VACIA");
		*/
		
		ColaEstatica cola=new ColaEstatica();
		System.out.println("----MOSTRANDO ELEMENTOS DE LA COLA ESTATICA----");
		System.out.println(p5);
		System.out.println(p4);
		System.out.println(p3);
		System.out.println(p2);
		System.out.println(p1);
		cola.offer(p1);
		cola.offer(p2);
		cola.offer(p3);
		cola.offer(p4);
		cola.offer(p5);
		
		System.out.println("----MOSTRANDO PRIMER ELEMENTO DE LA COLA ESTATICA----");
		System.out.println(cola.peek().toString());
		System.out.println("----MOSTRANDO ELEMENTO SACADO DE LA COLA ESTATICA----");
		System.out.println(cola.poll().toString());
		System.out.println("----MOSTRANDO NUEVO FRENTE----");
		System.out.println(cola.peek().toString());
		System.out.println(cola.IsEmpty()==true?"ESTA VACIA":"NO ESTA VACIA");
		cola.empty();
		System.out.println(cola.IsEmpty()==true?"ESTA VACIA":"NO ESTA VACIA"); 
		
		

	}

}
