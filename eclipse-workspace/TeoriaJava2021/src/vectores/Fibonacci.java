package vectores;

public class Fibonacci {
	private static Long [] vec; 
	
	public Fibonacci() {
		this.vec=new Long [100000000];
	}
	
	public Long resolverFibonacciV2(int n) {
		this.vec[0]=0L;
		this.vec[1]=0L;
		this.vec[2]=1L;
		
		if(this.vec[n]==null)
			this.vec[n]=this.resolverFibonacciV2(n-1)+ this.vec[n-2] +this.vec[n-3];
		return this.vec[n];
	}
	
	
	public static Long[] getVec() {
		return vec;
	}

	public static void setVec(Long[] vec) {
		Fibonacci.vec = vec;
	}

	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		System.out.println(f.resolverFibonacciV2(8));
	}
}
