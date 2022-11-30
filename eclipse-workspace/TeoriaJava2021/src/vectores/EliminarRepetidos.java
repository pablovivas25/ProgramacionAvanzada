package vectores;

import java.util.ArrayList;

public class EliminarRepetidos {
	
	private String[] vect;
	private ArrayList<String> visitados;
	
	public EliminarRepetidos(String [] vect) {
		this.vect=vect;
		this.visitados=new ArrayList<String>();
	}
	public String[] resolver() {
		String [] aux=new String[2];
		visitados.add(vect[0]);
		int j=0;
		aux[j]=vect[0];
		j++;
		for(int i=1;i<vect.length;i++) {
			if(this.visitados.contains(vect[i])==false) {
				aux[j]=vect[i];
				visitados.add(vect[i]);
				j++;
			}
				
		}
		return aux;
	}
	public static void main(String[] args) {
		String vec[]= {"hola","hola","hola","pablo","pablo","pablo","pablo","hola","hola"};
		
		EliminarRepetidos r=new EliminarRepetidos(vec);
		for(String res:r.resolver())
			System.out.println(res);
	}
}
