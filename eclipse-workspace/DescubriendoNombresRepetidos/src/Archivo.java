import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Archivo {

	public Juego leerArchivo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int cantChicos = sc.nextInt();
		int n = sc.nextInt();

		Map<String, Integer> pal = new HashMap<String, Integer>();

		for (int i = 0; i < cantChicos; i++) {

			String clave = sc.next();

			if (pal.containsKey(clave)) {
				int valor = pal.get(clave);
				pal.put(clave, valor + 1);
			}

			else
				pal.put(clave, 1);

		}

		sc.close();

		return new Juego(cantChicos, n, pal);
	}

	public void escribirArchivo(String path, Map<String, Integer> mapa) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File(path));

		for (String key1 : mapa.keySet()) {
			pw.println(key1.toString() + " " + mapa.get(key1));
		}

		pw.close();
	}
}
