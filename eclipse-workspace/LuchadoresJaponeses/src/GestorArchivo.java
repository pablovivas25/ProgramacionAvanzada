import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class GestorArchivo implements Archivo{
	
	@Override
	public Torneo leerArchivo(String path_archivo) {
		
		File file = new File(path_archivo);
		Scanner scanner;
		Torneo t;
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			t=new Torneo(cant);
		
			for (int i = 0; i < cant; i++) {
				Luchador l=new Luchador(scanner.nextInt(),scanner.nextInt());
				t.agregarParticipante(l);
			}
			return t;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public void escribirArchivo(String path_archivo, int[] resultado) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter(path_archivo);
			printerWriter = new PrintWriter(file);
			
		//	System.out.println(resultado.length);
			for(int i=0;i<resultado.length;i++) 
			  printerWriter.println(resultado[i]);
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
	
	public static void main(String[] args) {
		GestorArchivo g=new GestorArchivo();
		Torneo t=g.leerArchivo("LotePrueba/Entrada/01_enunciado.in");
	//	t.resolver();
		//int [] vec= t.resolver();
		g.escribirArchivo("LotePrueba/SalidaEsperada/01_enunciado.out",t.resolver());
		
	}
	
	

}
