package Protected;

public class Ejemplo2 extends Ejemplo1{
	protected int valor2;
	public Ejemplo2(int valor1,int valor2) {
		super(valor1);
		this.valor2=valor2;
	}
	public static void main(String[] args) {
		Ejemplo2 ej2=new Ejemplo2(25,26);
		ej2.mostrar();
		System.out.println(ej2.valor1);/// ACCESIBLE VALOR DE LA CLASE BASE 

	}

}
