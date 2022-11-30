package unlam.progava.oia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritorDeArchivos {

	public static void escribir(String path, Conectar conectar) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter(path);
			printerWriter = new PrintWriter(file);

			// printerWriter.println(resultado);
			for (int i = 0; i < conectar.getResultados().size(); i++) {
				printerWriter.println(conectar.getResultados().get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
