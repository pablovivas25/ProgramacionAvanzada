package paquete;

public class Main {
	public static void main(String[] args) {
		ClassA p0 = new ClassA(); 				
		ClassB p1 = new ClassB(); 				
		ClassC p2 = new ClassC(); 				
		ClassA p3 = new ClassB(); 				
		ClassA p4 = new ClassC(); 
		
		p0 = p1; 	// asignacion polimorfica			
		p1 = p2; 	// no es valida			
		p2 = p4;   //
		p4= p2;
		p2 = (ClassC)p1; 
		p1=p2;
		p1 =(ClassB) p3; 				
		p2 = (ClassC)p4;
	}

}
