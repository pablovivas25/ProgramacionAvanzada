
public class Main {

	public static void main(String[] args) {
		BaseA a1=new BaseA();
		a1.mostrar();
		DerivadaB b1=new DerivadaB();
		b1.mostrar();
		BaseA a2=new DerivadaB();
		a2.mostrar();
		///DerivadaB b2=new BaseA();
		///b2.mostrar();
		
		/* No podes instanciar una clase hija con el constructor de 
		 * una clase padre y viceversa si.
		 * 
		 */
	}

}
