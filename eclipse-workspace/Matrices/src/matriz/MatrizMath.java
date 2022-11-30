package matriz;

import java.util.Arrays;

public class MatrizMath {
	private int [][] mat;
	private int fila;
	private int columna;
	
	
	public MatrizMath(int [][]matriz,int fil,int colum) {
		this.mat=matriz;
		this.fila=fil;
		this.columna=colum;
	}
	
	public MatrizMath(int fil,int colum) {
		this.fila=fil;
		this.columna=colum;
		this.mat=new int[this.fila][this.columna];
		for(int i=0;i<this.fila;i++) {
			for(int j=0;j<this.columna;j++)
				this.mat[i][j]=0;
		}
			
	}
	public MatrizMath sumarMatrices(MatrizMath mt ) {
		
		
		if (mt.columna!=this.columna || mt.fila!=this.fila)
			throw new DistDimException("Distinta dimension");
		MatrizMath aux=new MatrizMath(mt.fila,mt.columna);
			for(int i=0;i<this.fila;i++) {
				for(int j=0;j<this.columna;j++)
					aux.mat[i][j]= this.mat[i][j]+mt.mat[i][j];
			}
				
		return aux;
	}
public MatrizMath restarMatrices(MatrizMath mt ) {
		
		
		if (mt.columna!=this.columna || mt.fila!=this.fila)
			return null;
		MatrizMath aux=new MatrizMath(this.fila,this.columna);
			for(int i=0;i<this.fila;i++)
				for(int j=0;j<this.columna;j++)
					aux.mat[i][j]= this.mat[i][j]-mt.mat[i][j];
		return aux;
	}

public MatrizMath productoMatrices(MatrizMath mt) {
	if(this.columna!=mt.fila)
		return null;
	MatrizMath aux=new MatrizMath(this.fila,mt.columna);
	
	for(int i=0;i<this.fila;i++)
		for(int j=0;j<mt.columna;j++)
			for(int k=0;k<this.fila;k++)
				aux.mat[i][j]+=this.mat[i][k]*mt.mat[k][j];
	return aux;
}


public void mostar() {
	for(int i=0;i<this.fila;i++) {
		for(int j=0;j<this.columna;j++) {
			System.out.print(this.mat[i][j]+ " ");
		
	}
		System.out.println();
}	
}

public MatrizMath productoEscalar(int escalar) {
	MatrizMath aux= new MatrizMath(this.fila,this.columna);
	
	for(int i=0;i<aux.fila;i++)
		for(int j=0;j<aux.columna;j++)
			aux.mat[i][j]=this.mat[i][j]*escalar;
				
	return aux;
}

public int sumaElementosDiagonal() {
	int suma=0;
	if(this.fila!=this.columna)
		throw new DistDimException("Distinta dimension");
	for(int i=0;i<this.fila;i++)
		suma+=this.mat[i][i];
	return suma;
}
public void mostrarElementosSuperioresAlaSumaDiagonal() {
	boolean noHayElementosSuperiores=true;
	int sumaDiagonal=sumaElementosDiagonal();
	
	for(int i=0;i<this.fila;i++) 
	  for(int j=0;j<this.columna;j++) {
		  if(this.mat[i][j]>sumaDiagonal) {
			  System.out.println(this.mat[i][j]);
			  noHayElementosSuperiores=false;
		  }
	}
	if(noHayElementosSuperiores==true)
		System.out.println("-----NO HAY ELEMENTOS SUPERIORES A ESE NUMERO-----");
}
public static void main(String[]args) {
	int m1[][]= {{1,2},{-2,-1}};
	int m3[][]= {{1,3},{-4,0}};
	int m2[][]= {{1,0,2},{0,2,0}};
	MatrizMath mat1=new MatrizMath(m1,2,2);
	MatrizMath mat2= new MatrizMath(m2,2,3);
	MatrizMath mat3=new MatrizMath(m3,2,2);
	System.out.println("------MATRIZ MAT1-----");
	mat1.mostar();
	System.out.println("------MATRIZ MAT2-------");
	mat2.mostar();
	System.out.println("-----MATRIZ MAT3--------");
	mat3.mostar();
	MatrizMath suma = mat1.sumarMatrices(mat3);
	System.out.println("------MATRIZ SUMA-----");
	suma.mostar();
	MatrizMath prod=mat1.productoMatrices(mat2);
	System.out.println("------MATRIZ PRODUCTO-----");
	prod.mostar();
	MatrizMath prodEscalar= mat1.productoEscalar(2);
	System.out.println("-----MOSTRANDO PROD POR 2-----");
	prodEscalar.mostar();
	int sumaDiagonal=mat1.sumaElementosDiagonal();
	System.out.println("-----SUMA DE ELEMENTOS DIAGONAL-----");
	System.out.println(sumaDiagonal);
	System.out.println("-----MOSTRANDO ELEMENTOS SUPERIORES A LA SUMA DE LA DIAGONAL------");
	suma.mostrarElementosSuperioresAlaSumaDiagonal();
}
}
