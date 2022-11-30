
public class Subsecuencia {
	private int cantidad_trazos;
	private int escuela_1;
	private int escuela_2;
	
	public int getCantidad_trazos() {
		return cantidad_trazos;
	}
	public void setCantidad_trazos(int cantidad_trazos) {
		this.cantidad_trazos = cantidad_trazos;
	}
	public int getEscuela_1() {
		return escuela_1;
	}
	public void setEscuela_1(int escuela_1) {
		this.escuela_1 = escuela_1;
	}
	public int getEscuela_2() {
		return escuela_2;
	}
	public void setEscuela_2(int escuela_2) {
		this.escuela_2 = escuela_2;
	}
	
	public Subsecuencia(int cantidad_trazos, int escuela_1, int escuela_2) {
		super();
		this.cantidad_trazos = cantidad_trazos;
		this.escuela_1 = escuela_1;
		this.escuela_2 = escuela_2;
	}
	
	
}
