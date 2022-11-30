
public class Test {
	double algoritmo(double[][] matriz) {
		double mayor=Double.MIN_VALUE;
		int cantRepeticiones=0;
		int i = 0, j = 0;
        while (i < matriz.length) {
 
            System.out.println(matriz[i][j]);
 
            if(i%2==0) {
            	if(matriz[i][j]>mayor) {
            		mayor=matriz[i][j];
            		cantRepeticiones++;
            	}
            }
            i++;
            j++;
 
        }
        /*
		for(int i=0;i<matriz.length;i++) {
			if(i%2==0) {
				if(matriz[i][i]>mayor) {
					System.out.println(matriz[i][i]);
					mayor=matriz[i][i];
					cantRepeticiones++;
				}
			}
		}
		*/
		return cantRepeticiones;
		
	}
	public static void main(String[] args) {
		Test r=new Test();
		double mat[][]= {{2,4,4},{6,6,9},{8,10,12}};
		System.out.println(r.algoritmo(mat));
		
	}
}
