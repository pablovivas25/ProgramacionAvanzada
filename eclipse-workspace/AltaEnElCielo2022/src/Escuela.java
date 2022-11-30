import java.util.ArrayList;
import java.util.List;

public class Escuela implements Comparable<Escuela>{
	private int numero;
	private int ultimo_retazo;
	private int retazo;
	private int cantidad_retazos=1;
	private List<Integer> listado_retazos;
	private int subsecuencia=0;
	
	
	
	public int getCantidad_retazos() {
		return cantidad_retazos;
	}
	public void setCantidad_retazos(int cantidad_retazos) {
		this.cantidad_retazos = cantidad_retazos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getUltimo_retazo() {
		return ultimo_retazo;
	}
	public void setUltimo_retazo(int ultimo_retazo) {
		this.ultimo_retazo = ultimo_retazo;
	}
	public int getRetazo() {
		return retazo;
	}
	public void setRetazo(int retazo) {
		this.retazo = retazo;
	}
	public Escuela(int numero, int ultimo_retazo, int retazo) {
		super();
		this.numero = numero;
		this.ultimo_retazo = ultimo_retazo;
		this.retazo = retazo;
		this.listado_retazos=new ArrayList<Integer>();
		this.listado_retazos.add(retazo);
	}
	
	public void agregarRetazo(int retazo) {
		this.listado_retazos.add(retazo);
	}
	public List<Integer> getListado_retazos() {
		return listado_retazos;
	}
	public void setListado_retazos(List<Integer> listado_retazos) {
		this.listado_retazos = listado_retazos;
	}
	@Override
	public int compareTo(Escuela o) {
		return this.retazo-o.getRetazo();
	}
	
}
