
public class ComprobarMultiplicacion {
	private int mat[][];
	private int fila;
	private int columna;
	
	public ComprobarMultiplicacion(int mat[][],int fila,int columna) {
		this.mat=mat;
		this.fila=fila;
		this.columna=columna;
	}
	public boolean comprobarElementosMatrizNulo() {
		for(int i=0;i<fila;i++)
			for(int j=0;j<columna;j++) {
				if(this.mat[i][j]==0)
					return true;
			}
		return false;
	}
	public static void main(String[] args) {
		int mat1[][]= {{1,1,1},{2,8,3},{10,5,0}};
		int mat2[][]= {{1,1,1},{2,8,3},{10,5,1}};
		int mat3[][]= {{0,1,1},{2,8,3},{10,5,0}};
		int mat4[][]= {{1,1,1},{2,8,0},{10,5,2}};
		
		ComprobarMultiplicacion c1=new ComprobarMultiplicacion(mat4,3,3);
		System.out.println(c1.comprobarElementosMatrizNulo());

	}

}
