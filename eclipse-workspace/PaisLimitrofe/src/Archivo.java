import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Archivo {

	
	public Continente leerArchivo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int cantPar = sc.nextInt();
		Map<String,Set<String>> limita = new TreeMap<String,Set<String>>();
		ArrayList<Limitrofe> limitrofe=new ArrayList<Limitrofe>();

		for (int i = 0; i < cantPar; i++) {
			String actual = sc.next();
			String vecino = sc.next();
			Set<String> conjuntoActual = limita.getOrDefault(actual, new TreeSet<String>());
			Set<String> conjuntoVecino = limita.getOrDefault(vecino, new TreeSet<String>());
			
			conjuntoActual.add(vecino);
			conjuntoVecino.add(actual);
			limita.put(actual,conjuntoActual);
			limita.put(vecino,conjuntoVecino);
			limitrofe.add(new Limitrofe(actual,vecino));
			limitrofe.add(new Limitrofe(vecino,actual));
			
		}
		sc.close();
		return new Continente(limita,limitrofe);
	}
	
	public void escribirArchivo(String path) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter(new File(path));
		
		pw.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Archivo a = new Archivo();
		Continente c = a.leerArchivo("Archivos/Entrada/enunc.in");
		/*
		for (String llave :c.getPares().keySet()) { //O(n)
			System.out.println(llave + " "+ c.getPares().get(llave).size());
		}
		*/
		c.translimitrofes();

	}
}
