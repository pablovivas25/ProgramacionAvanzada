package collection;

import java.util.LinkedList;

import paquetePersona.Persona;

public class UsoDeLinkedList {
	
	public static void main(String[]args) {
		
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
		
		/*i tenemos una lista y lo que nos importa no es buscar la informaci�n lo m�s r�pido posible,
		 *  sino que la inserci�n o eliminaci�n se hagan lo m�s r�pidamente posible, LinkedList resulta 
		 *  una implementaci�n muy eficiente y aqu� radica uno de los motivos por los que es interesante y 
		 *  por los que esta clase se usa en la programaci�n en Java.
		 *  
		 *  
		 *  Si a priori pensamos que es mejor utilizar una implementaci�n con ArrayList porque pensamos que 
		 *  las b�squedas van a ser la mayor�a de las operaciones, entonces pondremos algo as�: 
		 *  List listaObjetos = new ArrayList();

			Por el contrario si pensamos a priori que la mayor�a de las operaciones sobre esta lista de objetos
			van a ser inserciones o eliminaciones sobre listas grandes escribiremos: 
			List listaObjetos = new LinkedList();
			
		 *  
		 *  */
		LinkedList<Persona> lp=new LinkedList<Persona>();
		
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		lp.add(p4);
		lp.add(p5);
		
		for(Persona p:lp) {
			System.out.println(p.toString());
		}
		
		lp.removeFirst();
		System.out.println("----MOSTRANDO LA LISTA DESPUES DE ELIMINAR EL PRIMERO------");
		for(Persona p:lp) {
			System.out.println(p.toString());
		}
		lp.removeLast();
		System.out.println("----MOSTRANDO LA LISTA DESPUES DE ELIMINAR EL ULTIMO-------");
		for(Persona p:lp) {
			System.out.println(p.toString());
		}
		lp.addFirst(p1);
		System.out.println("-----MOSTRANDO LA LISTA DESPUES DE AGREGAR AL PRINCIPIO------");
		for(Persona p:lp) {
			System.out.println(p.toString());
		}
		lp.addLast(p5);
		System.out.println("----MOSTRANDO LA LISTA DESPUES DE AGREGAR AL FINAL----------");
		for(Persona p:lp) {
			System.out.println(p.toString());
		}
		System.out.println("-----MOSTRANDO EL PRIMER ELEMENTO DE LA LISTA-----");
		System.out.println(lp.element().toString());
		
		
	}

}
