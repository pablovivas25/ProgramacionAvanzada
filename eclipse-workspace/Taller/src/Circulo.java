
public class Circulo {
	private double radio;
	private Punto p;
	
	public Circulo(Punto p,double r) {
		this.p=p;
		this.radio=r;
	}
	
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", p=" + p + "]";
	}


	public boolean intersectaCon(Circulo c1) {
		if(this.p.getModulo()+c1.p.getModulo()<=c1.radio+this.radio || (this.p.getModulo()+c1.p.getModulo() <= Math.abs(c1.radio-this.radio)))
			return true;
		return false;
		 //https://www.youtube.com/watch?v=OnbR5sdgYes 
	      ///ultimo tres minutos
	}
	public static void main(String[] args) {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		Circulo c3=new Circulo(new Punto(8.4,12.7),3.0);
		Circulo c4=new Circulo(new Punto(8.0,12.0),2.0);
		Circulo c5=new Circulo(new Punto(16.0,7.8),2.7);
		Circulo c6=new Circulo(new Punto(15.5,2.7),2.1);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.intersectaCon(c2));
		System.out.println(c3.intersectaCon(c4));
		System.out.println(c5.intersectaCon(c6));
		

	}

}
