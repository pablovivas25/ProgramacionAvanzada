
public class Entrenamiento01 {
	private int N[];
	private int T;
	private int K;
	
	public Entrenamiento01(int vec[],int t,int k) {
		this.N=vec;
		this.T=t;
		this.K=k;
		
	}
	/*
	 Dado un conjunto de N números cualesquiera, un número T y
	  un entero K, ¿cuán rápido puede usted determinar
	  si existe un subconjunto de K elementos cuya suma es, 
	  a lo sumo, T?
	 */
	public boolean resolver() {
		int suma=0;
		int inicio=0;
		int posicionIni=inicio;
		int fin=inicio+this.K-1;
		int cont=0;
		long tiempoInicio,tiempoFin;
		tiempoInicio=System.nanoTime();
		
		///DEBERIA DE CONTEMPLAR QUE K no sea menor a 1
		if(this.K<1)
			throw new RuntimeException("EL K DEBE SER MAYOR A CERO");
		while(inicio<=fin && fin<this.N.length) {
			suma+=this.N[inicio];
			
		if(cont==this.K-1) {
				if(suma>=this.T) {
					tiempoFin=System.nanoTime();
					System.out.println("Duracion "+(tiempoFin-tiempoInicio)/1e6+"ms"+" "+"en encontrar la solucion");
					return true;
				}else {
					posicionIni++;
					inicio=posicionIni;
					fin=posicionIni+this.K-1;
					suma=0;
					cont=0;
			    }
		  }
			inicio++;
			cont++;
		
	}
		return false;
	}
	
	public static void main(String[] args) {
		int n[]= {5,1,-1,0,3,4,7};
		int t=3;
		int k=0;
		try {
			Entrenamiento01 e1=new Entrenamiento01(n,t,k);
			System.out.println(e1.resolver());
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
