import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args){
		Aplicacion a=new Aplicacion(new File("caso4.in"),new File("caso4.out"));
		a.obtenerDatos();
		a.resolver();
		GeneradorCasoFatiga ca=new GeneradorCasoFatiga();
		ca.crearArchivoFatiga();

	}

}
