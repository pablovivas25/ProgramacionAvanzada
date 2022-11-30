package Private;

public class Ejemplo3 extends Ejemplo1 {
	private int valor3;
	
	public Ejemplo3(int valor1,String nomb1,int valor3) {
		super(valor1,nomb1);
		this.valor3=valor3;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Ejemplo3 [valor3=" + valor3 + "]";
	}

	public static void main(String[] args) {
		Ejemplo1 ej1=new Ejemplo1(25,"Ezequiel");
		ej1.setValor1(26);
		System.out.println(ej1.toString());
		Ejemplo3 ej3=new Ejemplo3(ej1.getValor1(),ej1.getNombre1(),38703964);
		System.out.println(ej3.toString());

	}

}
