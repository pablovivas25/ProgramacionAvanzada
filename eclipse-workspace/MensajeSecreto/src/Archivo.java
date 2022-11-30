import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Archivo {
	
	public Mensaje leerArchivo(String path) {
		Scanner sc;
		try {
			sc = new Scanner(new File(path));
			
			String mensaje=sc.nextLine();
			Mensaje m=new Mensaje(mensaje);
			
			sc.close();
			return m;
			
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String descomprimir() {
		StringBuilder resultado =new StringBuilder();
		//System.out.println(this.comprimida);
		String cad ="(N5)(A6)VBNNN(R6)";
		StringBuilder cadaux = new StringBuilder(cad);



		int posParentesisIzq = -1;
		int posParentesisDer = -1;



		for (int i = 0; i < cad.length(); i++) {



		if (cad.charAt(i) == '(')
		    posParentesisIzq = i + 1;
		if (cad.charAt(i) == ')')
				posParentesisDer = i;
	
			resultado.append(cad.charAt(i));

		if (posParentesisIzq != -1 && posParentesisDer != -1) {
		StringBuilder cadAModificar = new StringBuilder(cadaux.substring(posParentesisIzq, posParentesisDer));
		//resultado.delete(posParentesisIzq-1,posParentesisDer+1);
		//resultado.replace(posParentesisIzq-1, posParentesisDer-1,"");
		int cantidad = cadAModificar.charAt(1)-'0';
		// System.out.println(cantidad);
		String letra=""+cadAModificar.charAt(0);
		resultado.append(new String(new char[cantidad]).replace("\0", letra));
		
		posParentesisIzq = -1;
		posParentesisDer = -1;
		}
		}
		String cad1=resultado.toString();
		/*
		String cad2=cad1.replace('(', ' ');
		String cad3=cad2.replace(')', ' ');
		String result = cad1.replaceAll("[^a-z A-Z]", "");
*/
	
	
			return cad1;
		}
	public void escribirArchivo(String path,String cadres) {
		try {
			PrintWriter pw=new PrintWriter(new File(path));
			pw.println(cadres);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Archivo a =new Archivo();
		
		System.out.println(a.descomprimir());
		//Mensaje m=a.leerArchivo("Archivos/Entrada/Caso_05_Falsa_Encriptacion.in");
		//a.escribirArchivo("Archivos/Salida/Caso_05_Falsa_Encriptacion.out", m.desencriptarCadena());
		/*
		String a=String.join("", Collections.nCopies(3, "A"));
		System.out.println(a);
		
		String repetido = new String(new char[3]).replace("\0", "A");
		System.out.println(repetido);
		*/
		 
		 
		
	}
	
}
