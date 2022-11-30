import java.util.ArrayList;
import java.util.PriorityQueue;


public class Dijkstra {

	Ciudad grafo;
	Esquina inicial;
	private int[] d;
	private ArrayList<Integer> s;
	private ArrayList<Esquina> vs;
	private static final int infinito = Integer.MAX_VALUE;
	private boolean[] visitado;
	private Esquina[] predecesores;

	public Dijkstra(Ciudad grafo) {
		this.grafo = grafo;
		this.inicial = grafo.getInicial();
		this.s = new ArrayList<Integer>();
	
		this.vs = new ArrayList<Esquina>();
		this.d = new int[this.grafo.getCantNodos()];
		this.s.add(this.inicial.getNumero());
		this.vs.addAll(this.grafo.getNodos());
		this.vs.remove(this.inicial.getNumero() - 1);
		this.setearVectorD();
		this.visitado = new boolean[this.grafo.getCantNodos()];
		this.setearPredecesores();

	}

	public void setearPredecesores() {
		this.predecesores = new Esquina[this.grafo.getCantNodos()];
		for (int i = 0; i < this.grafo.getCantNodos(); i++) {
			this.predecesores[i] = this.inicial;
		}
	}

	public void setearVectorD() {
		for (Esquina n : this.grafo.getNodos()) {
			if (n.getNumero() != this.inicial.getNumero()) {
				if (this.grafo.getMatrizAdyacenciaNoDirigida()[this.inicial.getNumero() - 1][n.getNumero()
						- 1] != Integer.MAX_VALUE) {
					this.d[n.getNumero() - 1] = this.grafo.getMatrizAdyacenciaNoDirigida()[this.inicial.getNumero()
							- 1][n.getNumero() - 1];
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

	public void cargarAdyacentesColaInicial(PriorityQueue<Esquina> cola) {
		cola.offer(new Esquina(this.inicial.getNumero(), 0));

		Esquina node = cola.poll();

		for (Calle ap : this.grafo.getAristas()) {

			if (ap.getEsq1().getNumero() == node.getNumero()) {

				cola.offer(new Esquina(ap.getEsq().getNumero(), ap.getDistancia()));
				this.d[ap.getEsq().getNumero() - 1] = ap.getDistancia();
			}

		}

	}

	public Esquina menorD() {
		int menor = this.d[0];
		int pos = 0;

		for (int i = 1; i < this.d.length; i++) {

			if (this.visitado[i] == false && this.inicial.getNumero()-1!=i) {
				if (menor > this.d[i]) {
					menor = this.d[i];
					pos = i;
				}
			}

		}
		return new Esquina(pos + 1);
	}

	public void resolver() {

		Esquina menor = this.menorD();

		while (this.s.size() <= this.grafo.getCantNodos()) {
			if (!this.s.contains(menor.getNumero())) {
				for (int i = 0; i < this.grafo.getCantNodos(); i++) {

					if (i != (menor.getNumero() - 1) && this.grafo.getMatrizAdyacenciaNoDirigida()[menor.getNumero()
							- 1][i] != Integer.MAX_VALUE) {
						int peso = this.grafo.getMatrizAdyacenciaNoDirigida()[menor.getNumero() - 1][i];

						if (this.d[i] > this.d[menor.getNumero() - 1] + peso) {

							this.d[i] = this.d[menor.getNumero() - 1] +peso;

							this.visitado[menor.getNumero() - 1] = true;

							this.predecesores[i] = menor;

							this.s.add(menor.getNumero());

						}

					}
				

				}
		

			}
			menor = this.menorD();

		}

	}
	
	public void resolverColaPrioridadAdycencia() {
		PriorityQueue<Esquina> cola = new PriorityQueue<>();

		d[this.inicial.getNumero() - 1] = 0;

		this.cargarAdyacentesColaInicial(cola);
		

		while (s.size()!=this.grafo.getCantNodos()) {
			Esquina node = cola.poll();

			int now = node.getNumero();
			
			int distActual = node.getDistancia_minima();
			
			if (d[now - 1] < distActual)
				continue;

			for (Integer ady : this.grafo.getAdjList().get(node.getNumero())) {
				
				if(ady!=this.inicial.getNumero()) {
					int j=this.grafo.getMatrizAdyacenciaNoDirigida()[now-1][ady-1];
				
					
					int distCalculada = this.d[node.getNumero() - 1] + j;
					if (distActual < distCalculada) {
			
						this.d[ady - 1] = distCalculada;
						this.visitado[node.getNumero() - 1] = true;
						this.predecesores[ady - 1] = node;
					//	if(!this.s.contains(node.getNumero()))
							this.s.add(node.getNumero());
						cola.offer(new Esquina(ady, this.d[node.getNumero() - 1] + j));

					}

				}
				}
				
		}
	}


	public void resolverColaPrioridad() {
		PriorityQueue<Esquina> cola = new PriorityQueue<>();

		d[this.inicial.getNumero() - 1] = 0;

		this.cargarAdyacentesColaInicial(cola);

		while (!cola.isEmpty()) {
			Esquina node = cola.poll();

			int now = node.getNumero();

			int distActual = node.getDistancia_minima();
			if (d[now - 1] < distActual)
				continue;

			for (Calle ap : this.grafo.getAristas()) {

				if (ap.getEsq1().getNumero() == node.getNumero()) {
					int j = ap.getDistancia();

					int distCalculada = this.d[node.getNumero() - 1] + j;
					if (distActual > distCalculada) {

						this.d[ap.getEsq().getNumero() - 1] = distCalculada;
						this.visitado[node.getNumero() - 1] = true;
						this.predecesores[ap.getEsq().getNumero() - 1] = node;
						this.s.add(node.getNumero());
						cola.offer(new Esquina(ap.getEsq().getNumero(), this.d[node.getNumero() - 1] + ap.getDistancia()));

					}

				}
			}

		}

	}

	public static void main(String[] args) {
		Ciudad gp = new Ciudad("PreparacionPruebas/LotePrueba/Entrada/vecinos.in");
	
		Dijkstra d = new Dijkstra(gp);

		System.out.println("---Mostrando vector---");
		d.mostrarVectorD();

		System.out.println();
		d.resolverColaPrioridadAdycencia();
		System.out.println("---VECTOR D modificado---");
		d.mostrarVectorD();
	
		/*
		 * System.out.println("---PREDECESORES-----"); for (Esquina n :
		 * d.getPredecesores()) System.out.print(n.getNumero() + " ");
		 * 
		 * System.out.println("---Predecesores de 5---"); String r =
		 * d.obtenerPredecesor(new Esquina(5)); System.out.println(r); StringBuilder s =
		 * new StringBuilder(r); System.out.println(s.reverse().toString());
		 * System.out.println();
		 */

	}
}
