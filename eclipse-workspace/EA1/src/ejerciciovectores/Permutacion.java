package ejerciciovectores;

import java.util.Arrays;

public class Permutacion {
	private int vec[];
	private int dimension;
	
	public Permutacion(int vect[],int n) {
		this.vec=vect;
		this.dimension=n;
	}
	
	public Permutacion(int vect[]) {
		this.dimension=vect.length;
		this.vec=vect;
	}
	
	public boolean esPermutacion() {
		Arrays.sort(this.vec);
		for(int i=0;i<this.dimension;i++) {
				if(this.vec[i+1]-this.vec[i]!=1)
					return false;
			}
			
		return true;
	}
	
	@Override
	public String toString() {
		return "Permutacion [vec=" + Arrays.toString(vec) + ", dimension=" + dimension + "]";
	}

	public static void main(String[] args) {
		
		int vec[]= {1,1,1,1};
		Permutacion p = new Permutacion(vec);
		///System.out.println(p.toString());
		System.out.println(p.esPermutacion());
	}

}
