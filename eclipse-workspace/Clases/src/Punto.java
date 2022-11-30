import java.lang.Math.*;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public Punto() {
		this(0, 0);
	}

	/// == comparamos las referencias
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public Punto suma(Punto s) {
		return new Punto(this.x + s.x, this.y + s.y);
	}

	public static void main(String[] args) {
		Punto p1 = new Punto(5, 10);
		Punto p2 = new Punto(3, 2);

		// Cuando creamos un constructor pasandole parametros se deja
		// llamar al constructor por defecto a menos que se escriba

		System.out.println(p1);
		System.out.println(p2);

	}

}
