package letrasextremas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class LetraExtrema {
	private int cantidadPalabras;
	private List<String> palabras;
	private Map<Character, Integer> letras;

	//Este podria mandarlo en una clase Archivo
	///Toma los datos del archivo de entrada
	public LetraExtrema(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));

		this.cantidadPalabras = sc.nextInt();
		this.palabras = new ArrayList<String>(this.cantidadPalabras);
		this.letras = new HashMap<Character, Integer>();

		for (int i = 0; i < this.cantidadPalabras; i++)
			this.palabras.add(sc.next());

		sc.close();

	}

	public int getCantidadPalabras() {
		return cantidadPalabras;
	}

	public void setCantidadPalabras(int cantidadPalabras) {
		this.cantidadPalabras = cantidadPalabras;
	}

	public List<String> getPalabras() {
		return palabras;
	}

	public void setPalabras(List<String> palabras) {
		this.palabras = palabras;
	}
	
	///Este podria ir en una clase Archivo
	//Graba el archivo de salida 
	public void resolver(String pathSal) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File(pathSal));

		for (String pal : this.palabras) {
			if (pal.length() > 1) {
				char ini = pal.charAt(0);
				int valor = 1;

				if (this.letras.containsKey(ini))
					valor = this.letras.get(ini) + 1;

				this.letras.put(ini, valor);

				char fin = pal.charAt(pal.length() - 1);
				valor = 1;

				if (this.letras.containsKey(fin))
					valor = this.letras.get(fin) + 1;

				this.letras.put(fin, valor);

			} else {
				int valor = 1;
				if (this.letras.containsKey(pal.charAt(0)))
					valor = this.letras.get(pal.charAt(0)) + 1;

				this.letras.put(pal.charAt(0), valor);
			}

		}

//		System.out.println("----MOSTRANDO ELEMENTOS DEL HASHMAP------");
//		for (Character key : this.letras.keySet()) {
//			System.out.println(key + " " + this.letras.get(key));
//		}

		/// System.out.println("ORDENANDO HASHMAP");
		List<Entry<Character, Integer>> list = new ArrayList<>(this.letras.entrySet());
		list.sort(Entry.comparingByValue(Comparator.reverseOrder()));

		List<Character> aux = devolverCaracterMaximo(list); /// me devuelve las letras con mayor apariciones
		Set<String> conjunto = new HashSet<String>(); // guardo las palabras que contiene esas letras con mayor
														// apariciones
		/// no guardo palabras duplicadas
		
		///Genero las palabras que contienen las letras extremas
		///Lo hago en un conjunto para evitar palabras duplicadas
		for (Character c : aux) {
			for (String s : this.palabras) {
				if (s.charAt(0) == c || s.charAt(s.length() - 1) == c) {
					conjunto.add(s);
					System.out.println(s);
				}
			}
		}
		
		//Genero la salida del archivo
		//Lo podria sacar afuera en la clase archivo
		///creo un metodo en donde le paso el pathSalida y letrasextremas, palabras.
		for (Character c1 : aux)
			pw.print(c1 + " ");
		pw.print("\n");

		for (String st : conjunto)
			pw.println(st);

		pw.close();
	}
	
	///Devuelve la letra o las letras extremas
	public List<Character> devolverCaracterMaximo(List<Entry<Character, Integer>> list) {
		List<Character> ch = new ArrayList<Character>();
		int maxValue = list.get(0).getValue();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getValue() == maxValue)
				ch.add(list.get(i).getKey());
		}

		return ch;
	}

	public static void main(String[] args) throws FileNotFoundException {
		LetraExtrema le = new LetraExtrema("EntradaLetra/caso04.in");
		System.out.println(le.getCantidadPalabras());
		for (String p : le.getPalabras())
			System.out.println(p);

		le.resolver("SalidaLetra/caso04.out");

	}

}
