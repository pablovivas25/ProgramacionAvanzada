package Protected;

public class Ejemplo1 {
	protected int valor1;
	/*
	public Ejemplo1(int v1) {
		this.valor1=v1;
	}
	*/
	protected void mostrar() {
		System.out.println("Programacion Avanzada");
	}
	public static void main(String[] args) {
	///	Ejemplo1 ej1=new Ejemplo1(25);
		Ejemplo1 ej1=new Ejemplo1();
		ej1.mostrar();

	}

}
