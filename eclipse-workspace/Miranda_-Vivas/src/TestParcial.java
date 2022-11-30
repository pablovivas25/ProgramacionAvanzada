import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class TestParcial {

	@Test
	void test1() {
		Aplicacion a=new Aplicacion(new File("almacenamiento1.in"),new File("almacenamiento1.out"));
		a.resolucion();
	}
	@Test
	void test2() {
		Aplicacion a=new Aplicacion(new File("caso2.in"),new File("caso2.out"));
		a.resolucion();
	}
	@Test
	void test3() {
		Aplicacion a=new Aplicacion(new File("caso3.in"),new File("caso3.out"));
		a.resolucion();
	}
	@Test
	void test4() {
		Aplicacion a=new Aplicacion(new File("caso4.in"),new File("caso4.out"));
		a.resolucion();
	}
	@Test
	void test5() {
		Aplicacion a=new Aplicacion(new File("fatiga.in"),new File("fatiga.out"));
		a.resolucion();
	}
}
