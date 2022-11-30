package mygrafo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class GrafoNoDirigidoNoPonderado {
	private MatrizAdyacenciaNoDirigido grafo;
	private int cantAristas;
	private int cantNodos;
	
	private ArrayList<Nodo> nodos;
	private ArrayList<Arista> aristas;
	
	public GrafoNoDirigidoNoPonderado(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			this.cantNodos= sc.nextInt();
			this.cantAristas=sc.nextInt();
			this.aristas=new ArrayList<Arista>();
			this.nodos=new ArrayList<Nodo>();

			this.grafo=new MatrizAdyacenciaNoDirigido(this.cantNodos);
			
			for(int j=0;j<this.cantNodos;j++)
				nodos.add(new Nodo(j));
			
			for(int i=0;i<this.cantAristas;i++) {
				int n1=sc.nextInt();
			
				int  n2=sc.nextInt();
				
				this.nodos.get(n1).incrementarGrado();
				this.nodos.get(n2).incrementarGrado();
				
				this.grafo.ponerArista(n1, n2);
				
				aristas.add(new Arista(new Nodo(n1),new Nodo(n2)));
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
	/*
	public int devolverPeso(Nodo n1,Nodo n2) {
		for(Arista a:this.aristas) {
			if((n1.getNumero()==a.getNodo1().getNumero() && n2.getNumero()==a.getNodo2().getNumero() ) || (a.getNodo1().getNumero()==n2.getNumero() && a.getNodo2().getNumero()==n1.getNumero()))
				return a.getPeso();
		}
		return -1;
	}
	*/

	public ArrayList<Nodo> getNodos() {
		return nodos;
	}
	

	public MatrizAdyacenciaNoDirigido getGrafo() {
		return grafo;
	}

	
}
