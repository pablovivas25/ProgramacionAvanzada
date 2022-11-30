package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import mygrafo.Nodo;

public class Red {
	// private MatrizAdyacenciaNoDirigido grafo;
	/// private int cantAristas;
	// private int cantNodos;

	// private ArrayList<Computadora> nodos;
	private ArrayList<Conexion> aristas;
	ArrayList<Conexion> conexionesEstablecidas = new ArrayList<Conexion>();
	ArrayList<String> respuestas = new ArrayList<String>();
	ArrayList<Computadora> nodos=new ArrayList<Computadora>();
	private boolean [] nodoTerminado;

	public Red(String path) {
		try {
			Scanner sc = new Scanner(new File(path));
			this.aristas = new ArrayList<Conexion>();
			String letra = sc.next();

			while (letra.compareTo("F") != 0) {
				Computadora c1 = new Computadora(sc.nextInt());
				Computadora c2 = new Computadora(sc.nextInt());
				Conexion c = new Conexion(c1, c2, letra);
				this.aristas.add(c);
				letra = sc.next();
			}

			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Conexion> getAristas() {
		return aristas;
	}

	public boolean hayConexion(Conexion c) {// hay arista
		for (int i = 0; i < conexionesEstablecidas.size(); i++) {
			if (c.getNodo1().getNumero() == conexionesEstablecidas.get(i).getNodo1().getNumero()
					&& c.getNodo2().getNumero() == conexionesEstablecidas.get(i).getNodo2().getNumero())
				return true;
		}
		return false;
	}
	
	public ArrayList<Computadora> getNodos() {
		return nodos;
	}

	public boolean resolverDFS(int nodoinicial,int nodofinal) {
		// pila que almacena los nodos visitados
		Stack<Integer> pila = new Stack<Integer>();
		this.nodoTerminado=new boolean[this.getNodos().size()];
		// apilo el nodo inicial
		pila.push(nodoinicial);
		this.nodoTerminado[nodoinicial]=true;
		int numeroNodo;
		while(!pila.empty()) {
			numeroNodo=pila.pop();
			
			for(Computadora n:this.nodos) {
				if(this.aristas.contains(new Conexion(new Computadora(numeroNodo),n,"C"))) {
					if(this.nodoTerminado[n.getNumero()]==false) {
						this.nodoTerminado[n.getNumero()]=true;
						pila.push(n.getNumero());
					}
				}
			}
			
		}
		return this.nodoTerminado[nodofinal];
	}
	public void resolver() {

		for (Conexion c : this.aristas) {
			if (c.getLetra().compareTo("P") == 0) {
				if (conexionesEstablecidas.size() > 0) {
					if (this.hayConexion(c) == true) {
						respuestas.add("S");
					} else {
						if(this.resolverDFS(c.getNodo1().getNumero(), c.getNodo2().getNumero())==true)
							respuestas.add("S");
						else
							respuestas.add("N");
					}
						
				} else {
					//conexionesEstablecidas.add(c);
					respuestas.add("N");
				}

			}else {
				conexionesEstablecidas.add(c);
				nodos.add(c.getNodo1());
				nodos.add(c.getNodo2());
			}
				
			// respuestas.add("N");
		}

	}

	
	public ArrayList<Conexion> getConexionesEstablecidas() {
		return conexionesEstablecidas;
	}

	public ArrayList<String> getRespuestas() {
		return respuestas;
	}

	public static void main(String[] args) {
		Red r = new Red("src/unlam/progava/oia/in/enunciado.in");

		for (Conexion c : r.getAristas())
			System.out.println(c.getLetra() + " " + c.getNodo1().getNumero() + " " + c.getNodo2().getNumero());

		r.resolver();
		System.out.println("-------conexiones establecidas ------");
		for (Conexion est : r.getConexionesEstablecidas())
			System.out.println(est.getLetra() + " " + est.getNodo1().getNumero() + " " + est.getNodo2().getNumero());
		System.out.println("--------");
		for (String res : r.getRespuestas())
			System.out.println(res);
	}

}
