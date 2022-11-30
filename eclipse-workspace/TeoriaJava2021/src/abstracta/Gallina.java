package abstracta;

public class Gallina extends Animal {
	
	public void comer(Animal a ) {
		System.out.println("Me estoy comiendo Animal");
		a.saludar();
	}
	@Override
	public void saludar() {
		System.out.println("Hola soy una gallina");

	}

}
