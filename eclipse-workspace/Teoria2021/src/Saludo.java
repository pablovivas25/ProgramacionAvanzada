
public class Saludo {
	String mensaje="¡Buen dia!";
	
	public void saludar() {
		System.out.println(this.mensaje);
	}
	
	public static void main(String[] args) {
		Saludo s=new Saludo();
		System.out.println(s.mensaje);
	}
}
