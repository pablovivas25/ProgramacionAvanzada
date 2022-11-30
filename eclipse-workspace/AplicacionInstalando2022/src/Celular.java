import java.util.ArrayList;
import java.util.List;

public class Celular {
	
	private List<Aplicacion> aplicaciones;
	
	public Celular() {
		this.aplicaciones=new ArrayList<>();
	}
	
	public void agregarAplicaciones(Aplicacion app) {
		this.aplicaciones.add(app);
	}

	public List<Aplicacion> getAplicaciones() {
		return aplicaciones;
	}
	
	
}
