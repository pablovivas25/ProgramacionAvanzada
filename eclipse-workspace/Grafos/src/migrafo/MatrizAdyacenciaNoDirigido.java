package migrafo;

public class MatrizAdyacenciaNoDirigido {
	private boolean[][] matrizAdyacencia;
	private int ordenMatriz;
	//private int dimensionVector;
	
	public MatrizAdyacenciaNoDirigido(int n) {
		this.ordenMatriz=n;
		this.matrizAdyacencia=new boolean[this.ordenMatriz][this.ordenMatriz];
		this.setearMatrizAdyacenciaNoDirigido(n);
	}
	public void setearMatrizAdyacenciaNoDirigido(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				this.matrizAdyacencia[i][j]=false;
				this.matrizAdyacencia[j][i]=false;
					
			}
				
		}
	}
	
	public void ponerArista(int fila,int columna) {
		this.matrizAdyacencia[fila-1][columna-1]=true;
		this.matrizAdyacencia[columna-1][fila-1]=true;
	
	}
	public boolean hayArista(int fila,int columna) {
	 if(this.matrizAdyacencia[fila-1][columna-1]==true)
		 return true;
	 else if(this.matrizAdyacencia[columna-1][fila-1]==true)
		   return true;
	 return false;
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

		m.mostar();
	}
	
}
