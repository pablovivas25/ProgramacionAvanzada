package instalandoaplicaciones;

public class Aplicacion {
	private int cantidadAplicaciones;
	private int memoriaAplicacionInstalar;
	private CelularMemoria memoriaApicaciones;
	
	public Aplicacion(int cantidadAplicaciones, int memoriaAplicacionInstalar, CelularMemoria memoriaApicaciones) {
		super();
		this.cantidadAplicaciones = cantidadAplicaciones;
		this.memoriaAplicacionInstalar = memoriaAplicacionInstalar;
		this.memoriaApicaciones = memoriaApicaciones;
	}

	public int getCantidadAplicaciones() {
		return cantidadAplicaciones;
	}

	public void setCantidadAplicaciones(int cantidadAplicaciones) {
		this.cantidadAplicaciones = cantidadAplicaciones;
	}

	public int getMemoriaAplicacionInstalar() {
		return memoriaAplicacionInstalar;
	}

	public void setMemoriaAplicacionInstalar(int memoriaAplicacionInstalar) {
		this.memoriaAplicacionInstalar = memoriaAplicacionInstalar;
	}

	public CelularMemoria getMemoriaApicaciones() {
		return memoriaApicaciones;
	}

	public void setMemoriaApicaciones(CelularMemoria memoriaApicaciones) {
		this.memoriaApicaciones = memoriaApicaciones;
	}
	
	
	
	

}
