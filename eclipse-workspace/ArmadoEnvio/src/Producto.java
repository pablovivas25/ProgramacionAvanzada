
public class Producto {
	
	private String fecha_caducidad;
	private String nombre;
	private String pais_origen;
	private String fecha_envasado;
	
	
	public Producto(String fecha_caducidad, String nombre, String pais_origen, String fecha_envasado) {
		super();
		this.fecha_caducidad = fecha_caducidad;
		this.nombre = nombre;
		this.pais_origen = pais_origen;
		this.fecha_envasado = fecha_envasado;
	}


	@Override
	public String toString() {
		return "Producto [fecha_caducidad=" + fecha_caducidad + ", nombre=" + nombre + ", pais_origen=" + pais_origen
				+ ", fecha_envasado=" + fecha_envasado + "]";
	}
	
	
	
	
	
}
