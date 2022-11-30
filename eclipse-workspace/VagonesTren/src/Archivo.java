import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Archivo {

	public Tren leerArchivo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int cantEspecies = sc.nextInt();
		int nivelAgresividad = sc.nextInt();
		List<Especie> especies = new ArrayList<Especie>();

		for (int i = 0; i < cantEspecies; i++) {
			Animal a=new Animal(sc.next(),sc.nextInt());
			int cant=sc.nextInt();
			especies.add(new Especie(a,cant));
		}
			
		sc.close();

		return new Tren(cantEspecies, nivelAgresividad, especies);

	}
	
	public void escribirArchivo(List<Vagon> vagones,String path) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter(new File(path));
		int aux=0;
		for(Vagon v:vagones) {
			if(v.getAgresividadTotal()!=0) {
				pw.print(vagones.size() +" "+ v.getAgresividadTotal());
				aux=1;
			}
				
		}
		if(aux==0)
			pw.print(vagones.size()+" "+0);
		
		
		pw.close();
	}

}
