package clases;

public class Cofre extends Entidad {
	
	private boolean abierto=false;
	
	
	public Cofre(Ubicacion ubicacion, boolean des, boolean tras) {
		super(ubicacion, des, tras);

	}

	@Override
	public String toString() {
		return super.toString()+"Cofre [perla=" + abierto + "]";
	}

	public boolean isAbierto() {
		return abierto;
	}

	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}
	
	public void abrir() {
		this.abierto=true;
	}
	
	@Override
	public void accion(Lolo l, Mapa mapa) {
		if(this.abierto)
			mapa.abrirPuertaMuerteEnemigo();
		
		l.ubicacion.setPosX(this.ubicacion.getPosX());
		l.ubicacion.setPosY(this.ubicacion.getPosY());
	
	}
	

}
