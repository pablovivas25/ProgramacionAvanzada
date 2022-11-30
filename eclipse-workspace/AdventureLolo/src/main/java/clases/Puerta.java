package clases;

public class Puerta extends Entidad {


	private boolean abierta=false;
	
	public Puerta(Ubicacion ubicacion, boolean des, boolean tras) {
		super(ubicacion, des, tras);
	
	}

	

	public boolean isAbierta() {
		return abierta;
	}



	public void abrir() {
		this.abierta = true;
		System.out.println(this.abierta +  "<-----");
		this.traspasable=false;
	}



	@Override
	public String toString() {
		return super.toString()+"Puerta [abierta=" + abierta + "]";
	}



	@Override
	public void accion(Lolo l, Mapa mapa) {
		
		if(this.abierta==true) {
		
			l.ubicacion.setPosX(this.ubicacion.getPosX());
			l.ubicacion.setPosY(this.ubicacion.getPosY());
			
			System.out.println("FIN DEL JUEGO");
		}
	
	}



	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	public Ubicacion getUbicacion() {
		return super.ubicacion;
	}
	
	
	
}
