package mygrafo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;




public class Prim  {
	private GrafoNoDirigidoPonderado grafo;
	private List<Integer> s;
	private List<Integer> vs;

	private static final int infinito = Integer.MAX_VALUE;
	private boolean[] verificado;
	private int costoMinimo=0;
	private Nodo inicial;
	
	public Prim(GrafoNoDirigidoPonderado g,Nodo inicio) {
		this.grafo = g;
		this.costoMinimo = 0;
		this.s = new ArrayList<Integer>();
		this.vs = new ArrayList<Integer>();
		for (int i = 0; i < g.getCantNodos(); i++)
			this.vs.add(this.grafo.getNodos().get(i).getNumero()); // 1,2,3,4 y 5
		this.verificado = new boolean[this.grafo.getCantNodos()];
		this.inicial=inicio;

	}
	public void resolver() {
		PriorityQueue<NodoAdyacente> aristas=new PriorityQueue<NodoAdyacente>();
		this.s.add(this.inicial.getNumero());
		this.verificado[this.inicial.getNumero()-1]=true;
		this.vs.remove(this.inicial.getNumero()-1);
		
		for(int i=1;i<this.grafo.getCantNodos();i++){
			if(this.grafo.getGrafo().hayArista(this.inicial.getNumero()-1, i-1)==true) {
		
				int peso=this.grafo.devolverPeso(inicial, new Nodo(i));
				if(peso!=-1)
					aristas.add(new NodoAdyacente(new Nodo(i),this.grafo.devolverPeso(inicial, new Nodo(i))));
			}
				
		}
			
		while(this.s.size()!=4) {
			NodoAdyacente nad;
			
		
			nad=aristas.poll();
			
			while(nad!=null) {
				this.verificado[nad.getNodo().getNumero()-1]=true;
				this.costoMinimo+=nad.getCosto();
				s.add(nad.getNodo().getNumero());
				//System.out.println(nad.getNodo().getNumero());
				
				for(int i=1;i<this.grafo.getCantNodos();i++){
					if(this.grafo.getGrafo().hayArista(nad.getNodo().getNumero()-1, i-1)==true) {
				
						int peso=this.grafo.devolverPeso(nad.getNodo(), new Nodo(i));
						if(peso!=-1)
							aristas.add(new NodoAdyacente(new Nodo(i),this.grafo.devolverPeso(nad.getNodo(), new Nodo(i))));
					}
						
				}
				nad=aristas.poll();
			}
			
			
			//System.out.println("s "+s.size());
			
		}
		//System.out.println("Costo "+this.costoMinimo);
		//System.out.println("VS "+vs.size());
		
		
		
	}
	
	public List<Integer> getS() {
		return s;
	}
	public void setS(List<Integer> s) {
		this.s = s;
	}
	public List<Integer> getVs() {
		return vs;
	}
	public void setVs(List<Integer> vs) {
		this.vs = vs;
	}
	
	public int getCostoMinimo() {
		return costoMinimo;
	}
	public static void main(String[] args) {
		GrafoNoDirigidoPonderado g = new GrafoNoDirigidoPonderado("prim.in");
		//g.getGrafo().mostar();
		Prim p = new Prim(g,new Nodo(1));
		p.resolver();
		System.out.println("Costo Minimo "+p.getCostoMinimo());
		
	
	}

}
