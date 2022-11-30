package collection;

import java.util.ArrayList;
import java.util.Iterator;

import paquetePersona.Persona;

public class UsoArrayList {
	
	public static void  main(String []args) {
		Persona p1=new Persona("nombre1","apellido1",111);
		Persona p2=new Persona("nombre2","apellido2",222);
		Persona p3=new Persona("nombre3","apellido3",333);
		Persona p4=new Persona("nombre4","apellido4",444);
		Persona p5=new Persona("nombre5","apellido5",555);
		
		ArrayList<Persona> ap=new ArrayList<Persona>();
		ap.add(p1);
		ap.add(p2);
		ap.add(p4);
		
		for(int i=0;i<ap.size();i++)
			System.out.println(ap.get(i).toString());
		System.out.println("----RECORRIENDO CON FOREACH-----");
		
		for(Persona p:ap) {
			System.out.println(p.toString());
		}
		
		ap.add(2, p3);
		ap.add(4,p5);
		System.out.println("----MOSTRANDO DESPUES DE AGREGAR POR POSICION-----");
		for(int i=0;i<ap.size();i++)
			System.out.println(ap.get(i).toString());
		
		ap.remove(0);
		System.out.println("----MOSTRANDO DESPUES DE REMOVER POR POSICION-----");
		for(int i=0;i<ap.size();i++)
			System.out.println(ap.get(i).toString());
		ap.remove(p2);
		System.out.println("----MOSTRANDO DESPUES DE ELIMINAR UNA PERSONA------");
		for(int i=0;i<ap.size();i++)
			System.out.println(ap.get(i).toString());
		
		
		ap.add(p5);
		ap.add(p5);
		///ARRAYLIST ACEPTA DUPLICADOS,creo
		System.out.println("------RECORRIENDO EL ARRAYLIST CON UN ITERATOR------");
		
		Iterator<Persona> ip=ap.iterator();
		while(ip.hasNext()) {
			System.out.println(ip.next());
			
		}
		///SI YO QUIERO ELIMINAR TODAS LAS PERSONA 5
		System.out.println("---ELIMINANDO TODAS LAS PERSONAS P5 CON FOREACH-----");
		/*
		for(Persona p:ap) {
			if(p.equals(p5))
				ap.remove(p5);
		}
		
		*/
		///NO ME DEJA ELIMINAR EL FOREACH MIENTRAS RECORRO LA LISTA
		
		System.out.println("---ELIMINANDO P5 CON UN ITERATOR-----");
		Iterator<Persona> ip2=ap.iterator();
		while(ip2.hasNext()) {
			if(ip2.next().getDNI()==555)
				ip2.remove();
			
		}
		System.out.println("----MOSTRANDO DESPUES DE ELIMINAR P5----");
		for(Persona p:ap) {
			System.out.println(p.toString());		
		}
		
		
	}
}
