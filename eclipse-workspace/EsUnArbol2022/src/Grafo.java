import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grafo{
	private int cantidad_nodos;
	private int cantidad_arcos;
	private List<Nodo> listado_nodos;
	private List<Arco> listado_arcos;
	private boolean [][]matriz_adyacencia;
	private int [] grados_aux;

	
	

	public static Grafo leerGrafo(String path) {
		Grafo g=null;
		try {
			Scanner sc=new Scanner(new File(path));
		
			
			g=new Grafo();
			
			g.cantidad_nodos=sc.nextInt();
			g.cantidad_arcos=sc.nextInt();
			
			
			g.listado_nodos=new ArrayList<Nodo>();
			g.listado_arcos=new ArrayList<Arco>();
			g.matriz_adyacencia=new boolean[g.cantidad_nodos][g.cantidad_nodos];
			g.grados_aux=new int[g.cantidad_nodos];
			
			for(int i=0;i<g.cantidad_nodos;i++) {
				g.listado_nodos.add(new Nodo(i+1));
				g.grados_aux[i]=0;
			}
				
		
			for(int j=0;j<g.cantidad_arcos;j++) {
				int nodo1=sc.nextInt();
				int nodo2=sc.nextInt();
				
				g.listado_arcos.add(new Arco(new Nodo(nodo1),new Nodo(nodo2)));
				g.matriz_adyacencia[nodo1-1][nodo2-1]=true;
				g.grados_aux[nodo2-1]+=1;
				//System.out.println(g.grados_aux[nodo2-1]);
			}
			
			for(int k=0;k<g.grados_aux.length;k++)
				g.listado_nodos.get(k).setGrado(g.grados_aux[k]);
			
		
			sc.close();
			
			
			return g;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return g;
		
		
	}
	public int getCantidad_nodos() {
		return cantidad_nodos;
	}
	public void setCantidad_nodos(int cantidad_nodos) {
		this.cantidad_nodos = cantidad_nodos;
	}
	public List<Nodo> getListado_nodos() {
		return listado_nodos;
	}
	public void setListado_nodos(List<Nodo> listado_nodos) {
		this.listado_nodos = listado_nodos;
	}
	public List<Arco> getListado_arcos() {
		return listado_arcos;
	}
	public void setListado_arcos(List<Arco> listado_arcos) {
		this.listado_arcos = listado_arcos;
	}
	public boolean[][] getMatriz_adyacencia() {
		return matriz_adyacencia;
	}
	public void setMatriz_adyacencia(boolean[][] matriz_adyacencia) {
		this.matriz_adyacencia = matriz_adyacencia;
	}
	public int getCantidad_arcos() {
		return cantidad_arcos;
	}


}
