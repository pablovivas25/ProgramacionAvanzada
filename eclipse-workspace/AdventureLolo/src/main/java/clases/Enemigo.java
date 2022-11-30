package clases;

public class Enemigo extends Entidad{
	private String descripcion;
	
	public Enemigo(Ubicacion ubicacion, boolean des, boolean tras,String desc) {
		super(ubicacion, des, tras);
		this.descripcion=desc;
	}

	@Override
	public String toString() {
		return super.toString()+"Enemigo [descripcion=" + descripcion + "]";
	}

	@Override
	public void accion(Lolo lolo, Mapa mapa) {
		
		if(lolo.getCantidadPoder()!=0) {
			System.out.println("Enemigo Muerto");
			this.traspasable=true;
			this.visible=false;
			lolo.setCantidadPoder(lolo.getCantidadPoder()-10); 
			
			// ataca al enemigo, si tiene poder y se le descuenta el equivalente un x valor fijo que representa un corazon
		}
	}
	
	public void morir() {
		super.traspasable=true; 
		super.visible=false;
	}

}
