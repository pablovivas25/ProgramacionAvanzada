package ejerciciovectores;

public class Circulo {
	private double radio;
	
	public Circulo(double r) {
		if(r<0)
			throw new RadioNoValido("NO ES VALIDO EL RADIO");
		this.radio=r;
		
	}
	public double area() {
		return Math.PI*Math.pow(this.radio, 2.5);
	}
	public static void main(String[] args) {
		Circulo c1=new Circulo(-2);
		System.out.println(c1.area());

	}

}
