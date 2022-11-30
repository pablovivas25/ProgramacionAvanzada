import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciudad {
	private int cantAristas;
	private int cantNodos;
	
	private ArrayList<Esquina> nodos;
	private ArrayList<Calle> aristas;
	private int ordenMatriz;
	private int[][] matrizAdyacenciaDirigida;
	private int[][] matrizAdyacenciaNoDirigida;
	private Esquina inicial;
	private Esquina escuela;
	private List<List<Integer>> adjList = new ArrayList<>();

	public Ciudad(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			this.cantNodos= sc.nextInt();
			this.inicial=new Esquina(sc.nextInt());
			this.escuela=new Esquina(sc.nextInt());
			
			this.cantAristas=sc.nextInt();
			this.aristas=new ArrayList<Calle>();
			this.nodos=new ArrayList<Esquina>();
			
			this.matrizAdyacenciaDirigida=new int[this.cantNodos][this.cantNodos];
			this.matrizAdyacenciaNoDirigida=new int[this.cantNodos][this.cantNodos];
			
			this.setearMatriz();
			
			
			for(int j=1;j<=this.cantNodos;j++)
				nodos.add(new Esquina(j));
	
			for(int p = 0 ; p<=this.cantNodos;p++) {
							
				this.adjList.add(p, new ArrayList<>());
			}
			for(int i=0;i<this.cantAristas;i++) {
				Esquina n1=new Esquina(sc.nextInt());
				Esquina n2=new Esquina(sc.nextInt());
				int peso=sc.nextInt();
			
				adjList.get(n1.getNumero()).add(n2.getNumero());
				adjList.get(n2.getNumero()).add(n1.getNumero());
				
				this.matrizAdyacenciaDirigida[n1.getNumero()-1][n2.getNumero()-1]=i+1;
				
				this.matrizAdyacenciaNoDirigida[n1.getNumero()-1][n2.getNumero()-1]=peso;
				this.matrizAdyacenciaNoDirigida[n2.getNumero()-1][n1.getNumero()-1]=peso;
				
				
				aristas.add(new Calle(n1,n2,peso,i+1));
			}
	
			
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public List<List<Integer>> getAdjList() {
		return adjList;
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

	public int getCantAristas() {
		return cantAristas;
	}

	public int getCantNodos() {
		return cantNodos;
	}

	public ArrayList<Esquina> getNodos() {
		return nodos;
	}

	public ArrayList<Calle> getAristas() {
		return aristas;
	}

	public int getOrdenMatriz() {
		return ordenMatriz;
	}

	public int[][] getMatrizAdyacenciaDirigida() {
		return matrizAdyacenciaDirigida;
	}

	public int[][] getMatrizAdyacenciaNoDirigida() {
		return matrizAdyacenciaNoDirigida;
	}

	public Esquina getInicial() {
		return inicial;
	}

	public Esquina getEscuela() {
		return escuela;
	}
	
	public void setearMatriz() {
		for(int i=0;i<this.cantNodos;i++) {
			for(int j=0;j<this.cantNodos;j++) {
				this.matrizAdyacenciaDirigida[i][j]=Integer.MAX_VALUE;
				this.matrizAdyacenciaNoDirigida[i][j]=Integer.MAX_VALUE;
				this.matrizAdyacenciaNoDirigida[j][i]=Integer.MAX_VALUE;
					
			}
				
		}
	}
	
	public void mostrarMatriz() {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(this.matrizAdyacenciaNoDirigida[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	


}
