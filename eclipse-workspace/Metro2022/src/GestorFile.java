import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorFile {
	public static Metro leerArchivo(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			List<Isla> nodos=new ArrayList<Isla>();
			List<Puente> puentes=new ArrayList<Puente>();
			List<Tunel> tuneles=new ArrayList<Tunel>();
			List<Arista> aristas=new ArrayList<Arista>();
			
			int numero_islas=sc.nextInt();
			int numero_tuneles=sc.nextInt();
			int numero_puentes=sc.nextInt();
			
			for(int i=0;i<numero_islas;i++)
				nodos.add(new Isla(i+1));
			for(int j=0;j<numero_tuneles;j++)
				aristas.add(new Arista(new Isla(sc.nextInt()),new Isla(sc.nextInt()),0));
			for(int k=0;k<numero_puentes;k++)
				aristas.add(new Arista(new Isla(sc.nextInt()),new Isla(sc.nextInt()),1));
			
		
			
			sc.close();
			
			return new Metro(nodos,aristas);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	public static void escribirArchivo(String path,int puentes_minimos) {
		try {
			PrintWriter pw=new PrintWriter(new File(path));
			pw.print(puentes_minimos);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Metro m=GestorFile.leerArchivo("./PreparacionPruebas/LotePrueba/Entrada/todos_puentes.in");
		
		m.resolver();
		
		GestorFile.escribirArchivo("./PreparacionPruebas/LotePrueba/SalidaEsperada/todos_puentes.out",m.getMinimo_puentes());
	}
}
