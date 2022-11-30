
public class Child extends Parent {

	
	public Child(int X) {
	
		System.out.println("B");
	}
	
	public Child() {
		this(123);
		System.out.println("C");
	}
	/* La otra posibilidad a super() es el uso de this() en la primera 
	 * linea de un constructor. Esto lo que hace es invocar a otro constructor 
	 * que este en la misma clase 
	 * y que soporte el conjunto de parámetros que le pasamos.*/
}
