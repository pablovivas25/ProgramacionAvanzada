package migrafo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class GrafoPonderadoDirigido {
	private MatrizAdyacenciaDirigido grafo;
	private int cantAristas;
	private int cantNodos;
	//
	private List<List<Integer>> adjList = new ArrayList<>();
	
	 
	//
	
	private ArrayList<Nodo> nodos;
	private ArrayList<AristaPonderada> aristas;
	
	
	public GrafoPonderadoDirigido(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			this.cantNodos= sc.nextInt();
			this.cantAristas=sc.nextInt();
			this.aristas=new ArrayList<AristaPonderada>();
			this.nodos=new ArrayList<Nodo>();
			for(int p = 0 ; p<=this.cantNodos;p++) {
				
				this.adjList.add(p, new ArrayList<>());
			}
			
			

			this.grafo=new MatrizAdyacenciaDirigido(this.cantNodos);
			
			for(int j=1;j<=this.cantNodos;j++)
				nodos.add(new Nodo(j));
			
			for(int i=0;i<this.cantAristas;i++) {
				Nodo n1=new Nodo(sc.nextInt());
				Nodo n2=new Nodo(sc.nextInt());
				int peso=sc.nextInt();
				
				adjList.get(n1.getNumero()).add(n2.getNumero());
				
				this.grafo.ponerArista(n1.getNumero(), n2.getNumero(),peso);
				
				aristas.add(new AristaPonderada(n1,n2,peso));
				
			}
			
			printGraph();
			
		
			
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public List<List<Integer>> getAdjList() {
		return adjList;
	}

	public int getCantAristas() {
		return cantAristas;
	}

	public int getCantNodos() {
		return cantNodos;
	}

	public ArrayList<AristaPonderada> getAristas() {
		return aristas;
	}
	
	public int devolverPeso(Integer numeroNodo) {
		return this.nodos.get(numeroNodo).getCosto();
	}
	
	public int devolverPeso(Nodo n1,Nodo n2) {
		
		for(AristaPonderada a:this.aristas) {
			if(n1.getNumero()==a.getNodo1().getNumero() && n2.getNumero()==a.getNodo2().getNumero())
				return a.getPeso();
		}
		return -1;
	}
	

	public ArrayList<Nodo> getNodos() {
		return nodos;
	}
	

	public MatrizAdyacenciaDirigido getGrafo() {
		return grafo;
	}

	 public  void printGraph()
	    {
	        int src = 1;
	        int n = this.adjList.size();
	 
	        while (src < n)
	        {
	            // imprime el vértice actual y todos sus vértices vecinos
	            for (int dest: this.adjList.get(src)) {
	                System.out.print("(" + src + " ——> " + dest + ")\t");
	            }
	            System.out.println();
	            src++;
	        }
	    }

	public static void main(String[] args) {
		GrafoPonderadoDirigido gp=new GrafoPonderadoDirigido("./Archivo/Entrada/grafo.in");
		System.out.println(gp.getCantNodos() + " "+gp.getCantAristas());
		for(AristaPonderada a:gp.getAristas())
			System.out.println(a.getNodo1().getNumero() +" "+a.getNodo2().getNumero() + " "+ a.getPeso());
	}
	
	
	
}
