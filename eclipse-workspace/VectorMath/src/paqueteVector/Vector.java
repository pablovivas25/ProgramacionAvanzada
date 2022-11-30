package paqueteVector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Vector {
	private int dimension;
	private double[]vect;
	
	public Vector(String path) throws FileNotFoundException {
		Scanner entrada=new Scanner(new File(path));
		this.dimension=entrada.nextInt();
		this.vect=new double[this.dimension];
		
		for(int i=0;i<this.dimension;i++) {
			this.vect[i]=entrada.nextInt();
		}
		entrada.close();
	}
	
	public Vector(int dimension) {
		this.dimension=dimension;
		
		
		for(int i=0;i<this.dimension;i++) {
			this.vect[i]=0;
		}
	}
	
	public double getCoordenada(int i) {
		return this.vect[i];
	}

	public int getDimension() {
		return this.dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public double[] getVect() {
		return vect;
	}

	public void setVect(double[] vect) {
		this.vect = vect;
	}

	public Vector sumar(Vector v2) throws DistDimException{
		if(this.dimension!=v2.dimension)
			throw new DistDimException(" Distinta Dimension ");
		
		//Vector aux=new Vector(v2.getDimension());
		
		for(int i=0;i<v2.getDimension();i++) {
			//aux.vect[i]=this.vect[i]+v2.vect[i];
			this.vect[i]=this.vect[i]+v2.vect[i];
		}
		return this;
		///return aux;
		
	}
	public Vector restar(Vector v2) throws DistDimException {
		if(this.dimension!=v2.dimension)
			throw new DistDimException(" Distinta Dimension ");
		
		Vector resta=new Vector(this.dimension);
		
		for(int i=0;i<this.dimension;i++) {
			resta.vect[i]=this.vect[i]+v2.vect[i];
		}
		return resta; 
	}
	
	
	@Override
	public String toString() {
		return "Vector [dimension=" + dimension + ", vect=" + Arrays.toString(vect) + "]";
	}

	public Vector producto(Vector v2) throws DistDimException {
		
		if(this.dimension!=v2.dimension)
			throw new DistDimException(" Distinta Dimension ");
		Vector prod=new Vector(this.dimension);
		
		for(int i=0;i<this.dimension;i++) {
			prod.vect[i]=this.vect[i]*v2.vect[i];
		}
		
		return prod;
	}
	public Vector producto(float numero) {
		Vector prod=new Vector(this.dimension);
		
		for(int i=0;i<this.dimension;i++) {
			prod.vect[i]=(int)(this.vect[i]*numero);
		}
		return prod;
	}
}
