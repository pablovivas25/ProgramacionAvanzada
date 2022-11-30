
public abstract class Animal {
	public void desplazarse() {
		System.out.println("Me estoy moviendo");
	}
	abstract void saludar();
	
	public static void main(String[] args) {
		Animal a1=new Perro();
		a1.saludar();
		Animal a2=new Perro();
		a2.saludar();
		Animal a3=new Gato();
		a3.saludar();
		Animal a4=new Leon();
		a4.saludar();
		Animal a5=new Elefante();
		a5.saludar();
	}
}
