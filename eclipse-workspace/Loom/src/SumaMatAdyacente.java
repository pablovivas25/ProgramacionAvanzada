
public class SumaMatAdyacente {
	private int [][]mat;
	private int fila;
	private int columna;
	
	public SumaMatAdyacente(int mat[][],int fil,int col) {
		this.mat=mat;
		this.fila=fil;
		this.columna=col;
	}
	
	public boolean tieneIzq(int indice) {
		return (indice-1)>=0?true:false;
	}
	public boolean tieneDer(int indice) {
		return (indice+1)<this.columna?true:false;
	}
	public boolean tieneAbajo(int indice) {
		return (indice+1)<this.fila?true:false;
	}
	public boolean tieneArriba(int indice) {
		return (indice-1)>=0?true:false;
	}
	public int[] devolverAdyacentes(int y,int x) {
		int [] vec= new int[4];
		
		if(tieneDer(y))
			vec[0]=this.mat[x][y+1];
		else
			vec[0]=0;
		
		if(tieneIzq(y))
			vec[1]=this.mat[x][y-1];
		else
			vec[1]=0;
		
		if(tieneArriba(x))
			vec[2]=this.mat[x-1][y];
		else
			vec[2]=0;
		
		if(tieneAbajo(x))
			vec[3]=this.mat[x+1][y];
		else
			vec[3]=0;
		
		
		return vec;
	}
	public int[][] sumaElementosAdyacentesMatriz(){
		int suma[][]=new int[this.fila][this.columna];
		int []adyacentes=new int[4];
		
		for(int i=0;i<this.fila;i++)
			for(int j=0;j<this.columna;j++) {
				adyacentes=devolverAdyacentes(j,i);
				suma[i][j]+=this.mat[i][j]+adyacentes[0]+adyacentes[1]+adyacentes[2]+adyacentes[3];
			}
		return suma;
	}
	public void mostar() {
		for(int i=0;i<this.fila;i++) {
			for(int j=0;j<this.columna;j++) {
				System.out.print(this.mat[i][j]+ " ");
			
		}
			System.out.println();
	}	
	}
	public static void main(String[] args) {
		int mat[][]= {{8,2,-3,4},{5,-6,-6,20},{21,1,-5,0}};
		int mat1[][]= {{-1,-1,-1,-2},{-2,-6,3,20},{21,4,-5,10}};
		int mat2[][]= {{-1,-1,-1,-2}};
		int mat3[][]= {{-1,-1,-1,-2},{3,4,5,6}};
		SumaMatAdyacente s1=new SumaMatAdyacente(mat3,2,4);
		mat=s1.sumaElementosAdyacentesMatriz();
		

		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(mat[i][j]+ " ");
			
		}
			System.out.println();
	}	

	}

}
