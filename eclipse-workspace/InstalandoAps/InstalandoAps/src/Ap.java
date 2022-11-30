import java.io.FileNotFoundException;
import java.util.List;

public class Ap {

	public static void main(String[] args) throws FileNotFoundException {
		Archivo ap = new Archivo();
		Aplicacion a = ap.leerArchivo("Entrada/Caso01.in");

		System.out.println("Cantidad de aplicaciones " + " " + a.getCantidadAplicaciones());
		System.out.println("MEMORIA APLICACION A INSTALAR " + " " + a.getMemoriaAplicacionInstalar());
		System.out.println("----MEMORIA DE CELULAR---");
		List<Integer> list= a.getMemoriaApicaciones().getMemoriaconsecutiva();

		for (Integer i : list)
			System.out.print(i + " ");

		ap.escribirArchivo("Caso01.out", a.resolver());

	}

}
