package paqueteVector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matriz {
	private double mat[][];
	private int columna;
	private int fila;
	
	public Matriz(String path) throws FileNotFoundException {
		Scanner entrada=new Scanner(new File(path));
		this.fila=entrada.nextInt();
		this.columna=entrada.nextInt();
		this.mat=new double[this.fila][this.columna];
		
		for(int i=0;i<this.fila;i++)
			for(int j=0;j<this.columna;j++)
				this.mat[i][j]=entrada.nextDouble();
		
		entrada.close();
	}
	
	public Matriz(int fila,int columna) {
		this.fila=fila;
		this.columna=columna;
		
		for(int i=0;i<this.fila;i++)
			for(int j=0;j<this.columna;j++)
				this.mat[i][j]=0;
	}
	
	public Matriz sumar(Matriz v2) throws DistDimException{
		
		if(this.fila*this.columna!=v2.fila*v2.columna)
			throw new  DistDimException("Distinta dimension");
		
		Matriz sum=new Matriz(this.fila,this.columna);
		
		for(int i=0;i<this.fila;i++)
			for(int j=0;j<this.columna;j++)
				this.mat[i][j]=this.mat[i][j]+v2.mat[i][j];
		
		return sum;
	}
	
	public Matriz resta(Matriz v2) throws DistDimException{
		if(this.fila*this.columna!=v2.fila*v2.columna)
			throw new DistDimException("Distinta Dimension");
		Matriz rest=new Matriz(this.fila,this.columna);
		
		for(int i=0;i<this.fila;i++)
			for(int j=0;j<this.columna;j++)
				rest.mat[i][j]=this.mat[i][j]-v2.mat[i][j];
		
		return rest;
	}
	public Matriz prod(double num) {
		
		Matriz prod=new Matriz(this.fila,this.columna);
		
		for(int i=0;i<this.fila;i++)
			for(int j=0;j<this.columna;j++)
				prod.mat[i][j]=this.mat[i][j]*=num;
		///return this;
		return prod;
	}
	public Matriz prod(Vector v2) throws DistDimException{
		if(this.columna!=v2.getDimension())
			throw new DistDimException("Distinta dimension");
		Matriz prod=new Matriz(this.fila,this.columna);
		
		for(int i=0;i<this.fila;i++)
			for(int j=0;j<this.columna;j++)
				prod.mat[i][j]+=this.mat[i][j]*v2.getCoordenada(j);
		return prod;
		
	}
}
