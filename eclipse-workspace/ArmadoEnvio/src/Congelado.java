
public class Congelado extends Producto {
	private double temp_mantenimiento;

	public Congelado(String fecha_caducidad, String nombre, String pais_origen, String fecha_envasado,
			double temp_mantenimiento) {
		super(fecha_caducidad, nombre, pais_origen, fecha_envasado);
		this.temp_mantenimiento = temp_mantenimiento;
	}
	
	
	

}
