
public class Pico {
	private int vec[];
	
	public Pico(int vect[]) {
		this.vec=vect;
	}
	
	public int  picoVectorN() {
		if(this.vec.length<3)
			return -1;
		for(int i=0;i<this.vec.length;i++) {
			if(this.vec[i]<this.vec[i+1] && this.vec[i+1]>this.vec[i+2])
				return i+1;
		}
			return -1;
		}
	public int picoVectorLog() {
		if(this.vec.length<3)
			return -1;
		
		int inicio=0;
		int fin = this.vec.length-1;
		//System.out.println(inicio+fin/2);
		int medio;
		
		while(inicio<=fin) {
			medio=(inicio+fin)/2;
			if(this.vec[medio]<this.vec[medio+1])
				inicio=medio+1;
			else
				fin=medio-1;
			if(this.vec[medio]> this.vec[medio-1] && this.vec[medio]>this.vec[medio+1]) {
				return medio;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int vec[]= {-2,-1,0,-1,-2};
		Pico p=new Pico(vec);
		System.out.println(p.picoVectorN());
		System.out.println("-----LOGN-------");
		System.out.println(p.picoVectorLog());
		

	}

}
