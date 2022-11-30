package migrafo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
	private GrafoPonderadoDirigido grafo;
	private Nodo inicial;
	private int[] d;
	private ArrayList<Integer> s;
	private ArrayList<Nodo> vs;
	private static final int infinito = Integer.MAX_VALUE;
	private boolean[] visitado;
	private Nodo[] predecesores;

	public Dijkstra(GrafoPonderadoDirigido g, Nodo inicio) {
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
		this.visitado = new boolean[this.grafo.getCantNodos()];
		this.setearPredecesores();

	}

	public void setearPredecesores() {
		this.predecesores = new Nodo[this.grafo.getCantNodos()];
		for (int i = 0; i < this.grafo.getCantNodos(); i++) {
			this.predecesores[i] = this.inicial;
		}
	}

	public Nodo menorD() {
		int menor = this.d[0];
		int pos = 0;

		for (int i = 1; i < this.d.length; i++) {

			if (this.visitado[i] == false) {
				if (menor > this.d[i]) {
					menor = this.d[i];
					pos = i;
				}
			}

		}
		return new Nodo(pos + 1);
	}

	public void resolver() {

		Nodo menor = this.menorD(); // pasa 1 , menor 2

		while (this.s.size() <= this.grafo.getCantNodos()) {
			if (!this.s.contains(menor.getNumero())) {
				for (AristaPonderada ap : this.grafo.getAristas()) {
					if (ap.getNodo1().getNumero() == menor.getNumero()) {

						if (this.d[ap.getNodo2().getNumero() - 1] > this.d[menor.getNumero() - 1] + ap.getPeso()) {
							this.d[ap.getNodo2().getNumero() - 1] = this.d[menor.getNumero() - 1] + ap.getPeso();
							this.visitado[menor.getNumero() - 1] = true;
							this.predecesores[ap.getNodo2().getNumero() - 1] = menor;
							this.s.add(menor.getNumero());

						}

					}
				}
				menor = this.menorD(); // menor es 4

			}

		}

	}

	public void cargarAdyacentesColaInicial(PriorityQueue<Nodo> cola) {
		cola.offer(new Nodo(this.inicial.getNumero(), 0));

		Nodo node = cola.poll();

		for (AristaPonderada ap : this.grafo.getAristas()) {

			if (ap.getNodo1().getNumero() == node.getNumero()) {

				cola.offer(new Nodo(ap.getNodo2().getNumero(), ap.getPeso()));
				this.d[ap.getNodo2().getNumero() - 1] = ap.getPeso();
			}

		}

	}

	public void resolverColaPrioridad() {
		PriorityQueue<Nodo> cola = new PriorityQueue<>();

		d[this.inicial.getNumero() - 1] = 0;

		this.cargarAdyacentesColaInicial(cola);

		while (!cola.isEmpty()) {
			Nodo node = cola.poll();

			int now = node.getNumero();

			int distActual = node.getCosto();
			if (d[now - 1] < distActual)
				continue;

			for (AristaPonderada ap : this.grafo.getAristas()) {

				if (ap.getNodo1().getNumero() == node.getNumero()) {
					int j = ap.getPeso();

					int distCalculada = this.d[node.getNumero() - 1] + j;
					if (distActual < distCalculada) {

						this.d[ap.getNodo2().getNumero() - 1] = distCalculada;
						this.visitado[node.getNumero() - 1] = true;
						this.predecesores[ap.getNodo2().getNumero() - 1] = node;
						this.s.add(node.getNumero());
						cola.offer(new Nodo(ap.getNodo2().getNumero(), this.d[node.getNumero() - 1] + ap.getPeso()));

					}

				}
			}

		}

	}

	public void resolverColaPrioridadAdycencia() {
		PriorityQueue<Nodo> cola = new PriorityQueue<>();

		d[this.inicial.getNumero() - 1] = 0;

		this.cargarAdyacentesColaInicial(cola);

		while (!cola.isEmpty()) {
			Nodo node = cola.poll();

			int now = node.getNumero();

			int distActual = node.getCosto();
			if (d[now - 1] < distActual)
				continue;

			for (Integer ady : this.grafo.getAdjList().get(node.getNumero())) {
				
				System.out.println(ady);
				//int j = this.grafo.devolverPeso(node, new Nodo(ady));
				int j=this.grafo.getGrafo().hayArista(now, ady);
				System.out.println("j "+j);
				int distCalculada = this.d[node.getNumero() - 1] + j;
				if (distActual < distCalculada) {

					this.d[ady - 1] = distCalculada;
					this.visitado[node.getNumero() - 1] = true;
					this.predecesores[ady - 1] = node;
					this.s.add(node.getNumero());
					cola.offer(new Nodo(ady, this.d[node.getNumero() - 1] + j));

				}

			}
		}
	}

	public int[] getD() {
		return d;
	}

	public ArrayList<Integer> getS() {
		return s;
	}

	public boolean[] getvisitado() {
		return visitado;
	}

	public Nodo getInicial() {
		return inicial;
	}

	public void setearVectorD() {
		for (Nodo n : this.grafo.getNodos()) {
			if (n.getNumero() != this.inicial.getNumero()) {
				if (this.grafo.getGrafo().hayArista(this.inicial.getNumero(), n.getNumero())!=Integer.MAX_VALUE) {
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

	public Nodo[] getPredecesores() {
		return predecesores;
	}

	public String obtenerPredecesor(Nodo n) {
		/*
		 * System.out.println(n.getNumero()); String salida="-->";
		 * salida+=n.getNumero(); int
		 * aux=this.predecesores[n.getNumero()-1].getNumero(); //3
		 * System.out.println(aux); while(aux!=this.inicial.getNumero()) {
		 * salida+="-->"+aux; salida+="-->"+this.predecesores[aux-1].getNumero()+"-->";
		 * aux=this.predecesores[this.predecesores[n.getNumero()-1].getNumero()].
		 * getNumero(); } salida+=this.inicial.getNumero();
		 */

		String salida = "";
		salida += n.getNumero();
		int aux = this.predecesores[n.getNumero() - 1].getNumero();

		while (aux != this.inicial.getNumero()) {
			salida += ">-" + aux;
			aux = this.predecesores[aux - 1].getNumero();

		}
		salida += ">-" + this.inicial.getNumero();

		return salida;

	}

	public static void main(String[] args) {
		GrafoPonderadoDirigido gp = new GrafoPonderadoDirigido("Archivo/Entrada/grafo.in");

		Nodo n1 = new Nodo(1);
		Dijkstra d = new Dijkstra(gp, n1);

		System.out.println("---Mostrando vector---");
		d.mostrarVectorD();

		System.out.println();
		d.resolverColaPrioridadAdycencia();
		System.out.println("---VECTOR D modificado---");
		d.mostrarVectorD();

		System.out.println("---PREDECESORES-----");
		for (Nodo n : d.getPredecesores())
			System.out.print(n.getNumero() + " ");

		System.out.println("---Predecesores de 5---");
		String r = d.obtenerPredecesor(new Nodo(5));
		System.out.println(r);
		StringBuilder s = new StringBuilder(r);
		System.out.println(s.reverse().toString());
		System.out.println();

	}

}
