package Default;


public class Ejemplo1 {
	int atributo1;
	static int contador=0;
	
	public Ejemplo1(int atr1,int cont) {
		this.atributo1=atr1;
		this.contador=cont;
	}
	
	@Override
	public String toString() {
		return "Ejemplo1 [atributo1=" + atributo1 + ", contador=" + contador + "]";
	}

	public static void main(String[] args) {
		Ejemplo1 ej1=new Ejemplo1(25,3);
		System.out.println(ej1.toString());
		System.out.println(ej1.atributo1);
		System.out.println(ej1.contador);
		ej1.contador+=10;
		System.out.println();
		//System.out.println(ej1.contador);
		///System.out.println(ej1.contador);
		///System.out.println(ej1.atributo1);

	}
}