package repasoV3;

public class Beta extends Alpha{
public void foo() { System.out.print("Bfoo "); } 	
	
	public static void main(String[] args) { 	
		Alpha a = new Beta(); 
		Beta b = (Beta)a; 
		a.foo(); 
		b.foo(); 
	} 	
}
