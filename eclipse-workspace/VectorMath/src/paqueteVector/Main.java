package paqueteVector;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Vector vec= new Vector("myVector.in");
		System.out.println(vec.toString());
		Vector vec2=new Vector("myVector2.in");
		System.out.println(vec2.toString());
		Vector suma=vec.sumar(vec2);
		System.out.println(suma.toString());
		System.out.println(vec.toString());
	}

}
