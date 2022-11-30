package Default;

public class Ejemplo2 {

	public static int getContador() {
		return Ejemplo1.contador;
	}
 public static void main(String[] args) {
	 Ejemplo1 ejem1=new Ejemplo1(40,30);
	 System.out.println(ejem1.atributo1);
	 System.out.println(ejem1.contador);
	 Ejemplo2 ej2=new Ejemplo2();
	 System.out.println(ej2.getContador());
	}

}
