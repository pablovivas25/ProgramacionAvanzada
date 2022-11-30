
public class Punto {
	private double x;
	private double y;
	
	public Punto(double cordx,double cordy) {
		super();
		this.x=cordx;
		this.y=cordy;
	}
	
	public double getModulo() {
		return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
