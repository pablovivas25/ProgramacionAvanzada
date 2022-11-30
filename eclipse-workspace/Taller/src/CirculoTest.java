import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	public void testEnunciado() {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		boolean resp=c1.intersectaCon(c2);
		assertEquals(true, resp);
	}
	@Test
	public void testCirculosNoIntersectan() {
		Circulo c3=new Circulo(new Punto(8.4,12.7),3.0);
		Circulo c4=new Circulo(new Punto(8.0,12.0),2.0);
		boolean resp1=c3.intersectaCon(c4);
		assertEquals(false,resp1);
	}

}
