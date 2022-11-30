package unlam.progava.oia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EscritorDeArchivos {

	public static void escribir(String path, Integer resultado, ArrayList<Integer> lista) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter(path);
			printerWriter = new PrintWriter(file);

			for (int i = 0; i < lista.size(); i++) {
				printerWriter.print(lista.get(i));
				printerWriter.print(" ");
			}
			printerWriter.println();
			printerWriter.println(resultado);
			
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
