package alpahabetagammav2;

public class Beta extends Alpha {
	public void foo() {
		System.out.print("Bfoo ");
	}

	public static void main(String[] args) {
		Alpha a = new Beta();
		Beta b = (Beta)a;
		a.foo();
		b.foo();
		
	/*
		Alpha a1=new Alpha();
		a1.foo();
		Beta b1=(Beta)a1;///ERROR 
		b1.foo();
		*/
	}
}
