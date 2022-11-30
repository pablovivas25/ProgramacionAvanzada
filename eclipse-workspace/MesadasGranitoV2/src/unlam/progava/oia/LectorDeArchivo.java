package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LectorDeArchivo {

	public static Deposito leer(String path) {
		Deposito sumadora = new Deposito();
		
		File file = new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			for (int i = 0; i < cant; i++) {
				Mesada m=new Mesada(scanner.nextInt(),scanner.nextInt());
				sumadora.agregar(m);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return sumadora;
	}

}
