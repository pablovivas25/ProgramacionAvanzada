
public class CongeladoAgua extends Congelado{
	private Integer sanidad;

	public CongeladoAgua(String fecha_caducidad, String nombre, String pais_origen, String fecha_envasado,
			double temp_mantenimiento, Integer sanidad) {
		super(fecha_caducidad, nombre, pais_origen, fecha_envasado, temp_mantenimiento);
		this.sanidad = sanidad;
	}

	@Override
	public String toString() {
		return super.toString()+ " "+"CongeladoAgua [sanidad=" + sanidad + "]";
	}
	
	
}
