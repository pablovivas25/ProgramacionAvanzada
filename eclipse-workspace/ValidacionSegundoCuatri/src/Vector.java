 import java.util.Arrays;

public class Vector  {
	private int vec[];
	
	public Vector(int vect[]) {
		this.vec=vect;
	}
	public void resolver(int M){
		int aux;
		//int cont=M-1;
		if(M>=this.vec.length)
			throw new MmenorN("ERROR M TIENE QUE SER MENOR A N");
		
			for(int i=0;i<M;i++) {
			 aux=this.vec[0];
			 int j;
			 for(j=0;j<this.vec.length-1;j++) {
				 this.vec[j]=this.vec[j+1];
			 }
				this.vec[j]=aux; 
			/// System.out.println(j);
			 
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Vector [vec=" + Arrays.toString(vec) + "]";
	}
	public static void main(String[] args) {
		int vec[]= {0,1,2,3,4,5};
		Vector v= new Vector(vec);
		v.resolver(4);
		System.out.println(v.toString());
		

	}

}
