package paquete;

public class Child extends Parent{
	
	public Child() {
		this(123,4);
		System.out.println("C");
	}
	
	public Child(int x,int y) {
		super(x);
		System.out.println("D"); 
	}
	/*
	public Child(int x) {
		super(x);
		System.out.println("B");
		
	}
	*/
	public static void main(String[] args) {
		
		
		Child c=new Child();
	}
}
