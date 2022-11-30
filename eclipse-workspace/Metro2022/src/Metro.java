import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Metro {
	private List<Isla> nodos;
	private List<Puente> puentes;
	private List<Tunel> tuneles;
//	private ArrayList<Arista> mst=new ArrayList<Arista>();
	private List<Arista> aristas;
	
	private int padre[];
	
	private int minimo_puentes=0;
	
	public List<Isla> getNodos() {
		return nodos;
	}
	public void setNodos(List<Isla> nodos) {
		this.nodos = nodos;
	}
	public List<Puente> getPuentes() {
		return puentes;
	}
	public void setPuentes(List<Puente> puentes) {
		this.puentes = puentes;
	}
	public List<Tunel> getTuneles() {
		return tuneles;
	}
	public void setTuneles(List<Tunel> tuneles) {
		this.tuneles = tuneles;
	}
	
	public int getMinimo_puentes() {
		return minimo_puentes;
	}
	public void setMinimo_puentes(int minimo_puentes) {
		this.minimo_puentes = minimo_puentes;
	}
	public Metro(List<Isla> nodos, List<Arista> arista) {
		super();
		this.nodos = nodos;
		this.aristas=arista;
	}

	public int find(int p) {
       
        while (p!= this.padre[p]) { 
            this.padre[p] = this.padre[this.padre[p]];    // path compression by halving
            p = this.padre[p];
        }
        return p;
    }
    
    public void union(int x, int y) {
		 int i=this.padre[find(x-1)];
		 int j=this.padre[find(y-1)];
		 if(i==j)
			 return;
		 else {
			 if(i>j)
				 this.padre[i]=this.padre[j];
			 else
				 this.padre[j]=this.padre[i];
		 }
			 
		 
		
		
	}


	public void asignarPadre() {
		for (int i = 0; i < this.nodos.size(); i++) {
			this.padre[i] = i;
	
		}
	}
	
	public void resolver() {
		PriorityQueue<Arista> pq=new PriorityQueue<Arista>();
		ArrayList<Arista> mst=new ArrayList<Arista>();
		
		for(Arista a :this.aristas) {
			
			pq.add(a);
		}
	
		
		this.padre=new int[this.nodos.size()];
		
		this.asignarPadre();
		
		//
		while (  (mst.size()+1)!=this.nodos.size()) {
			Arista salidaCola=pq.poll();
			
			if(find(salidaCola.getIs1().getNumero()-1)!=find(salidaCola.getIs2().getNumero()-1)) {
				mst.add(salidaCola);
				this.union(salidaCola.getIs1().getNumero(), salidaCola.getIs2().getNumero());
				this.minimo_puentes+=salidaCola.getCosto();
				
			}
				
			}
		 System.out.println(mst.size());
		 System.out.println(this.minimo_puentes);
		 
		 for(Arista a:mst)
			 System.out.println(a.getIs1().getNumero() +" "+a.getIs2().getNumero() + " "+a.getCosto());
	}
	
	
}
