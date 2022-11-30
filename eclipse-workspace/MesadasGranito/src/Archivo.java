import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Archivo {

	public Deposito leerArchivo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int cantMesada = sc.nextInt();
		List<Mesada> mesadas = new ArrayList<Mesada>(cantMesada);

		for (int i = 0; i < cantMesada; i++)
			mesadas.add(new Mesada(sc.nextInt(), sc.nextInt()));

		sc.close();

		return new Deposito(cantMesada, mesadas);
	}
	
	public void escribirArchivo(String path,int cantPilas) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter(new File(path));
		pw.print(cantPilas);
		pw.close();
	}
}
