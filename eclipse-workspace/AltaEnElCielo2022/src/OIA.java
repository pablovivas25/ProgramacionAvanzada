import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OIA {
	private List<Escuela> escuelas;
	private List<Integer> subsecuencias;
	private int carretel;
	private int maximo_cantidad_retazos=0;
	private Subsecuencia sub;

	public OIA(int carretel, List<Escuela> escuelas) {
		super();
		this.escuelas = escuelas;
		this.carretel = carretel;
		
	}

	public List<Escuela> getEscuelas() {
		return escuelas;
	}

	public void setEscuelas(List<Escuela> escuelas) {
		this.escuelas = escuelas;
	}

	public int getCarretel() {
		return carretel;
	}

	public void setCarretel(int carretel) {
		this.carretel = carretel;
	}

	public int getSumaDigitos(int numero) {
		int suma = 0;
		while (numero > 0) {
			suma += numero % 10;
			numero = numero / 10;
		}
		return suma;
	}

	public boolean sePuedeUnirRetazo() {
		boolean resp = false;
		for (Escuela e : this.escuelas) {
			if (e.getUltimo_retazo() + this.getSumaDigitos(e.getUltimo_retazo()) < this.carretel)
				return true;
		}

		return resp;
	}
	public void subsecuencia() {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		for(Escuela e:this.getEscuelas())
			for(Integer i:e.getListado_retazos())
				lista.add(i);
		
		Collections.sort(lista);
		
		for(int i=0;i<lista.size();i++)
			System.out.println(lista.get(i));
	}
	public void maximoCantidadRetazos() {
		for(Escuela e:this.escuelas) {
			if(e.getListado_retazos().size()>maximo_cantidad_retazos)
				maximo_cantidad_retazos=e.getListado_retazos().size();
		}
	}
	
	
	public void obtenerSubsecuencia() {
		ArrayList<Integer> aux;
		int cant_ret=0;
		int escuela_1=0,escuela_2=0;
		
		for(int i=0;i<this.escuelas.size();i++) {
			for(int j=i+1;j<this.escuelas.size();j++) {
				aux=new ArrayList<Integer>(	this.escuelas.get(i).getListado_retazos());
				aux.retainAll(this.escuelas.get(j).getListado_retazos());
		
				if(aux.size()>cant_ret) {
					cant_ret=aux.size();
					escuela_1=this.escuelas.get(i).getNumero();
					escuela_2=this.escuelas.get(j).getNumero();
				}
			}
		}
		this.sub=new Subsecuencia(cant_ret,escuela_1,escuela_2);

	}
	public void resolver() {
	

		while (this.sePuedeUnirRetazo()) {

			for (int i = 0; i < this.escuelas.size(); i++) {

				int aux = this.escuelas.get(i).getUltimo_retazo()
						+ this.getSumaDigitos(this.escuelas.get(i).getUltimo_retazo());

				if (this.carretel - aux > 0) {

					this.carretel -= aux;
					this.escuelas.get(i).setCantidad_retazos(this.escuelas.get(i).getCantidad_retazos() + 1);
					this.escuelas.get(i).setUltimo_retazo(aux);
					this.escuelas.get(i).setRetazo(this.escuelas.get(i).getRetazo() + aux);
					this.escuelas.get(i).agregarRetazo(aux);

				}
			}

		}
		this.obtenerSubsecuencia();
		this.maximoCantidadRetazos();
		Collections.sort(this.escuelas);
	}

	public List<Integer> getSubsecuencias() {
		return subsecuencias;
	}

	public void setSubsecuencias(List<Integer> subsecuencias) {
		this.subsecuencias = subsecuencias;
	}

	public int getMaximo_cantidad_retazos() {
		return maximo_cantidad_retazos;
	}

	public void setMaximo_cantidad_retazos(int maximo_cantidad_retazos) {
		this.maximo_cantidad_retazos = maximo_cantidad_retazos;
	}

	public Subsecuencia getSub() {
		return sub;
	}

	public void setSub(Subsecuencia sub) {
		this.sub = sub;
	}
	
}
