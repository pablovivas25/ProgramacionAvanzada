package ABC;

public class Prueba {

	public static void main(String[] args) {
		A p0 = new A(); 				
		B p1 = new B();
		//p1=p0; ERROR 
		p0 = p1;
		C p2 = new C(); 
		p1 = p2; ///
		p2=(C)p1;// ERROR
		A p3 = new B(); 				
		A p4 = new C(); 	
		//p2=p4;//ERROR
		//p2=(C)p4; BIEN
					
		///p2 = (C)p1; ERROR 				
		///p1 = (B)p3; BIEN
		///p1=p3; ERROR
		///p2 = (C)p4; BIEN
		///p2=p4; ERROR
		
	}

}
