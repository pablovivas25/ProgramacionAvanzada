package matrices;

public class Matriz {
	
	private double [][]mat;
	
	public void recorrerPorColumna() {
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
	}
	public void recorrerPorFila() {
		for (int i = 0; i < mat.length; i++) {
		
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	public double mayorValorRecorriendoPorColumna() {
		double mayor=mat[0][0];
		
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[j][i]>mayor)
					mayor=mat[j][i];
			}
		
		}
		return mayor;
	}
	/*
	 * int row = test.length;
        int col = test[0].length;
	 * 
	 */
	public double mayorValorRecorriendoPorFila() {
		double mayor=mat[0][0];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(mat[i][j]>mayor)
					mayor=mat[i][j];
			}
		
		}
		return mayor;
	}
	public double promedioRecorriendoPorfila() {
		int cont=0;
		double prom=0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				prom+=mat[i][j];
				cont++;
			}
		
		}
		return prom/cont;
		
	}
	public double promedioRecorriendoPorColumna() {
		int cont=0;
		double prom=0;
		
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				prom+=mat[j][i];
				cont++;
			}
		
		}
		return prom/cont;
		
	}
	
	public int ocurrenciasMayorPorFila(double mayor) {
		int cont=0;
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(mayor==mat[i][j])
					cont++;
			}
		
		}
		return cont;
		
	}
	
	public int ocurrenciasMayorPorColumna(double mayor) {
		int cont=0;
		
		
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mayor==mat[j][i])
					cont++;
			}
		
		}
		return cont;
		
	}
	public Matriz(double [][] matriz) {
		this.mat=matriz;
	}
	public double calcularPromedio(double[][] matriz) {
		int j=0,i=0;
		int promedio=0;
		int cant=0;
		
		
		while(i<matriz.length) {
			promedio+=matriz[i][j];
			cant++;
			if(j==matriz[0].length-1) {
				i++;
				j=0;
			}else {
				j++;
			}
		}
		return (double)promedio/cant;
	}
	public double algotirmo(double[][]matriz) {
		int j=0,i=0;
		double sumatoria=0;
		
		double promedio=this.calcularPromedio(matriz);
		
		
		while(i<matriz.length) {
			if(matriz[i][j]<promedio)
				sumatoria+=matriz[i][j];
			
			if(j==matriz[0].length-1) {
				i++;
				j=0;
			}else {
				j++;
			}
		}
		return sumatoria;
	}
	public static void main(String[] args) {
		double [][] numeros = {{1,3,5},{2, 2, 3}, {4,0,2}, {9,5,2}};
		
		Matriz m=new Matriz(numeros);
		System.out.println("Promedio "+m.calcularPromedio(numeros));
		System.out.println(m.algotirmo(numeros));
	}
	


}
