import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorFile {

	public static Procesador leerArchivo(String path) {
		Scanner scanner = null;
		Procesador p = null;
		
		try {
			scanner = new Scanner(new File(path));
			String texto = scanner.nextLine();
			String prueba = scanner.nextLine();

			p = new Procesador(texto, prueba);
			scanner.close();

			return p;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return p;

	}
	
	public static void escribirArchivo(String path, int cantidad_movimientos) {
		PrintWriter printerWriter = null;
		
		try {
			printerWriter =new PrintWriter(new File(path));
			
			printerWriter.print(cantidad_movimientos);
			
			printerWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
