import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GestorFile {

	static Concurso leerArchivo(String path) {
		Concurso c = null;
		try {

			Scanner sc = new Scanner(new File(path));
			sc.useLocale(Locale.ENGLISH);
			ArrayList<Concursante> concursantes = new ArrayList<Concursante>();
			int cantidad_participantes = sc.nextInt();
			int cantidad_lanzamientos = 3;
			Concursante curs = new Concursante();
			int i = 1;
			double distancia_aux = 0;

			while (sc.hasNextDouble()) {
				if (cantidad_lanzamientos < 1) {
					curs.setNumero(i);
					curs.setDistanciaAcum(distancia_aux);
					concursantes.add(curs);
					distancia_aux = 0;
					curs = new Concursante();

					i++;

					cantidad_lanzamientos = 3;
				} else {
					double distancia = sc.nextDouble();
					double angulo = sc.nextDouble();
					System.out.println(distancia + " " + angulo);
					curs.agregarLanzamiento(new Lanzamiento(distancia, angulo));

					if (angulo >= -90 && angulo <= 90) {
						if (angulo >= -30 && angulo <= 30)
							distancia_aux += distancia;
						else
							distancia_aux += distancia * 0.8;
					} else
						distancia_aux += 0;

					cantidad_lanzamientos--;
				}

			}
			curs.setNumero(i);
			curs.setDistanciaAcum(distancia_aux);
			concursantes.add(curs);

			c = new Concurso(cantidad_participantes, cantidad_lanzamientos, concursantes);
			sc.close();
			return c;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;

	}

	static void escribirArchivo(String path, ArrayList<Concursante> podioConsistencia,
			ArrayList<Concursante> podioDistancia) {
		PrintWriter pr;
		System.out.println("entre");

		try {
			System.out.println("entre");
			pr = new PrintWriter(new File(path));

			if (podioConsistencia.size() == 0 || podioConsistencia.isEmpty())
				pr.println("No hay participantes podio consistencia");
			else {
				int cant = 0;
				if (podioConsistencia.size() > 3)
					cant = 3;
				else
					cant = podioConsistencia.size();

				for (int i = 0; i < cant; i++) {
					pr.print(podioConsistencia.get(i).getNumero() + " ");
				}

				pr.println();
			}

			if ((podioDistancia.size() == 0 || podioDistancia.isEmpty())
					|| podioDistancia.get(0).getDistanciaAcum() == 0) {
				pr.print("Todos los lanzamientos descalificados");
				// return;
			} else {
				int cant1 = 0;
				if (podioDistancia.size() > 3)
					cant1 = 3;
				else
					cant1 = podioDistancia.size();

				for (int i = 0; i < cant1; i++) {
					// if(podioDistancia.get(i).getDistanciaAcum()!=0)
					pr.print(podioDistancia.get(i).getNumero() + " ");
				}

			}
			pr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		try {
			Concurso c = GestorFile.leerArchivo("./PreparacionPrueba/LotePrueba/Entrada/fatiga.in");
			c.resolver();

			GestorFile.escribirArchivo("./PreparacionPrueba/LotePrueba/SalidaEsperada/fatiga.out",
					c.getPodioConsistencia(), c.getConcursantes());

			// GeneradorFileFatiga.generarFile("./PreparacionPrueba/LotePrueba/Entrada/fatiga.in");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
