import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorFile {
	public static Sopa leerArchivo(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			ArrayList<String> oeste=new ArrayList<String>();
			ArrayList<String> norte=new ArrayList<String>();
			ArrayList<String> este=new ArrayList<String>();
			ArrayList<String> sur=new ArrayList<String>();
			ArrayList<String> palabras=new ArrayList<String>();
			//ArrayList<String> aux=new ArrayList<String>();
			
			int filas=sc.nextInt();
			int cant_pal=sc.nextInt();
			
			for(int i=0;i<filas;i++)
				este.add(sc.next());
			
			for(int i=0;i<cant_pal;i++)
				palabras.add(sc.next());
			
			for(String s:este) {
				StringBuilder str=new StringBuilder(s);
				String aux=str.reverse().toString();
				oeste.add(aux);
			}
			String cad="";
			
			for(int j=0;j<filas;j++) {
				for(int i=0;i<este.size();i++) {
					//System.out.println(este.get(i).charAt(j));
					cad+=""+este.get(i).charAt(j);
				}
				
				sur.add(cad);
				cad="";
			}
			
			cad="";
			for(int j=0;j<este.size();j++) {
				for(int i=filas-1;i>=0;i--) {
					cad+=""+este.get(i).charAt(j);
				}
				//System.out.println(cad);
				norte.add(cad);
				cad="";
			}
			
			
			
			
			sc.close();
			return new Sopa(norte,oeste,este,sur,palabras);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public static void main(String[] args) {
		Sopa s=GestorFile.leerArchivo("./PreparacionPruebas/LotePrueba/Entrada/palabra_buscar_palindromo.in");
		s.resolver();
		
	}
}
