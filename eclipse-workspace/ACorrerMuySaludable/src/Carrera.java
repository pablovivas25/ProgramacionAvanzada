import java.util.List;

public class Carrera {
	private List<Rango> rango_femenino;
	private List<Rango> rango_masculino;
	private List<Competidor> competidores;
	private List<Integer> orden_llegada;

	public Carrera(List<Rango> rango_femenino, List<Rango> rango_masculino, List<Competidor> competidores,
			List<Integer> orden_llegada) {
		super();
		this.rango_femenino = rango_femenino;
		this.rango_masculino = rango_masculino;
		this.competidores = competidores;
		this.orden_llegada = orden_llegada;
	}

	public List<Rango> getRango_femenino() {
		return rango_femenino;
	}

	public void setRango_femenino(List<Rango> rango_femenino) {
		this.rango_femenino = rango_femenino;
	}

	public List<Rango> getRango_masculino() {
		return rango_masculino;
	}

	public void setRango_masculino(List<Rango> rango_masculino) {
		this.rango_masculino = rango_masculino;
	}

	public List<Competidor> getCompetidores() {
		return competidores;
	}

	public void setCompetidores(List<Competidor> competidores) {
		this.competidores = competidores;
	}

	public List<Integer> getOrden_llegada() {
		return orden_llegada;
	}

	public void setOrden_llegada(List<Integer> orden_llegada) {
		this.orden_llegada = orden_llegada;
	}

	public int rangoPerteneceFemenino(int edad) {
		for(int i=0;i<this.rango_femenino.size();i++) {
			if(this.rango_femenino.get(i).pertenceRango(edad)==true)
				return i;
		}
		return -1;
	}
	public int rangoPerteneceMasculino(int edad) {
		for(int i=0;i<this.rango_masculino.size();i++) {
			if(this.rango_masculino.get(i).pertenceRango(edad)==true)
				return i;
		}
		return -1;
	}
//	public void clasificarCompetidoresEdadRango() {
//		for(int i=0;i<this.competidores.size();i++) {
//			
//		}
//	}
	
	
	public void resolver() {
		for(int i=0;i<this.orden_llegada.size();i++) {
			if(this.competidores.get(this.getOrden_llegada().get(i)-1).getSexo().equals("M")) {
				int numero_rango=this.rangoPerteneceMasculino(this.competidores.get(this.getOrden_llegada().get(i)-1).getEdad());
				if(numero_rango!=-1) {
					int pos_llegada=this.orden_llegada.indexOf(this.competidores.get(this.getOrden_llegada().get(i)-1).getNumero());
					if(pos_llegada!=-1)
						this.rango_masculino.get(numero_rango).agregarPodio(this.competidores.get(this.getOrden_llegada().get(i)-1).getNumero());
				}
			}else {
				int numero_rango=this.rangoPerteneceFemenino(this.competidores.get(this.getOrden_llegada().get(i)-1).getEdad());
				
				if(numero_rango!=-1) {
					int pos_llegada=this.orden_llegada.indexOf(this.competidores.get(this.getOrden_llegada().get(i)-1).getNumero());
					if(pos_llegada!=-1)
						this.rango_femenino.get(numero_rango).agregarPodio(this.competidores.get(this.getOrden_llegada().get(i)-1).getNumero());
				}
			}
		}
		
		for(Rango f:this.rango_femenino) {
			if(f.podioCompleto()==false)
				f.completarPodio();
		}
		
		for(Rango f:this.rango_masculino) {
			if(f.podioCompleto()==false)
				f.completarPodio();
		}

	}

}
