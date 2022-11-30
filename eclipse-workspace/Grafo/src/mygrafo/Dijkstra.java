package mygrafo;

import java.util.ArrayList;


public class Dijkstra {
	private GrafoDirigidoPonderado grafo;
	private Nodo inicial;
	private int[] d;
	private ArrayList<Integer> s;
	private ArrayList<Nodo> vs;
	private static final int infinito = Integer.MAX_VALUE;
	private boolean[] verificado;
	private int [] precedencia; //

	public Dijkstra(GrafoDirigidoPonderado g, Nodo inicio) {
		this.grafo = g;
		this.inicial = inicio;
		this.s = new ArrayList<Integer>();
		s.add(this.inicial.getNumero());
		this.vs = new ArrayList<Nodo>();
		this.d = new int[this.grafo.getCantNodos()];
		this.s.add(this.inicial.getNumero());
		this.vs.addAll(this.grafo.getNodos());
		this.vs.remove(this.inicial.getNumero() - 1);
		this.setearVectorD();
		this.verificado = new boolean[this.grafo.getCantNodos()];
		this.precedencia=new int [this.grafo.getCantNodos()];
		this.setearVectorPrecedencia();

	}
	public void setearVectorPrecedencia() {
		for(int i=0;i<this.precedencia.length;i++)
			this.precedencia[i]=this.inicial.getNumero();
	}
	
	public int[] getPrecedencia() {
		return precedencia;
	}
	public Nodo menorD() {
		int menor = this.d[0];
		int pos = 0;

		for (int i = 1; i < this.d.length; i++) {

			if (this.verificado[i] == false) {
				if (menor > this.d[i]) {
					menor = this.d[i];
					pos = i;
				}
			}

		}
		return new Nodo(pos + 1);
	}

	public void resolver() {
	
		Nodo menor = this.menorD();
		ArrayList<Nodo> listaadyacente=this.devolverAdyacente(menor);
		
		while (this.s.size() <= this.grafo.getCantNodos()) {
			if (!this.s.contains(menor.getNumero())) {
				for (Nodo ap :listaadyacente) {
					

						if (this.d[ap.getNumero()-1] > this.d[menor.getNumero()-1] + this.grafo.devolverPeso(menor, ap)) {
							this.d[ap.getNumero() - 1] = this.d[menor.getNumero() - 1] + this.grafo.devolverPeso(menor, ap);
							this.verificado[menor.getNumero() - 1] = true;
							this.s.add(menor.getNumero());
							this.precedencia[ap.getNumero()-1]=menor.getNumero();

						}

					
				}
				menor = this.menorD();
			    listaadyacente=this.devolverAdyacente(menor);
			
				
			}

		}

	}

	// }

	public Nodo getInicial() {
		return inicial;
	}

	public void setearVectorD() {
		for (Nodo n : this.grafo.getNodos()) {
			if (n.getNumero() != this.inicial.getNumero()) {
				if (this.grafo.getGrafo().hayArista(this.inicial.getNumero(), n.getNumero())!=Integer.MAX_VALUE) {
					System.out.println(this.grafo.devolverPeso(this.inicial, n));
					this.d[n.getNumero() - 1] = this.grafo.devolverPeso(this.inicial, n);
				} else
					this.d[n.getNumero() - 1] = this.infinito;

			}
			this.d[this.inicial.getNumero() - 1] = this.infinito;

		}
	}

	public void mostrarVectorD() {
		for (int i = 1; i <= this.d.length; i++)
			System.out.print(this.d[i - 1] + " ");
	}
	public void mostrarPrecedencia() {
		for(int i=0;i<this.precedencia.length;i++)
			System.out.print(this.precedencia[i]+" ");
	}
	
	public String mostrarCamino(Nodo n) {
		String camino="";
		int indice=n.getNumero();
		camino+=n.getNumero();
		camino+="<-";
		while(indice!=this.inicial.getNumero()) {
			camino+=this.precedencia[indice-1];
			camino+="<-";
			indice=this.precedencia[indice-1];
		}
		return camino;
	}
	public ArrayList<Nodo> devolverAdyacente(Nodo n){
		ArrayList<Nodo> nodos=new ArrayList<Nodo>();
		
		for(int i=1;i<=this.grafo.getCantNodos();i++) {
			if(this.grafo.getGrafo().hayArista(n.getNumero(), i)==Integer.MAX_VALUE) {
				nodos.add(new Nodo(i));
				//System.out.println(i+1);
			}
				
		}
		return nodos;
	}
	public static void main(String[] args) {
		GrafoDirigidoPonderado gp = new GrafoDirigidoPonderado("grafodijkstra.in");
	

		Nodo n1 = new Nodo(1);
		Dijkstra d = new Dijkstra(gp, n1);
		System.out.println();
		System.out.println("---Mostrando vector---");
		d.mostrarVectorD();
		System.out.println();
		d.resolver();
		System.out.println();
		System.out.println("---VECTOR D modificado---");
		d.mostrarVectorD();
		System.out.println();
		System.out.println("----Mostrando precedencia---");
		d.mostrarPrecedencia();
		System.out.println();
	
	}

}
