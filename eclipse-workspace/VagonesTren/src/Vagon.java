import java.util.List;

public class Vagon {
	
	private List<Especie> especies;
	private int agresividadTotal;
	
	public List<Especie> getEspecies() {
		return especies;
	}
	
	public void setAgresividadTotal(int agresividadTotal) {
		this.agresividadTotal = agresividadTotal;
	}

	public void agregarEspecie(Especie e) {
		this.especies.add(e);
	}
	public int getAgresividadTotal() {
		return agresividadTotal;
	}

	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}
	public Vagon(List<Especie> especies) {
		super();
		this.especies = especies;
	}
	
	
	
}
