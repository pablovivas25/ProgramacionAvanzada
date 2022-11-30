package abstracta;

public class EntidadPolimorfica {
	/*
	 Una entidad o expresi�n es polim�rfica si, como resultado de asignaciones polim�rficas, puede estar adosada a objetos de diferentes
tipos en tiempo de ejecuci�n
	 * 
	 */
	public static void main(String[] args) {
		Gallina g=new Gallina();
		Gallina g1=new Gallina();
		Animal a1=new Mono();
		Animal a2=new Perro();
		Animal a3=new Gato();
		g.comer(g1);
		g.comer(a1);
		g.comer(a2);
		g.comer(a3);
	}
}
