import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import clases.Lolo;
import clases.Mapa;
import clases.Ubicacion;

public class TestLolo {
	Mapa tablero;
	Lolo lolo;
	@Before
	public void setMapa() {
		tablero = new Mapa("src/test/resources/mapa/nivel1.in");
		lolo = new Lolo(new Ubicacion(1,1),true,false);
		System.out.println( "Ubicacion puerta " +tablero.getPuerta().getUbicacion().getPosX()+ " "+tablero.getPuerta().getUbicacion().getPosY());
	}
	
	
	@Test
	public void Movimiento_Normal(){
		lolo.moverDerecha(tablero);
		lolo.moverIzquierda(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverArriba(tablero);
		Assert.assertEquals(1, lolo.getUbicacion().getPosX());
		Assert.assertEquals(1, lolo.getUbicacion().getPosY());
	}
	
	@Test
	public void Movimiento_contra_pared(){
		lolo.moverAbajo(tablero);
		lolo.moverIzquierda(tablero);
		Assert.assertEquals(2, lolo.getUbicacion().getPosX());
		Assert.assertEquals(1, lolo.getUbicacion().getPosY());
	}
	
	@Test
	public void Movimiento_enemigo_sin_poder(){
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero); // "intentar matarlo"
		lolo.moverDerecha(tablero);	// pasarle por arriba
		Assert.assertEquals(3, lolo.getUbicacion().getPosX());
		Assert.assertEquals(2, lolo.getUbicacion().getPosY());
	}
	
	@Test
	public void Movimiento_enemigo_con_poder(){
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);  
		lolo.moverDerecha(tablero);
		lolo.moverAbajo(tablero);  
		Assert.assertEquals(2, lolo.getUbicacion().getPosX());
		Assert.assertEquals(5, lolo.getUbicacion().getPosY());
		Assert.assertEquals(0, lolo.getCantidadPoder());
	}
	
	@Test
	public void Movimiento_enemigo_con_poder_volviendo(){
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);  
		lolo.moverDerecha(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverArriba(tablero);
		lolo.moverIzquierda(tablero);
		Assert.assertEquals(1, lolo.getUbicacion().getPosX());
		Assert.assertEquals(4, lolo.getUbicacion().getPosY());
		Assert.assertEquals(0, lolo.getCantidadPoder());
	}
	
	@Test
	public void Movimiento_puerta_sin_llave(){
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);  
		lolo.moverDerecha(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		Assert.assertEquals(5, lolo.getUbicacion().getPosX());
		Assert.assertEquals(5, lolo.getUbicacion().getPosY());
		Assert.assertEquals(10, lolo.getCantidadPoder());
	}
	
	@Test
	public void Movimiento_baul_sin_corazon(){
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		Assert.assertEquals(5, lolo.getUbicacion().getPosX());
		Assert.assertEquals(3, lolo.getUbicacion().getPosY());
		Assert.assertEquals(10, lolo.getCantidadPoder());
		Assert.assertEquals(false, tablero.getBaul().isAbierto());
	}
	
	@Test
	public void Movimiento_baul_con_corazon(){
		
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero); // pisa enemigo
		
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverArriba(tablero);
		lolo.moverArriba(tablero);
		
		lolo.moverIzquierda(tablero);
		lolo.moverIzquierda(tablero);
		lolo.moverIzquierda(tablero);
		lolo.moverIzquierda(tablero);
		
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		
		Assert.assertEquals(5, lolo.getUbicacion().getPosX());
		Assert.assertEquals(3, lolo.getUbicacion().getPosY());
		Assert.assertEquals(20, lolo.getCantidadPoder());
		Assert.assertEquals(true, tablero.getBaul().isAbierto());
	}
	
	@Test
	public void Movimiento_contra_arbol(){
		lolo.moverDerecha(tablero);
		lolo.moverAbajo(tablero);
		
		Assert.assertEquals(1, lolo.getUbicacion().getPosX());
		Assert.assertEquals(2, lolo.getUbicacion().getPosY());
	}
	
	@Test
	public void Movimiento_puerta_sin_baul(){
		
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		
		lolo.moverArriba(tablero);
		lolo.moverArriba(tablero);
		lolo.moverArriba(tablero);
		
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero); // pisa enemigo
		
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		
		lolo.moverDerecha(tablero);
		
		Assert.assertEquals(5, lolo.getUbicacion().getPosX());
		Assert.assertEquals(5, lolo.getUbicacion().getPosY());
		Assert.assertEquals(20, lolo.getCantidadPoder());
		Assert.assertEquals(true, tablero.getBaul().isAbierto());
		Assert.assertEquals(false, tablero.getPuerta().isAbierta());
	}
	
	@Test
	public void Movimiento_completar_nivel(){
		
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero); // pisa enemigo
		
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverArriba(tablero);
		lolo.moverArriba(tablero);
		
		lolo.moverIzquierda(tablero);
		lolo.moverIzquierda(tablero);
		lolo.moverIzquierda(tablero);
		lolo.moverIzquierda(tablero);
		
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverIzquierda(tablero);
		lolo.moverIzquierda(tablero);
		
		lolo.moverArriba(tablero);
		lolo.moverArriba(tablero);
		lolo.moverArriba(tablero);
		lolo.moverArriba(tablero);
		
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero); // pisa enemigo
		
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		lolo.moverAbajo(tablero);
		
		lolo.moverDerecha(tablero);
		
		
		Assert.assertEquals(0, tablero.getCorazones());
		Assert.assertEquals(5, lolo.getUbicacion().getPosX());
		Assert.assertEquals(6, lolo.getUbicacion().getPosY());
		Assert.assertEquals(20, lolo.getCantidadPoder());
		Assert.assertEquals(true, tablero.getBaul().isAbierto());
		Assert.assertEquals(true, tablero.getPuerta().isAbierta());
	}
	
	
}
