package finalprograAvanzada;

public class Serie {
	private static Long [] vec;
	///private int n;
	
	public Serie() {
		this.vec=new Long [100000000];
	}
	
	public long devolverSerie(int n) {
		this.vec[0]=this.vec[1]=0L;
		this.vec[2]=1L;
		
		if(this.vec[n]==null)
		  this.vec[n]=devolverSerie(n-1)+ this.vec[n-2]+ this.vec[n-3];
		return this.vec[n];
		    
	}
	public static void main(String[] args) {
		Serie s=new Serie();
		System.out.println(s.devolverSerie(70));
		
		Serie s1=new Serie();
		System.out.println(s1.devolverSerie(72));

	}

}
