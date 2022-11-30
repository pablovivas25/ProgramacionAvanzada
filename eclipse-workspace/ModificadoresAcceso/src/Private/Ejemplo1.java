package Private;


public class Ejemplo1 {
	private int valor1;
	private String nombre1;
	
	public Ejemplo1(int v1,String nom1) {
		this.valor1=v1;
		this.nombre1=nom1;
	}
	
	public int getValor1() {
		return valor1;
	}
	
	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	@Override
	public String toString() {
		return "Ejemplo1 [valor1=" + valor1 + ", nombre1=" + nombre1 + "]";
	}

	public static void main(String[] args) {
		Ejemplo1 ej1=new Ejemplo1(25,"Pablo");
		System.out.println(ej1.nombre1);
		System.out.println(ej1.valor1);
		ej1.valor1+=10;
		System.out.println(ej1.valor1);

	}

}
