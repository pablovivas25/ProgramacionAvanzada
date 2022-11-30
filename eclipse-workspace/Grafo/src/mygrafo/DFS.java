package mygrafo;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {
	private GrafoNoDirigidoNoPonderado grafo;
	private int cantNodos;
	private int cantAristas;

	private Nodo nodoInicial;
	private ArrayList<Arista> arbol;
	private boolean[] nodoTerminado;
	
	public GrafoNoDirigidoNoPonderado getGrafo() {
		return grafo;
	}

	public int getCantNodos() {
		return cantNodos;
	}

	public int getCantAristas() {
		return cantAristas;
	}

	public Nodo getNodoInicial() {
		return nodoInicial;
	}

	public DFS(GrafoNoDirigidoNoPonderado grafo, Nodo nodoInicial) {
		this.grafo = grafo;
		this.cantNodos = grafo.getCantNodos();
		this.cantAristas = grafo.getCantAristas();

		this.nodoInicial = nodoInicial;
		this.arbol = new ArrayList<Arista>();
		this.nodoTerminado = new boolean[this.cantNodos];
	}
	
	public void resolverDFS() {
		// pila que almacena los nodos visitados
		Stack<Integer> pila = new Stack<Integer>();
		// apilo el nodo inicial
		pila.push(this.nodoInicial.getNumero());
		this.nodoTerminado[this.nodoInicial.getNumero()]=true;
		int numeroNodo;
		while(!pila.empty()) {
			numeroNodo=pila.pop();
			
			for(Nodo n:this.grafo.getNodos()) {
				if(this.grafo.getGrafo().hayArista(numeroNodo,n.getNumero())) {
					if(this.nodoTerminado[n.getNumero()]==false) {
						this.nodoTerminado[n.getNumero()]=true;
						pila.push(n.getNumero());
					}
				}
			}
			
		}
	}
	
	public boolean[] getNodoTerminado() {
		return nodoTerminado;
	}

	public static void main(String[] args) {
		GrafoNoDirigidoNoPonderado grafo=new GrafoNoDirigidoNoPonderado("grafodfs.in");
		System.out.println(grafo.getCantNodos());
		System.out.println(grafo.getCantAristas());
		DFS dfs=new DFS(grafo,new Nodo(0));
		dfs.resolverDFS();
		for(boolean b:dfs.getNodoTerminado())
			System.out.println(b);
	}

}
