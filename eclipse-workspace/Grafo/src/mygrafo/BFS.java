package mygrafo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	private GrafoNoDirigidoNoPonderado grafo;
	private int cantNodos;
	private int cantAristas;

	private Nodo nodoInicial;
	private ArrayList<Arista> arbol;
	private int[]distancia;
	private boolean[]nodoTerminado;
	
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

	public BFS(GrafoNoDirigidoNoPonderado grafo, Nodo nodoInicial) {
		this.grafo = grafo;
		this.cantNodos = grafo.getCantNodos();
		this.cantAristas = grafo.getCantAristas();

		this.nodoInicial = nodoInicial;
		this.arbol = new ArrayList<Arista>();
		this.distancia = new int[this.cantNodos];
		this.nodoTerminado=new boolean[this.cantNodos];
	}
	
	public void resolverBFS() {
		Queue<Integer> cola = new LinkedList<Integer>();
		cola.offer(this.nodoInicial.getNumero());
		this.distancia[this.nodoInicial.getNumero()]=0;
		this.nodoTerminado[this.nodoInicial.getNumero()]=true;
		
		while(!cola.isEmpty()) {
			int numeroNodo=cola.peek();
			
			for(Nodo n:this.grafo.getNodos()) {
				if(this.grafo.getGrafo().hayArista(numeroNodo,n.getNumero())) {
					if(this.nodoTerminado[n.getNumero()]==false) {
						this.nodoTerminado[n.getNumero()]=true;
						this.distancia[n.getNumero()]=this.distancia[numeroNodo]+1;
						 cola.offer(n.getNumero());
					}
				}
			}
			numeroNodo=cola.poll();
			//this.nodoTerminado[numeroNodo]=true;
			//this.distancia[numeroNodo]+=this.distancia[this.nodoInicial.getNumero()]+1;
		}
		
	}
	
	public int[] getDistancia() {
		return distancia;
	}

	public boolean[] getNodoTerminado() {
		return nodoTerminado;
	}

	public static void main(String[] args) {
		GrafoNoDirigidoNoPonderado grafo=new GrafoNoDirigidoNoPonderado("grafobfs.in");
		System.out.println(grafo.getCantNodos());
		System.out.println(grafo.getCantAristas());
		BFS bfs=new BFS(grafo,new Nodo(0));
		bfs.resolverBFS();
		
		for(Integer d:bfs.distancia)
			System.out.print(d+" ");
	}
	

}
