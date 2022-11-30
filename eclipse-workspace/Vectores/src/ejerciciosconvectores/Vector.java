package ejerciciosconvectores;

import java.util.Arrays;

public class Vector {
	private int []vec;
	private int dim;
	
	
	public Vector(int dimension) {
		this.dim=dimension;
		
		for(int i=0;i<this.dim;i++) {
			this.vec[i]=0;
		}
	}
	
	public Vector(int []vector ,int dimension) {
		this.vec=vector;
		this.dim=dimension;
	}
	
	public int sumarElementosCCN() {
		int suma=0;
		for(int i=0;i<this.dim;i++)
			suma+=this.vec[i];
		return suma;
	}
	public int sumarElementosRecursivos(int dim) {
		///int suma=0;
		
		if(dim==0)
			return this.vec[dim];
		else
			return this.vec[dim]+sumarElementosRecursivos(dim-1);
		
		
		
	}
	public float calcularMedia() {
		int suma = 0;
		
		for(int i=0;i<this.dim;i++) {
			suma += this.vec[i];
		}
		return (float)suma/this.dim;
	}
	public void mostrarElementosSuperiorAMedia() {
		float media =calcularMedia();
		
		for(int i=0;i<this.dim;i++) {
			if(this.vec[i]>media)
				System.out.println(this.vec[i]);
		}
	}
	public float calcularMediaPosicionPar() {
		int suma = 0;
		
		for(int i=0;i<this.dim;i++) {
			if (i % 2== 0)
				suma+= this.vec[i];
		}
		return (float) suma /this.dim;
	}
	
	public float calcularMediaPosicionImpar() {
		int suma= 0;
		
		for(int i=0;i<this.dim;i++) {
			if (i % 2 != 0)
				suma+=this.vec[i];
		}
		return (float)suma/this.dim;
	}
	public int[] invertirVectorAux() {
		int veca[]= new int[this.dim];
		int aux;
		int tamanio=this.dim;
		for(int i=0;i<this.dim/2;i++) {
			aux=this.vec[i];
			veca[i]=this.vec[tamanio-i-1];
			veca[tamanio-i-1]=aux;
		}
		return veca;
			
	}
	public void invertirVector() {
		int aux;
		for(int i=0;i<this.dim/2;i++) {
			aux=this.vec[i];
			this.vec[i]=this.vec[this.dim-i-1];
			this.vec[this.dim-i-1]=aux;
		}
	}
	public void invertirXNumeros(int hasta) {
		int aux;
		for(int i=0;i<hasta;i++) {
			aux=this.vec[i];
			this.vec[i]=this.vec[this.dim-i-1];
			this.vec[this.dim-i-1]=aux;
		} 
	}
	@Override
	public String toString() {
		return "Vector [vec=" + Arrays.toString(vec) + ", dim=" + dim + "]";
	}

	public static void main(String [] args) {
		int vec2 [] = {1,2,3,4,5,6,7,8,9,10};
		Vector vec1 = new Vector (vec2,10);
		System.out.println(vec1.sumarElementosCCN());
		System.out.println(vec1.sumarElementosRecursivos(9));
		/*
		System.out.println(vec1.toString());
		System.out.println("---MOSTRANDO LA MEDIA----");
		System.out.println(vec1.calcularMedia());
		System.out.println("---MOSTRANDO LA MEDIA DE PAR-----");
		System.out.println(vec1.calcularMediaPosicionPar());
		System.out.println("----MOSTRANDO LA MEDIA DE IMPAR----");
		System.out.println(vec1.calcularMediaPosicionImpar());
		System.out.println("----ELEMENTOS MAYOR A LA MEDIA-----");
		vec1.mostrarElementosSuperiorAMedia();
		System.out.println("---MOSTRANDO VECTOR INVERTIDO------");
		int vecaux[]= vec1.invertirVectorAux();
		for (int i=0;i<10;i++) {
			System.out.println(vecaux[i]);
		}
		///System.out.println(vec1.toString());
		System.out.println("----Mostrando vector invertido-----");
		vec1.invertirVector();
		System.out.println(vec1.toString());
		System.out.println("---MOSTRANDO VECTOR INVERTIDO X CANTIDAD----");
		vec1.invertirXNumeros(3);
		System.out.println(vec1.toString());
		*/
	}
	
}
