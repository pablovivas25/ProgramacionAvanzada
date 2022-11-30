package Private;
public class Ejemplo2  {
	private int valor2;
	
	public Ejemplo2(int v2) {
		this.valor2=v2;
	}
	
	@Override
	public String toString() {
		return "Ejemplo2 [valor2=" + valor2 + "]";
	}

	public static void main(String[] args) {
		Ejemplo1 ej1=new Ejemplo1(23,"Rodrigo");
		System.out.println(ej1.toString());
		//ej1.valor1+=10;//NO ES VISIBLE DESDE OTRA CLASE
		//System.out.println(ej1.valor1);
		ej1.setValor1(ej1.getValor1()+10);///Para modificar algun campo debo usar los set y get
		System.out.println(ej1.toString());

	}

}
