import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorFile {
	
	public static Red leerArchivo(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			
			ArrayList<Conexion> con=new ArrayList<Conexion>();
			ArrayList<Computadora> nodos_conectados=new ArrayList<Computadora>();
			
			String letra=sc.next();
			while(letra.compareTo("F")!=0) {
				int nodo1=sc.nextInt();
				int nodo2=sc.nextInt();
				if(letra.compareTo("C")==0) {
					nodos_conectados.add(new Computadora(nodo1));
					nodos_conectados.add(new Computadora(nodo2));
				}
				Conexion c= new Conexion(new Computadora(nodo1),new Computadora(nodo2),letra);
				con.add(c);	
				letra=sc.next();
			}
			sc.close();
			return new Red(nodos_conectados,con);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void grabarSalida(List<String>respuestas,String salida)  {
		PrintWriter out;
		try {
			out = new PrintWriter(new File(salida));
			for(int i=0;i<respuestas.size();i++) {
				out.println(respuestas.get(i));
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Red r=GestorFile.leerArchivo("./PreparacionPruebas/LotePrueba/Entrada/02_conectar.in");
		
		r.resolver();
		
		GestorFile.grabarSalida(r.getRespuesta(), "./PreparacionPruebas/LotePrueba/SalidaEsperada/02_conectar.out");
	}
//https://github.com/ashfirpo/ConexionesDeRed/blob/master/Conectar.java
}
