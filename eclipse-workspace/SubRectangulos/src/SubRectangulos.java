
public class SubRectangulos {
	private int mat[][];
	private int PD[][];
	private int fila;
	private int columna;
	
	public SubRectangulos(int mat[][],int f,int c) {
		this.mat=mat;
		this.fila=f;
		this.columna=c;
		this.PD=new int[this.fila][this.columna];
	}
	public SubRectangulos(int f,int c) {
		this.fila=f;
		this.columna=c;
		this.mat=new int[this.fila][this.columna];
		for(int i=0;i<this.fila;i++)
			for(int j=0;j<this.columna;j++)
				this.mat[i][j]=0;
	}
	public void mostar() {
		for(int i=0;i<this.fila;i++) {
			for(int j=0;j<this.columna;j++) {
				///System.out.print("|"+this.mat[i][j]+"|"+ " ");
				System.out.printf("%4d|",this.mat[i][j]);
			
			}
			System.out.println();
			System.out.println("----------------------------------");
		}
   }
	public int generarPD() {
		int maximo=Integer.MIN_VALUE;
		int resultado,x=0,y=0;
		Coordenadas c;
		
		for(int i=0;i<this.fila;i++) {
			for(int j=0;j<this.columna;j++) {
				if(i==0 && j==0) {
					resultado=this.PD[i][j]=this.mat[i][j];
					if(resultado>maximo) {
						maximo=resultado;
						x=i;
						y=j;
						c=new Coordenadas(i,j);
					}
						
				}
					
				else if(i==0 && j!=0) {
					resultado=this.PD[i][j]=this.mat[i][j]+this.PD[i][j-1];
					if(resultado>maximo) {
						maximo=resultado;
						x=i;
						y=j;
						c=new Coordenadas(i,j);
					}
				}
					
				else if(i!=0 && j==0) {
					resultado=this.PD[i][j]=this.mat[i][j]+this.PD[i-1][j];
					if(resultado>maximo) {
						maximo=resultado;
						x=i;
						y=j;
						c=new Coordenadas(i,j);
					}
				}
				
				else if(i!=0 && j!=0) {
					resultado=this.PD[i][j]=this.PD[i-1][j]+this.PD[i][j-1]-this.PD[i-1][j-1]+this.mat[i][j];
					
					if(resultado>maximo) {
						maximo=resultado;
						x=i;
						y=j;
						c=new Coordenadas(i,j);
					}
				}
					
			}
		}
		
		///System.out.println("EL MAXIMO ES "+maximo);
		System.out.println("Coordenadas del subrectangulo MAYOR "+"("+x+","+y+")");
		return maximo;
		/*
		 int resultado=this.PD[f][c]-this.PD[f][j-1]-PD[i-1][c]+PD[i-1][j-1];
						if(maximo<resultado)
							maximo=resultado;

		 */
			
	}
	public void mostrarPD() {
		for(int i=0;i<this.fila;i++) {
			for(int j=0;j<this.columna;j++) {
				///System.out.print("|"+this.mat[i][j]+"|"+ " ");
				System.out.printf("%4d|",this.PD[i][j]);
			
			}
			System.out.println();
			System.out.println("----------------------------------");
		}
	}
		
	public static void main(String[] args) {
		int matriz[][]= {{-5,3,5,8,2,1,-4},{3,-8,-10,2,-2,5,4},{1,8,3,-6,0,9,3},{12,7,1,-4,-9,5,-6},{-15,8,-12,6,3,-10,3}};
		SubRectangulos sr=new SubRectangulos(matriz,5,7);
		sr.mostar();
		System.out.println();
		System.out.println("EL MAXIMO ES "+sr.generarPD());
		sr.mostrarPD();
		

	}

}
