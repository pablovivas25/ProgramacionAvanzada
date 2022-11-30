import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	ArrayList<Integer> jugadores;
	
	public ArrayList<Integer> leerArchivo(String path){
		
		ArrayList<Integer> listaReyes=new ArrayList<Integer>();

		
		try {
			Scanner sc=new Scanner(new File(path));
			int contReyes;
			
			int cantJugadores=sc.nextInt();
			contReyes=cantJugadores/2;

			int numeroJugador=-1;
			jugadores=new ArrayList<>();
			this.incializarLista(cantJugadores);
			

			while(contReyes>0) {
				
				for(int i=0;i<this.jugadores.size();i++) {
					int numero=sc.nextInt();
				    sc.next();
				    
				    if(contReyes>0 && numero == 12 ) {
				    	listaReyes.add(jugadores.get(i));
				    	numeroJugador=i;
				    	contReyes--;
				     }
				    
			     }
					if(numeroJugador!=-1) {
						jugadores.remove(numeroJugador);
						numeroJugador=-1;
					  
					}
						
			}
			
	
			
			sc.close();
			
			return listaReyes;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaReyes;
		

		
		
	}
	
	public void incializarLista(int cantJugadores) {
		for(int i=0;i<cantJugadores;i++) {
			this.jugadores.add(i+1);
		}
	}
	
	public void escribirArchivo(String path,ArrayList<Integer> reyes,boolean[] noreyes) {
		try {
			PrintWriter pw=new PrintWriter(new File(path));
			
			for(int i=0;i<reyes.size();i++)
				pw.print(reyes.get(i)+" ");
			pw.println();
			for(int j=0;j<noreyes.length;j++) {
				if(noreyes[j]==false)
					pw.print((j+1)+" ");
			}
				
			
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Archivo a=new Archivo();
		ArrayList<Integer> reyes=a.leerArchivo("Archivos/Entrada/Caso3_Elimincion_correcta.in");
		Mazo m=new Mazo(reyes);
		m.setearReyes();
		
	
		a.escribirArchivo("Archivos/Salida/Caso3_Elimincion_correcta.out", reyes,m.getReyes());
		
	}
	
}
