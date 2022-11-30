import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Archivo {
	public Aplicacion leerArchivo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int cantidadApl=sc.nextInt();
		int memoriaAplicInstalar=sc.nextInt();
		List<Integer> memoria = new ArrayList<Integer>(cantidadApl);
		
		for(int i=0;i<cantidadApl;i++)
			memoria.add(sc.nextInt());
		
		sc.close();
		
		return new Aplicacion(cantidadApl,memoriaAplicInstalar,new Celular(memoria));
	}
	
	public void escribirArchivo(String path,int cantidad) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter(new File(path));
		
		if(cantidad == -1)
			pw.println("No hay memoria suficiente");
		else if(cantidad==1)
			pw.println(1);
		else
			pw.println(cantidad);
		
		pw.close();
	}
}
