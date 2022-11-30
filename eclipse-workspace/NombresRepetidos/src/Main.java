import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[]args) throws FileNotFoundException {
		Nombre n=new Nombre("nombres.in");
		///n.mostrarNombres();
		n.mostrarMap();
		n.resolver("nombres.out");
	}
}
