
public class Punto {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double distance(Punto other) {
		float dx = this.x - other.x;
		float dy = this.y - other.y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

}
