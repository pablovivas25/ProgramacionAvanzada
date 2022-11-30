import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prim {
	
	private ArrayList<Nodo> ListNmst;
	private boolean[] Nmst;
	private int CostoArbol;
	private int CardinalidadNmst;
	private PriorityQueue<Arista> pq=new PriorityQueue<Arista>();
	private Grafo gr;
	private List<Nodo> lista_nodos_iniciales=new ArrayList<Nodo>();
	
	public Prim (String s) {
		
		this.gr= new Grafo (s);
		this.ListNmst= new ArrayList<Nodo>();
		this.Nmst=new boolean[this.gr.getCantNodos()];
	
		Nodo inicial= new Nodo(1);
		lista_nodos_iniciales.add(new Nodo(3));
		lista_nodos_iniciales.add(new Nodo(5));
		
	
		this.CostoArbol=0;
		
		for(Nodo iniciales:this.lista_nodos_iniciales) {
			
			this.Nmst[iniciales.getNumero()-1]=true;
			
			for(Arista l :this.gr.getListaAdy().get(iniciales.getNumero())) {
				//System.out.println(l.getNodoInicial().getNumero() + " "+l.getNodoFinal().getNumero() + " "+l.getPeso());
				pq.add(l);	
			}
		}
		
		
		
		while(this.ListNmst.size()<this.gr.getCantNodos()&&! pq.isEmpty()) {
			Arista aristaDeCola =pq.poll();
			if (this.Nmst [aristaDeCola.getNodoFinal().getNumero()-1]==false) {
				this.CostoArbol+=aristaDeCola.getPeso();
		
				this.Nmst [aristaDeCola.getNodoFinal().getNumero()-1]=true;
				for(Arista l :this.gr.getListaAdy().get(aristaDeCola.getNodoFinal().getNumero())) {
					pq.add(l);
			}
				}

	
		}
		
		System.out.println(this.CostoArbol);
		//System.out.println(this.CostoArbol);
		
	}
	public static void main(String[] args) {
		new Prim("./Entrada/enunciado.in");
	}
	
	

}