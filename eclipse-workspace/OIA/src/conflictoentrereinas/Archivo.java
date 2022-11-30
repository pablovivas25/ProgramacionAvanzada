package conflictoentrereinas;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Archivo {

	public Tablero leerArchivo(String pathEntrada) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(pathEntrada));
		int orden = sc.nextInt();
		int cantidadReinas = sc.nextInt();
		ArrayList<Reina> lr = new ArrayList<Reina>(cantidadReinas);

		for (int i = 0; i < cantidadReinas; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			lr.add(new Reina(x, y));
		}

		sc.close();

		return new Tablero(orden, orden, cantidadReinas, lr);

	}
}
