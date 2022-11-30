package mygrafo;

public class MatrizAdyacenciaNoDirigido {
	private boolean [][] mat;
	private int orden;
	
	public MatrizAdyacenciaNoDirigido(int n) {
		this.mat=new boolean[n][n];
		this.orden=n;
		this.inicializarMatrizAdyacencia();
	}
	public void inicializarMatrizAdyacencia() {
		for(int i=0;i<this.orden;i++)
			for(int j=0;j<this.orden;j++) {
				this.mat[i][j]=false;
				this.mat[j][i]=false;
			}
	}
	public void ponerArista(int fila,int columna) {
		this.mat[fila-1][columna-1]=true;
		this.mat[columna-1][fila-1]=true;
	
	}
	public void mostar() {
		for(int i=0;i<this.orden;i++) {
			for(int j=0;j<this.orden;j++) {
				if (this.mat[i][j])
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
		
	}
	public boolean hayArista(int fila,int columna) {
	 if(this.mat[fila][columna]==true)
		 return true;
	 else if(this.mat[columna][fila]==true)
		   return true;
	 return false;
	}
}
