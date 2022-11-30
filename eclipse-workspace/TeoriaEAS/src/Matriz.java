
public class Matriz {
	
	public void recorrerTodoElementos(double [][]mat) { 
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public void recorrerFilasPares(double [][]mat) {
		for(int i=0;i<mat.length;i+=2) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public void recorrerFilasImpares(double [][]mat) {
		for(int i=1;i<mat.length;i+=2) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public void recorrerIterandoFilas(double [][]mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public void recorrerIterandoColumnas(double [][] mat) {
		for(int j=0;j<mat[0].length;j++) {
			for(int i=0;i<mat.length;i++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public void recorrerSoloBucle(double [][] mat) {
		int fila=mat.length;
		int i=0;
		System.out.println("fila "+fila);
		System.out.println();
		int j=0;
		while(i<mat.length) {
			
			System.out.print(mat[i][j]+ " ");
			j++;
			if(j==mat[0].length) {
				j=0;
				i++;
				System.out.println();
			}
				
		}
		
	}
	public double algoritmo(double [][] mat) {
		
		return 0.0;
	}
	public static void main(String[] args) {
		double [][] mat= {{1,2,3},{65,4,10},{100,10,5},{4,13,43}};
		System.out.println(mat[0].length);
		Matriz m=new Matriz();
		m.recorrerIterandoFilas(mat);
		
	}
}
