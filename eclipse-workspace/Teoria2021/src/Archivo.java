import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
	public static void leerArch(String path) {
		String linea;
		try {
			BufferedReader buffer=new BufferedReader(new FileReader(path));
			linea =buffer.readLine();
			//System.out.println(linea);
			while(linea==null) {
				linea=buffer.readLine();
				System.out.println(linea);
			}
			System.out.println("leido");
			buffer.close();
		}catch(IOException e) {
			System.out.println("Exception");
		}finally {
			System.out.println("----");
		}
		System.out.println("Terminado");
		
	}
	public static void main(String[] args) {
		Archivo.leerArch("archivo.in");
	}
}
