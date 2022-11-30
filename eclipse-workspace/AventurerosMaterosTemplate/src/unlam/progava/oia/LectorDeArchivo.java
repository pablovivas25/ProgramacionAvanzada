package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class LectorDeArchivo {

	public static Aventureros leer(String path) {
		Aventureros aventureros;
		int cantidad=0;
		ArrayList<Integer> listaNumeros= new ArrayList<>();
		
		File file = new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			cantidad = scanner.nextInt();
			for (int i = 0; i < cantidad-1; i++) {
				listaNumeros.add(scanner.nextInt());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		aventureros=new Aventureros(cantidad, listaNumeros);
		return aventureros;
	}

}
