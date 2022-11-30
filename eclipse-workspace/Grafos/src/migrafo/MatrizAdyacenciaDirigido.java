package migrafo;


public class MatrizAdyacenciaDirigido {
	private int[][] matrizAdyacencia;
	private int ordenMatriz;
	//private int dimensionVector;
	
	public MatrizAdyacenciaDirigido(int n) {
		this.ordenMatriz=n;
		this.matrizAdyacencia=new int[this.ordenMatriz][this.ordenMatriz];
		this.setearMatrizAdyacenciaDirigido(n);
	}
	public void setearMatrizAdyacenciaDirigido(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				this.matrizAdyacencia[i][j]=Integer.MAX_VALUE;
					
			}
				
		}
	}
	
	public void ponerArista(int fila,int columna,int peso) {
		this.matrizAdyacencia[fila-1][columna-1]=peso;
	
	}
	public int  hayArista(int fila,int columna) {
		return this.matrizAdyacencia[fila-1][columna-1];
	}
	
	public void mostar() {
		for(int i=0;i<this.ordenMatriz;i++) {
			for(int j=0;j<this.ordenMatriz;j++) {
				if (this.matrizAdyacencia[i][j]!=Integer.MAX_VALUE)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		MatrizAdyacenciaDirigido m=new MatrizAdyacenciaDirigido(3);
	

	}
	

}
