package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Conectar {

	private LinkedList<Arista> registros;
	private LinkedList<Arista> conexiones;
	private LinkedList<Integer> red;
	private ArrayList<String> resultados= new ArrayList<>();
	
	
	
	public LinkedList<Arista> getRegistros() {
		return registros;
	}

	public void setRegistros(LinkedList<Arista> registros) {
		this.registros = registros;
	}

	public LinkedList<Arista> getConexiones() {
		return conexiones;
	}

	public void setConexiones(LinkedList<Arista> conexiones) {
		this.conexiones = conexiones;
	}

	public Conectar(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		this.registros = new LinkedList<>();

		while (sc.hasNextLine()) {
			String[] linea = sc.nextLine().split(" ");
			if (linea[0].equals("F"))
				break;

			char tipo = linea[0].charAt(0);
			int origen = Integer.parseInt(linea[1]);
			int destino = Integer.parseInt(linea[2]);
			Arista a = new Arista(origen, destino, tipo);
			this.registros.add(a);
		}
		sc.close();
	}

	public void resolver() {
		this.conexiones = new LinkedList<>();
		this.red = new LinkedList<>();

		while (!this.registros.isEmpty()) {
			// Tengo que ir atendiendo los registros en el orden que llegan
			Arista a = this.registros.poll();

			if (Character.toUpperCase(a.getTipo()) == 'P') {
				if (this.red.contains(a.getOrigen()) && this.red.contains(a.getDestino())) {
					System.out.println("S");
					resultados.add("S");
				}
					
				else {
					System.out.println("N");
					resultados.add("N");
				}
					
			} else if (Character.toUpperCase(a.getTipo()) == 'C') {
				if (!this.conexiones.contains(a))
					this.conexiones.add(a);
				if (!this.red.contains(a.getOrigen()) && this.red.contains(a.getDestino())) {
					prim(a.getDestino());
				} else if (this.red.contains(a.getOrigen()) && !this.red.contains(a.getDestino())) {
					prim(a.getOrigen());
				} else if (this.red.isEmpty())
					prim(a.getOrigen());
			}
		}
	}

	public ArrayList<String> getResultados() {
		return resultados;
	}

	public void setResultados(ArrayList<String> resultados) {
		this.resultados = resultados;
	}

	public LinkedList<Arista> getAristas(int nodo) {
		LinkedList<Arista> aristas = new LinkedList<>();
		for (Arista a : this.conexiones) {
			if (a.getOrigen() == nodo && !aristas.contains(a)) {
				aristas.add(a);
			} else if (a.getDestino() == nodo) {
				a = new Arista(a.getDestino(), a.getOrigen(), a.getTipo());
				if (!aristas.contains(a))
					aristas.add(a);
			}
		}
		return aristas;
	}

	public void prim(int origen) {
		Queue<Arista> cola = new PriorityQueue<>();
		LinkedList<Integer> visitados = new LinkedList<>();

		visitados.addAll(this.red);
		visitados.add(origen);

		cola = getAristas(origen);
		this.red.add(origen);
		while (!cola.isEmpty()) {
			Arista a = cola.poll();
			if (!visitados.contains(a.getDestino())) {
				this.red.add(a.getDestino());
				visitados.add(a.getDestino());
				cola.addAll(getAristas(a.getDestino()));
			}
		}
	}

}
