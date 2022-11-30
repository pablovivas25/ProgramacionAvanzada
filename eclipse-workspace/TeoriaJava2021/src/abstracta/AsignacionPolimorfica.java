package abstracta;

public class AsignacionPolimorfica {
	public static void main(String[] args) {

		
		Animal a1=new Elefante();
		a1.desplazarse();
		a1.saludar();
		
		Animal a2=new Mono();
		a2.desplazarse();
		a2.saludar();
		
		Animal a3=new Perro();
		a3.desplazarse();
		a3.saludar();
		
		Animal a4=new Gato();
		a4.desplazarse();
		a4.saludar();
		
	
		
	}
}
