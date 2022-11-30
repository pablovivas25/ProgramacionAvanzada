package clases;

public class Lolo extends Entidad{
	private boolean vivo;
	private int cantidadPoder=0;

	
   public Lolo(Ubicacion ubicacion, boolean des, boolean tras) {
		super(ubicacion, des, tras);
		this.vivo = true;
	}
   	
   ///agregado para atacar al enemigo
	public int getCantidadPoder() {
		return cantidadPoder;
	}

	public void setCantidadPoder(int cantidadPoder) {
		this.cantidadPoder = cantidadPoder;
	}
	///

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public String toString() {
		return super.toString()+"Lolo [vivo=" + vivo + "]";
	}
	


	public void moverArriba(Mapa m) {
		
     	Entidad arriba=m.getArriba(this.ubicacion);
     	
		
		if(arriba==null || arriba.isTraspasable()==true )
		   this.ubicacion.setPosX(this.ubicacion.getPosX()-1);
		else
			arriba.accion(this, m);
		
		
   }
	

    public void moverAbajo(Mapa m) {
    	
     	Entidad abajo=m.getAbajo(this.ubicacion);
     	
		
		if(abajo==null || abajo.isTraspasable()==true )
		   this.ubicacion.setPosX(this.ubicacion.getPosX()+1);
		else
			abajo.accion(this, m);
		
		
    }
    public void moverDerecha(Mapa m) {
    	
     	Entidad derecha=m.getDerecha(this.ubicacion);
     	
		
		if(derecha==null || derecha.isTraspasable()==true )
		   this.ubicacion.setPosY(this.ubicacion.getPosY()+1);
		else
			derecha.accion(this, m);
		
	
			
    }

    public void moverIzquierda(Mapa m) {
    	
     	Entidad izquierda=m.getIzquierda(this.ubicacion);
     	
		
		if(izquierda==null || izquierda.isTraspasable()==true  )
		   this.ubicacion.setPosY(this.ubicacion.getPosY()-1);
		else
			izquierda.accion(this, m);
		
	
			
    }

	@Override
	public void accion(Lolo lolo, Mapa mapa) {
		// TODO Auto-generated method stub
		
	}
	
	public Ubicacion getUbicacion() {
		return super.ubicacion;
	}
	
	
	

}
