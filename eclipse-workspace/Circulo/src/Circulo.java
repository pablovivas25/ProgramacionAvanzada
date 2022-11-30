
public class Circulo {
	private Punto p;
	private double radio;
	
	public Circulo(Punto p, double radio) {
		super();
		this.p = p;
		this.radio = radio;
	}
	
	public boolean intersectaCon(Circulo p1) {

	  return this.getP().distance(p1.getP()) < this.getRadio() + p1.getRadio() ;
			  
	}
	
	public double getRadio() {
		return radio;
	}

	public static void main(String[] args) {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		
		System.out.println(c2.intersectaCon(c1));

	}

	public Punto getP() {
		return p;
	}
}
