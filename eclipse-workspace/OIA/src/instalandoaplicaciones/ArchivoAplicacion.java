package instalandoaplicaciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArchivoAplicacion {
	
	public Aplicacion leerArchivo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int cantidadApl=sc.nextInt();
		int memoriaAplicInstalar=sc.nextInt();
		int [] memoria = new int[cantidadApl];
		
		for(int i=0;i<cantidadApl;i++)
			memoria[i]=sc.nextInt();
		
		///CelularMemoria cm=new CelularMemoria(memoria);
		
		sc.close();
		return new Aplicacion(cantidadApl,memoriaAplicInstalar,new CelularMemoria(memoria));
	}
}
