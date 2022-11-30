import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Kruscal {
	private ArrayList<Nodo> ListNmst=new ArrayList<Nodo>();
	private boolean[] Nmst;
	private int CostoArbol=0;
	private int CardinalidadNmst;
	private PriorityQueue<Arista> pq=new PriorityQueue<Arista>();
	private List<List<Nodo>> nm = new ArrayList<>();
	private Grafo gr;
	
	
	
	public Kruscal(String s) {
		
		this.gr=new Grafo(s);
		for(Arista a :gr.getListaArista()) {
			
			pq.add(a);
		}
		for(int p = 0 ; p<this.gr.getCantNodos();p++) {

            this.nm.add(p, new ArrayList<Nodo>());
            this.nm.get(p).add(new Nodo(p));
        }
		this.Nmst= new boolean[gr.getCantNodos()];
		
		
		while (this.nm.size()!=1) {
			Arista salidaCola=pq.poll();
			
			if(Contiene(salidaCola.getNodoFinal(),salidaCola.getNodoInicial())==true){
				System.out.println(salidaCola.getNodoInicial().getNumero()+" + " +salidaCola.getNodoFinal().getNumero() + "| "+salidaCola.getPeso());
				int find1= find(salidaCola.getNodoInicial());
				int find2= find(salidaCola.getNodoFinal());
				if(find1<find2)
				nm.get(find1).addAll(nm.remove(find2));
				else
					nm.get(find2).addAll(nm.remove(find1));
//				nm.get(find(salidaCola.getNodoInicial()))
//				nm.addAll(),nm.get(salidaCola.getNodoFinal()));
				this.CostoArbol+=salidaCola.getPeso();
			this.Nmst[salidaCola.getNodoFinal().getNumero()-1]=true;
			this.Nmst[salidaCola.getNodoInicial().getNumero()-1]=true;
				
			}
			
		}
		for(int i=0 ;i<this.Nmst.length;i++) {
			
			System.out.println(this.Nmst[i]+"|");
		}
		System.out.println(this.CostoArbol);
	}



	private boolean Contiene(Nodo NodoFinal, Nodo NodoInicial) {
		
		int find2= find(NodoInicial);
		int find1=find(NodoFinal);
		if (find1==find2)
		return true;
		else
		return false;
	}



	private int find(Nodo nodo) {
		int i =0;
		for(List<Nodo>  a : this.nm) {
			
			if (a.contains(nodo)) {
				return i;
			}
			i++;
			
		}
		 
		return i;
	}
	public static void main(String[] args) {
		new Kruscal("./Entrada/enunciado.in");
	}
}
