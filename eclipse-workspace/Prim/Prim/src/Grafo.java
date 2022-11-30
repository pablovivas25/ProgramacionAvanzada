import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Grafo {
	
	//PriorityQueue<Arista> pa = new  PriorityQueue<Arista>(13, new AristaComparator());
	private int CantNodos;
	private int CantAristas;
	private List<List<Arista>> ListaAdy=new ArrayList<>();;
	private List<Arista> listaArista=new ArrayList<>();

	public Grafo(String string) {
		
		try {
			Scanner sc = new Scanner(new File(string));
			
			this.CantNodos=sc.nextInt();
			this.CantAristas=sc.nextInt();
			
			for(int p = 0 ; p<=this.CantNodos;p++) {

                this.ListaAdy.add(p, new ArrayList<Arista>());
            }
			while (sc.hasNext()) {
				
				int nodoIzq=sc.nextInt();
				int nodoDer=sc.nextInt();
				int Peso=sc.nextInt();
				this.listaArista.add((new Arista(new Nodo(nodoIzq),new Nodo(nodoDer),Peso)));
			//	this.listaArista.add(new Arista(nodoIzq,nodoDer,Peso));
				Arista aux =new Arista(new Nodo(nodoIzq),new Nodo(nodoDer),Peso);
				
				this.ListaAdy.get(nodoIzq).add(new Arista(new Nodo(nodoIzq),new Nodo(nodoDer),Peso));
				this.ListaAdy.get(nodoDer).add(new Arista(new Nodo(nodoDer),new Nodo(nodoIzq),Peso));
				
				
				
			}
			for (Arista arista : listaArista) {
				System.out.println();
			}
			
//			for (List<Arista> list : ListaAdy) {
//				for (Arista arista : list) {
//					System.out.println("Nodo Izquierdo: "+arista.getAristaInicial().getNumero()
//							+" Nodo Derecho : "+arista.getAristaFinal().getNumero()+
//							" Peso :"+arista.getPeso()
//								);
//				}
//			}
			
//			for (int i = 0; i < this.CantAristas; i++) {
//			 Arista arista=pq.poll();
//			 System.out.println("Nodo Izquierdo: "+arista.getAristaInicial().getNumero()
//						+" Nodo Derecho : "+arista.getAristaFinal().getNumero()+
//						" Peso :"+arista.getPeso()
//							);
//				
//			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Grafo("enunciado.in");
	}

	public int getCantNodos() {
		return CantNodos;
	}

	public void setCantNodos(int cantNodos) {
		CantNodos = cantNodos;
	}

	public int getCantAristas() {
		return CantAristas;
	}

	public void setCantAristas(int cantAristas) {
		CantAristas = cantAristas;
	}

	public List<List<Arista>> getListaAdy() {
		return ListaAdy;
	}

	public void setListaAdy(List<List<Arista>> listaAdy) {
		ListaAdy = listaAdy;
	}

	public List<Arista> getListaArista() {
		return listaArista;
	}

	public void setListaArista(List<Arista> listaArista) {
		this.listaArista = listaArista;
	}
	
}
