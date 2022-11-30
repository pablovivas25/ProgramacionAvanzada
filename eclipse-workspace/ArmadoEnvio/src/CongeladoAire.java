
public class CongeladoAire extends Congelado {
	
	private Integer nitrogeno;
	private Integer oxigeno;
	private Integer dioxido_carbono;
	private Integer vapor;
	
	@Override
	public String toString() {
		return super.toString()+ " "+"CongeladoAire [nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioxido_carbono=" + dioxido_carbono
				+ ", vapor=" + vapor + "]";
	}

	public CongeladoAire(String fecha_caducidad, String nombre, String pais_origen, String fecha_envasado,
			double temp_mantenimiento, Integer nitrogeno, Integer oxigeno, Integer dioxido_carbono, Integer vapor) {
		super(fecha_caducidad, nombre, pais_origen, fecha_envasado, temp_mantenimiento);
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dioxido_carbono = dioxido_carbono;
		this.vapor = vapor;
	}
	
	
}
