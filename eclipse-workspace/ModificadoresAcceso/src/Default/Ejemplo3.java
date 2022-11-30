package Default;

public class Ejemplo3 extends Ejemplo1{
	int atributo3;
	
	public Ejemplo3(int atr1,int cont,int atr3) {
		super(atr1,cont);
		this.atributo3=atr3;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Ejemplo3 [atributo3=" + atributo3 +  "]";
	}

	public static void main(String[] args) {
		Ejemplo3 ej3=new Ejemplo3(30,2,25);
		System.out.println(ej3.toString());

	}

}
