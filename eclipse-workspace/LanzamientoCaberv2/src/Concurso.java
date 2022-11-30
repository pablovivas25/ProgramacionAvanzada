import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concurso {
	
	private int cantidad_concursantes;
	private int cantidad_tiros;
	private ArrayList<Concursante> concursantes;
	private ArrayList<Concursante> podioConsistencia;
	private List<Concursante> podioDistancia;
	
	public Concurso(int cantidad_concursantes, int cantidad_tiros, ArrayList<Concursante> concursantes) {
		super();
		this.cantidad_concursantes = cantidad_concursantes;
		this.cantidad_tiros = cantidad_tiros;
		this.concursantes = concursantes;
		this.podioConsistencia=new ArrayList<Concursante>();
		this.podioDistancia=new ArrayList<Concursante>();
	}

	public int getCantidad_concursantes() {
		return cantidad_concursantes;
	}
	
	public void generarPodioConsistencia() {
		for(int i=0;i<this.concursantes.size();i++) {
			double consistencia=this.concursantes.get(i).getConsistencia();
			if(consistencia!=-1)
				this.podioConsistencia.add(this.concursantes.get(i));
		}
		
		Collections.sort(this.podioConsistencia);
		
	
	}
	public void generarPodioDistancia() {
		Collections.sort(this.concursantes,Concursante.Comparators.DISTANCIA);
		
		for(int i=0;i<this.concursantes.size();i++) {
			System.out.println(this.concursantes.get(i).getNumero()+ " "+ this.concursantes.get(i).getDistanciaAcum());
		}
	}
	
	public void resolver() {
		this.generarPodioConsistencia();
		this.generarPodioDistancia();
	}
	public void setCantidad_concursantes(int cantidad_concursantes) {
		this.cantidad_concursantes = cantidad_concursantes;
	}

	public int getCantidad_tiros() {
		return cantidad_tiros;
	}

	public void setCantidad_tiros(int cantidad_tiros) {
		this.cantidad_tiros = cantidad_tiros;
	}

	public ArrayList<Concursante> getConcursantes() {
		return concursantes;
	}

	public void setConcursantes(ArrayList<Concursante> concursantes) {
		this.concursantes = concursantes;
	}

	public ArrayList<Concursante> getPodioConsistencia() {
		return podioConsistencia;
	}

	public void setPodioConsistencia(ArrayList<Concursante> podioConsistencia) {
		this.podioConsistencia = podioConsistencia;
	}

//	public List<Concursante> getPodioDistancia() {
//		return podioDistancia;
//	}
//
//	public void setPodioDistancia(List<Concursante> podioDistancia) {
//		this.podioDistancia = podioDistancia;
//	}
//	
	
	
	
	
	
	
}
