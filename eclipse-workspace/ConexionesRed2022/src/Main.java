

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Conectar c = new Conectar("./prueba/conectar_primeroConecta.in");
		c.resolver();
	}

}
