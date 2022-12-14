package unlam.progava.oia;

import java.util.ArrayList;

public class EjercicioOIA {
	
	Aventureros aventureros;
	int resultado;
	ArrayList<Integer> listaResultado= new ArrayList<>();

	public static void main(String[] args) {
		EjercicioOIA ejercicio = new EjercicioOIA();
		
		ejercicio.leer("src/unlam/progava/oia/in/03.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/expected/03.out");
	}

	/**
	 * Este método se encarga de leer la entrada de la
	 * consigna desde el archivo.
	 */
	public void leer(String path) {
		aventureros = LectorDeArchivo.leer(path);
	}
	
	/**
	 * Este método se encarga de escribir la salida de la
	 * consigna en el archivo.
	 */
	public void escribir(String path) {
		EscritorDeArchivos.escribir(path,resultado,aventureros.getEliminados());
	}
	
	/**
	 * Este método debe realizar la resolución del ejercicio.
	 * NO DEBE SITUARSE LA LOGICA AQUI, sino que se pueden
	 * utilizar clases adicionales, y los objetos creados en la
	 * etapa de lectura.
	 * Utilizar este mismo paquete para toda la resolución.
	 */
	public void resolver() {
		resultado= aventureros.determinarCevador();
	}
}
