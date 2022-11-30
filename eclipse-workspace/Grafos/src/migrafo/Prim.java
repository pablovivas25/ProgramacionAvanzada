package migrafo;

import java.util.ArrayList;
import java.util.List;

public class Prim {
	private GrafoPonderadoNoDirigido grafo;
	private List<Integer> s;
	private List<Integer> vs;

	private static final int infinito = Integer.MAX_VALUE;
	private boolean[] verificado;
	private int costoMinimo;

	public Prim(GrafoPonderadoNoDirigido g) {
		this.grafo = g;
		this.costoMinimo = 0;
		this.s = new ArrayList<Integer>();
		this.vs = new ArrayList<Integer>();
		for (int i = 0; i < g.getCantNodos(); i++)
			this.vs.add(this.grafo.getNodos().get(i).getNumero()); // 1,2,3,4 y 5
		this.verificado = new boolean[this.grafo.getCantNodos()];

	}

	public List<Integer> getS() {
		return s;
	}

	public List<Integer> getVs() {
		return vs;
	}

	public void resolver() {
		//int nodoInicial = (int) (Math.random() * this.grafo.getCantNodos());
		int nodoInicial=1;
		Nodo anterior=null;
		System.out.println("Nodo inicial " + nodoInicial);
		
		this.s.add(nodoInicial);
		anterior=new Nodo(nodoInicial);
		this.verificado[nodoInicial] = true;
		vs.remove(nodoInicial - 1);

		while (s.size() < this.grafo.getCantNodos()) {
			AristaPonderada ady = this.menorPesoNodoAdyacente();
			s.add(ady.getNodo2().getNumero());
			this.costoMinimo += this.grafo.devolverPeso(ady.getNodo1(), ady.getNodo2());
				
			vs.remove(this.vs.indexOf(ady.getNodo2().getNumero()));
			anterior=new Nodo(s.get(s.size()-1));
		
		}

	}
	
	public boolean hayCiclo(Nodo n) {
		
		if(this.grafo.getGrafo().hayArista(s.get(0),n.getNumero()))
		 if(this.grafo.getGrafo().hayArista(s.get(s.size()-1), n.getNumero()))
			 return true;
		
		return false;
		
	}
	public AristaPonderada menorPesoNodoAdyacente() {
		int menor = Integer.MAX_VALUE;
		Nodo nodoMen = null;
		Nodo n1=null;
		for (int j = 0; j < this.s.size(); j++) {
			for (int i = 0; i < this.vs.size(); i++) {
				if (this.grafo.getGrafo().hayArista(this.s.get(j), this.vs.get(i))) {
					if (this.grafo.devolverPeso(new Nodo(this.s.get(j)), new Nodo(this.vs.get(i))) < menor) {
						menor = this.grafo.devolverPeso(new Nodo(this.s.get(j)), new Nodo(this.vs.get(i))); // nodo1 nodo2 peso
						nodoMen = new Nodo(this.vs.get(i));
						n1=new Nodo(this.s.get(j));
					}

				}
			}

		}
		return new AristaPonderada(n1,nodoMen,menor);
	}
/*
	public AristaPonderada menorPesoAdyacente(Nodo evaluar) {
		int menor = Integer.MAX_VALUE;
		Nodo menorNodo = null;
		Nodo n1=null;
		for (int i = 0; i < this.grafo.getCantAristas(); i++) {
			int aux = this.grafo.getAristas().get(i).getNodo1().getNumero() == evaluar.getNumero() ? 1
					: this.grafo.getAristas().get(i).getNodo2().getNumero() == evaluar.getNumero() ? 2 : -1;

			if (aux == 1) {
				if (this.grafo.getAristas().get(i).getPeso() < menor) {
					menor = this.grafo.getAristas().get(i).getPeso();
					menorNodo = this.grafo.getAristas().get(i).getNodo2();
					n1=this.grafo.getAristas().get(i).getNodo1();

				}
			} else if (aux == 2) {
				if (this.grafo.getAristas().get(i).getPeso() < menor) {
					menor = this.grafo.getAristas().get(i).getPeso();
					menorNodo = this.grafo.getAristas().get(i).getNodo1();
					n1=this.grafo.getAristas().get(i).getNodo1();

				}
			}

		}
		// this.verificado[menorNodo.getNumero()]=true;
		return new AristaPonderada(n1,menorNodo,menor);
	}
*/
	public static void main(String[] args) {
		GrafoPonderadoNoDirigido g = new GrafoPonderadoNoDirigido("Archivo/Entrada/prim.in");
		Prim p = new Prim(g);
		p.resolver();
		for (Integer e : p.getS())
			System.out.println(e);
		System.out.println("-----vs----");
		for (Integer i : p.getVs())
			System.out.println(i);
		System.out.println(p.costoMinimo);

	}

}
