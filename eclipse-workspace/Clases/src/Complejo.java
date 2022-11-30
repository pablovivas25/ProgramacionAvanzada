
public class Complejo {
	private double real;
	private double imaginaria;
	
	public Complejo(double r,double imag) {
		this.real=r;
		this.imaginaria=imag;
	}
	public Complejo suma(Complejo c) {
		return new Complejo(this.real+c.real,this.imaginaria+c.imaginaria);
	}
	
	@Override
	public String toString() {
		return "Complejo [real=" + real + ", imaginaria=" + imaginaria + "]";
	}

	public static void main(String[] args) {
		Complejo c1=new Complejo(3,2);
		System.out.println(c1);

	}

}
