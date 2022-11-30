
public class Animal {
	private String tipo;
	private int agresividad;

	public Animal(String tipo, int agresividad) {
		super();
		this.tipo = tipo;
		this.agresividad = agresividad;
	}

	public int getAgresividad() {
		return agresividad;
	}

	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String toString() {
		return "Animal [tipo=" + tipo + ", agresividad=" + agresividad + "]";
	}

	public boolean esMasAgresivo(Animal otro) {
		return this.agresividad>otro.getAgresividad()?true:false;
	}
	
	

}
