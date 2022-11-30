package vectores;

public class SumaAnteriores {
	
	private int[] vec;
	
	public SumaAnteriores(int [] vec) {
		this.vec=vec;
	}
	public int [] vectSumaAnterior() {
		int resultado[]=new int[this.vec.length];
		int suma=0;
	
		for(int i=0;i<this.vec.length;i++) {
			
			if(i!=0) {
				suma+=this.vec[i-1];
				
				resultado[i]=suma;
			}else
				resultado[i]=suma;
			
			
		
			
		}
		
		return resultado;
	}
	public static void main(String[] args) {
		int vec[]= {1,2,3,4,5};
		
		SumaAnteriores s=new SumaAnteriores(vec);
		
		for(Integer i:s.vectSumaAnterior())
			System.out.println(i);
		
	}

}
