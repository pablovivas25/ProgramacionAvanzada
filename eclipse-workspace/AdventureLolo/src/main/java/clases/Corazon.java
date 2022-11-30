package clases;

public class Corazon extends Entidad {
	private int valor=10;
	
	public Corazon(Ubicacion ubicacion, boolean des, boolean tras) {
		super(ubicacion, des, tras);
		
	}

	@Override
	public void accion(Lolo l, Mapa mapa) {
		
		mapa.reducirCorazon();
		l.ubicacion.setPosX(this.ubicacion.getPosX());
		l.ubicacion.setPosY(this.ubicacion.getPosY());
		
		//System.out.println(l.ubicacion.getPosX()+ " "+this.ubicacion.getPosY());
		l.setCantidadPoder(l.getCantidadPoder()+this.valor);
		this.traspasable=true; /// agarras el corazon
		this.visible=false;
		
		
	}
	
}
