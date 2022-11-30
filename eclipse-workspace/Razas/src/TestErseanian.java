import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestErseanian {

	@BeforeEach
	public void setup() {
		Erseanian e=new Erseanian(2);
		Vanilla v=new Vanilla(3);
		
		
	}
	
	@Test
	public void pruebaAtacar() {
		Erseanian e=new Erseanian(2);
		Vanilla v=new Vanilla(3);
		
		e.atacar(v);
		
		assertEquals(1,v.saludActual);
	
	
	}
	
	@Test
	public void pruebaRecibirAtaque() {
		Erseanian e=new Erseanian(2);
		Vanilla v=new Vanilla(3);
		
		e.recibirAtaque(100);
		
		assertEquals(99,e.danioBasico);
	
	}
	
	@Test
	public void pruebaDescansar() {
		Erseanian e=new Erseanian(2);
	
		
		e.descansar();
		
		assertEquals(99,e.danioBasico);
		assertEquals(63,e.saludActual);
	
	}
	
	
	

}
