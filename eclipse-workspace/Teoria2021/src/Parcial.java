public class Resolucion {
	double algoritmo(double[][] matriz) {
		double mayor=Integer.MIN_VALUE;
		int cantRepeticiones=0;
		
		for(int i=0;i<matriz.length;i++) {
			if(i %2==0) {
				if(matriz[i][i]>mayor) {
					mayor=matriz[i][i];
					cantRepeticiones++;
				}
			}
		}
		return cantRepeticiones;
	}
	public static void main(String[] args) {
		Resolucion r=new Resolucion();
		double mat[][]= {{2,4,4},{6,6,9},{8,10,12}};
		System.out.println(r.algoritmo(mat));
		
	}
}
