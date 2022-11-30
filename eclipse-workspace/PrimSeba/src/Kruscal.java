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
	private int padre[];
	private ArrayList<Arista> mst=new ArrayList<Arista>();
	
	
	
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
		
		this.padre=new int[this.gr.getCantNodos()];
		
		this.asignarPadre();
		
		while (this.mst.size()!=this.gr.getCantNodos()-1) {
			Arista salidaCola=pq.poll();
			
			if(find(salidaCola.getNodoInicial().getNumero()-1)!=find(salidaCola.getNodoFinal().getNumero()-1)) {
				mst.add(salidaCola);
				this.union(salidaCola.getNodoInicial().getNumero(), salidaCola.getNodoFinal().getNumero());
				this.CostoArbol+=salidaCola.getPeso();
				
			}
				
			}
			
		}
		
	
	

    public ArrayList<Nodo> getListNmst() {
		return ListNmst;
	}



	public void setListNmst(ArrayList<Nodo> listNmst) {
		ListNmst = listNmst;
	}



	public boolean[] getNmst() {
		return Nmst;
	}



	public void setNmst(boolean[] nmst) {
		Nmst = nmst;
	}



	public int getCostoArbol() {
		return CostoArbol;
	}



	public void setCostoArbol(int costoArbol) {
		CostoArbol = costoArbol;
	}



	public int getCardinalidadNmst() {
		return CardinalidadNmst;
	}



	public void setCardinalidadNmst(int cardinalidadNmst) {
		CardinalidadNmst = cardinalidadNmst;
	}



	public PriorityQueue<Arista> getPq() {
		return pq;
	}



	public void setPq(PriorityQueue<Arista> pq) {
		this.pq = pq;
	}



	public List<List<Nodo>> getNm() {
		return nm;
	}



	public void setNm(List<List<Nodo>> nm) {
		this.nm = nm;
	}



	public Grafo getGr() {
		return gr;
	}



	public void setGr(Grafo gr) {
		this.gr = gr;
	}



	public int[] getPadre() {
		return padre;
	}



	public void setPadre(int[] padre) {
		this.padre = padre;
	}



	public ArrayList<Arista> getMst() {
		return mst;
	}



	public void setMst(ArrayList<Arista> mst) {
		this.mst = mst;
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
		for (int i = 0; i < this.gr.getCantNodos(); i++) {
			this.padre[i] = i;
	
		}
	}
	public static void main(String[] args) {
		Kruscal k=new Kruscal("./Entrada/kruscal.in");
		for(Integer i:k.getPadre())
			System.out.print(i+ " ");
		
		System.out.println();
		
		for(Arista a:k.getMst())
			System.out.println(a.getNodoInicial().getNumero()+ " "+a.getNodoFinal().getNumero()+ " "+a.getPeso());
		System.out.println(k.getCostoArbol());
	}
}
