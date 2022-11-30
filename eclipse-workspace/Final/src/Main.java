
public class Main {

	public static void main(String[] args) {
		int mat[][]= {{1,2,3},{0,15,0},{1,3,100}};
		int dim=3;
		int acumAnt=0;
		int aux=0;
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
					
					if(i==j &&(i!=0 && j!=0)) {
						///System.out.println(acumAnt);
						if(acumAnt>mat[i][j]) {
							acumAnt+=mat[i][j];
							aux=1;
							System.out.println(acumAnt);
						}
							
					}else {
						acumAnt+=mat[i][j];
					}
					System.out.println(acumAnt);
			}
		}
		if(aux==1)
			System.out.println("False");
		else
			System.out.println("TRUE");

	}

}
