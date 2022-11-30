import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {
	
	private ArrayList<Nodo> ListNmst;
	private boolean[] Nmst;
	private int CostoArbol;
	private int CardinalidadNmst;
	private PriorityQueue<Arista> pq=new PriorityQueue<Arista>();
	private Grafo gr;
	
	
	public Prim (String s) {
		
		this.gr= new Grafo (s);
		this.ListNmst= new ArrayList<Nodo>();
		this.Nmst=new boolean[this.gr.getCantNodos()];
	
		Nodo inicial= new Nodo(5);
		this.Nmst[4]=true;
		this.CostoArbol=0;
		for(Arista l :this.gr.getListaAdy().get(inicial.getNumero())) {
			pq.add(l);	
		}
		while(this.ListNmst.size()<this.gr.getCantNodos()&&! pq.isEmpty()) {
			Arista aristaDeCola =pq.poll();
			if (this.Nmst [aristaDeCola.getNodoFinal().getNumero()-1]==false) {
				this.CostoArbol+=aristaDeCola.getPeso();
				System.out.println(CostoArbol);
				this.Nmst [aristaDeCola.getNodoFinal().getNumero()-1]=true;
				for(Arista l :this.gr.getListaAdy().get(aristaDeCola.getNodoFinal().getNumero())) {
					pq.add(l);
			}
				}
//				else if( (this.Nmst [aristaDeCola.getAristaInicial().getNumero()-1]==false)) {
//					this.Nmst [aristaDeCola.getAristaInicial().getNumero()-1]=true;
//					this.CostoArbol+=aristaDeCola.getPeso();
//					for(Arista l :this.gr.getListaAdy().get(aristaDeCola.getAristaInicial().getNumero())) {
//						pq.add(l);
//					
//				}
//			
//			
//				
//			}
			
		}
		//System.out.println(this.CostoArbol);
		
	}
	public static void main(String[] args) {
		new Prim("./Entrada/enunciado.in");
	}
	
	

}