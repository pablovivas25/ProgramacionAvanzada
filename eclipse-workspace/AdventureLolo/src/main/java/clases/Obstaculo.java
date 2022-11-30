package clases;

public class Obstaculo extends Entidad{

	
	private String descripcion;
	
	public Obstaculo(Ubicacion ubicacion, boolean des, boolean tras,String desc) {
		super(ubicacion, des, tras);
		this.descripcion=desc;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return super.toString()+"Obstaculo [descripcion=" + descripcion + "]";
	}
	
	@Override
	public void accion(Lolo l, Mapa mapa) {
		System.out.println("No Podes pasar");
	}
	

	
}
