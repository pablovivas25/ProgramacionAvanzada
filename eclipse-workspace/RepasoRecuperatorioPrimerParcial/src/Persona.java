import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Persona implements Comparable<Persona> {
	private int  edad;
	
	public Persona(int edad) {
		super();
		this.edad = edad;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		return true;
	}



	public static void main(String[] args) {
		int []vec= {1,1,3,4,5,6,7,8,6,5,3,2,1,1};
		//Se necesita un metodo que dado un array de string y un int X retorne las X palabras mas largas de dicho array. 
		//Todas las palabras tienen una longitud distinta.
		String[] vec_string= {"ab","pablo","juan","materia del orto","abecedario","qatar","vamos argentina"};
		Arrays.sort(vec_string,  (str1, str2) -> str2.length() - str1.length());
		int x=2;
		for(int i=0;i<x;i++)
			System.out.println(vec_string[i]);
//		for(String s:vec_string)
//			System.out.println(s);
		//supongamos que quiero eliminar los repetidos
		
		Set<Integer> sin_duplicados=new HashSet<Integer>();
		
		for(int i=0;i<vec.length;i++)
			sin_duplicados.add(vec[i]);
		
		for ( Integer i: sin_duplicados) {
			System.out.println(i);
		}
		
		System.out.println();
		Persona [] p= {new Persona(20),new Persona(35),new Persona(45),new Persona(45),new Persona(20),new Persona(10)};
		
		//supongamos que quiero eliminar repetidos de personas
		Set<Persona> personas_sin=new TreeSet<Persona>();
		
		// Si uso objetos tengo que implementar equals para que no inserte duplicado
		// y para inserte ordenado usar Treset
		for(Persona per:p)
			personas_sin.add(per);
		
		for(Persona p1:personas_sin)
			System.out.println(p1.getEdad());
		
		System.out.println();
		// operaciones de conjuntos
		
		Set<Integer> c1=new HashSet<Integer>();
		c1.add(1);
		c1.add(10);
		c1.add(2);
		c1.add(15);
		
		Set<Integer> c2=new HashSet<Integer>();
		c2.add(1);
		c2.add(10);
		c2.add(2);
		c2.add(15);
		c2.add(24);
		c2.add(39);
		

		//Interseccion entre conjuntos
		//
		//c1.retainAll(c2);
		
		//Union entre conjuntos
	//	c1.addAll(c2);
		
		//Diferencia entre conjuntos
		
		//c1.removeAll(c2);
		
		System.out.println(c1.size());
		
		c2.removeAll(c1);
		System.out.println(c2.size());
		
		System.out.println("diferencia entre conjuntos");
		for(Integer i2:c2)
			System.out.println(i2);
		
		//https://programmerclick.com/article/5146213903/
	}



	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.edad-o.getEdad();
	}
}
