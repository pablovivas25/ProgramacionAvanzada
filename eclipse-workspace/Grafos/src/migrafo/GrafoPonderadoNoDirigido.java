package migrafo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GrafoPonderadoNoDirigido {
	private MatrizAdyacenciaNoDirigido grafo;
	private int cantAristas;
	private int cantNodos;
	
	private ArrayList<Nodo> nodos;
	private ArrayList<AristaPonderada> aristas;
	
	
	public GrafoPonderadoNoDirigido(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			this.cantNodos= sc.nextInt();
			this.cantAristas=sc.nextInt();
			this.aristas=new ArrayList<AristaPonderada>();
			this.nodos=new ArrayList<Nodo>();

			this.grafo=new MatrizAdyacenciaNoDirigido(this.cantNodos);
			
			for(int j=1;j<=this.cantNodos;j++)
				nodos.add(new Nodo(j));
			
			for(int i=0;i<this.cantAristas;i++) {
				Nodo n1=new Nodo(sc.nextInt());
				Nodo n2=new Nodo(sc.nextInt());
				int peso=sc.nextInt();
				
				this.grafo.ponerArista(n1.getNumero(), n2.getNumero());
				
				aristas.add(new AristaPonderada(n1,n2,peso));
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

	public ArrayList<AristaPonderada> getAristas() {
		return aristas;
	}
	
	
	
	public int devolverPeso(Nodo n1,Nodo n2) {
		for(AristaPonderada a:this.aristas) {
			if((n1.getNumero()==a.getNodo1().getNumero() && n2.getNumero()==a.getNodo2().getNumero() ) || (a.getNodo1().getNumero()==n2.getNumero() && a.getNodo2().getNumero()==n1.getNumero()))
				return a.getPeso();
		}
		return -1;
	}
	

	public ArrayList<Nodo> getNodos() {
		return nodos;
	}
	

	public MatrizAdyacenciaNoDirigido getGrafo() {
		return grafo;
	}

	public static void main(String[] args) {
		GrafoPonderadoDirigido gp=new GrafoPonderadoDirigido("Archivo/Entrada/prim.in");
		System.out.println(gp.getCantNodos() + " "+gp.getCantAristas());
		for(AristaPonderada a:gp.getAristas())
			System.out.println(a.getNodo1().getNumero() +" "+a.getNodo2().getNumero() + " "+ a.getPeso());
	}
	

}
