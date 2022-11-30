
public class ComprobarDiagonal {
	private int mat[][];
	private int fila;
	private int columna;
	
	public ComprobarDiagonal(int mat[][],int fil,int col) {
		this.mat=mat;
		this.fila=fil;
		this.columna=col;
	}
	
	public boolean comprobarDiagonal() {
		int sumaAnterior=this.mat[0][0];
		
		for(int i=1;i<this.fila;i++) {
			if(this.mat[i][i]==sumaAnterior)
					sumaAnterior+=this.mat[i][i];
			else
				return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		
		int mat1[][]= {{1,2,3},{4,1,6},{7,8,2}};
		int mat2[][]= {{1,2,3},{4,2,6},{7,8,2}};
		int mat3[][]= {{16,2,3},{4,16,6},{7,8,32}};
		int mat4[][]= {{0,2,3},{4,0,6},{7,8,1}};
		int mat5[][]= {{0,2,3},{4,0,6},{7,8,0}};
	
		ComprobarDiagonal c1=new ComprobarDiagonal(mat5,3,3);
		System.out.println(c1.comprobarDiagonal());
		

	}

}
