package grafo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 


public class Grafo {
	private MatrizAdyacenciaDirigido grafo;
	private int cantAristas;
	private int cantNodos;
	
	private ArrayList<Nodo> nodos;
	private ArrayList<Arista> aristas;
	
	
	public Grafo(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			this.cantNodos= sc.nextInt();
			this.cantAristas=sc.nextInt();
			this.aristas=new ArrayList<Arista>();
			this.nodos=new ArrayList<Nodo>();

			this.grafo=new MatrizAdyacenciaDirigido(this.cantNodos);
			
			for(int j=1;j<=this.cantNodos;j++)
				nodos.add(new Nodo(j));
			
			for(int i=0;i<this.cantAristas;i++) {
				Nodo n1=new Nodo(sc.nextInt());
				Nodo n2=new Nodo(sc.nextInt());
				
				this.grafo.ponerArista(n1.getNumero(), n2.getNumero());
				
				aristas.add(new Arista(n1,n2));
			}
			
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public int getCantAristas() {
		return cantAristas;
	}

	public int getCantNodos() {
		return cantNodos;
	}

	
	public ArrayList<Arista> getAristas() {
		return aristas;
	}

	public ArrayList<Nodo> getNodos() {
		return nodos;
	}
	

	public MatrizAdyacenciaDirigido getGrafo() {
		return grafo;
	}
	
	public static void main(String[] args) {
		Grafo gp=new Grafo("Archivos/Entrada/enunciado.in");
		System.out.println(gp.getCantNodos() + " "+gp.getCantAristas());
		
		for(Arista a:gp.getAristas())
			System.out.println(a.getNodo1().getNumero() + " "+a.getNodo2().getNumero());
			
	}


}
