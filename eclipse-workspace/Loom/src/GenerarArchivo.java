import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GenerarArchivo {
	
	public GenerarArchivo(String pathSalida) throws FileNotFoundException {
		PrintWriter salida=new PrintWriter(new File(pathSalida));
		
		int cantidadNumeros=(int)(Math.random()*10000 +10000);
		salida.println(cantidadNumeros);
		for(int i=0;i<cantidadNumeros;i++) {
			salida.println((int)(Math.random()*12000+0));
		}
		System.out.println(cantidadNumeros);
		salida.close();
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		GenerarArchivo g=new GenerarArchivo("Archivos/salida.out");
		
		
	}
}
