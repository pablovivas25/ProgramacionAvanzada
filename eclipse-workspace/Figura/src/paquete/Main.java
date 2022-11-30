package paquete;

import interfaz.Dibujable;

public class Main {

	public static void main(String[] args) {
		
		/*
		Figura f=new Figura();
		Dibujable d=new Dibujable();
		Rotable r=new Rotable();
		
		*No se puede instanciar una clase abstracta
		*o una interfaz
		*
		*/
		
		Rectangulo r1=new Rectangulo(2,3);
		Circulo c1=new Circulo(4);
		
		System.out.println(r1.equals(c1));
		System.out.println(c1.equals(r1));
		System.out.println("Area de Rectangulo "+r1.calcularArea());
		System.out.println("Area de Circulo "+c1.calcularArea());
	}

}
