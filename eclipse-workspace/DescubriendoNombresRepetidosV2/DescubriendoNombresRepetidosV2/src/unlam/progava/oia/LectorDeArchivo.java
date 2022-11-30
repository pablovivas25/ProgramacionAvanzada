package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LectorDeArchivo {

	public static Sumadora leer(String path) {
		Sumadora sumadora = new Sumadora();
		
		File file = new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			for (int i = 0; i < cant; i++) {
				sumadora.agregar(scanner.nextInt());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return sumadora;
	}

}
