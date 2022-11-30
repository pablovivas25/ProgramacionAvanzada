
public class Factorial {
	private double vec[];
	
	public Factorial() {
		this.vec=new double[100000000];
	}
	
	
	public double calcularFactorial(int n) {
		this.vec[0]=this.vec[1]=1;
		for(int i=2;i<=n;i++)
			this.vec[i]=i*this.vec[i-1];
		return this.vec[n];
	}
	public static void main(String[] args) {

		Factorial f=new Factorial();
		System.out.println(f.calcularFactorial(25));
	}

}
