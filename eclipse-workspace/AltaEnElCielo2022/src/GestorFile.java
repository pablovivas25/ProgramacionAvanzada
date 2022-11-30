import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorFile {
	public static OIA leerArchivo(String path) {
		try {
			Scanner sc=new Scanner(new File(path));
			int carretel=sc.nextInt();
			int cantidad_escuelas=sc.nextInt();
			ArrayList<Escuela> escuelas=new ArrayList<Escuela>();
			
			for(int i=0;i<cantidad_escuelas;i++) {
				int x=sc.nextInt();
				carretel-=x;
				escuelas.add(new Escuela(i+1,x,x));
			}
			
			sc.close();
			
			return new OIA(carretel,escuelas);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public static void escribirArchivo(String path,Escuela maximo_retazo,int bandera_con_mas_retazos,int sobrantes,Subsecuencia s) {
		try {
			PrintWriter pw=new PrintWriter(new File(path));
			pw.println(maximo_retazo.getNumero() + " "+maximo_retazo.getRetazo());
			pw.println(bandera_con_mas_retazos);
			pw.println(sobrantes);
			pw.println(s.getCantidad_trazos()+ " "+s.getEscuela_1() + " "+s.getEscuela_2());
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		OIA o=GestorFile.leerArchivo("./PreparacionPrueba/LotePrueba/Entrada/enunciado.in");
		o.resolver();
		
		GestorFile.escribirArchivo("./PreparacionPrueba/LotePrueba/SalidaEsperada/enunciado.out",o.getEscuelas().get(o.getEscuelas().size()-1), o.getCarretel(),o.getMaximo_cantidad_retazos(), o.getSub());
	}
}
