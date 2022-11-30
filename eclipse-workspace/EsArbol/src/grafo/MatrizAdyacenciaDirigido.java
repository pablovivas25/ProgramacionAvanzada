package grafo;


public class MatrizAdyacenciaDirigido {
	private boolean[][] matrizAdyacencia;
	private int ordenMatriz;
	//private int dimensionVector;
	
	public MatrizAdyacenciaDirigido(int n) {
		this.ordenMatriz=n;
		this.matrizAdyacencia=new boolean[this.ordenMatriz][this.ordenMatriz];
		this.setearMatrizAdyacenciaDirigido(n);
	}
	public void setearMatrizAdyacenciaDirigido(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				this.matrizAdyacencia[i][j]=false;
					
			}
				
		}
	}
	
	public void ponerArista(int fila,int columna) {
		this.matrizAdyacencia[fila-1][columna-1]=true;
	
	}
	public boolean hayArista(int fila,int columna) {
		return this.matrizAdyacencia[fila-1][columna-1];
	}
	
	public void mostar() {
		for(int i=0;i<this.ordenMatriz;i++) {
			for(int j=0;j<this.ordenMatriz;j++) {
				if (this.matrizAdyacencia[i][j])
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		MatrizAdyacenciaDirigido m=new MatrizAdyacenciaDirigido(3);
		m.ponerArista(1, 1);
		m.ponerArista(2, 2);
		m.mostar();
	}
	

}
