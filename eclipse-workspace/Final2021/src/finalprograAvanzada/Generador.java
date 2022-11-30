package finalprograAvanzada;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Generador {
	static final int maxNumeros=1000000;
	
	public Generador(String path) throws FileNotFoundException {
		PrintWriter out =new PrintWriter(new File(path));
		Serie s=new Serie();
		
		long valorN;
		int valorAleatorio;
		
		for(int i=0;i<this.maxNumeros;i++) {
			valorAleatorio=(int)(Math.random()*100+1);
			/// System.out.println(valorAleatorio);
			valorN=s.devolverSerie(valorAleatorio);
			out.print(i+" "+valorAleatorio+" "+valorN+"\n");
			System.out.print(i+" "+valorAleatorio+" "+valorN+"\n");
			
		}
		out.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		Generador g=new Generador("salida.out");

	}

}
