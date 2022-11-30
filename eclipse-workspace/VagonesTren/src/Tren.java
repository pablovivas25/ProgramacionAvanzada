import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tren {
	private int cantidadEspecies;
	private int nivelAgresividadMax;
	private List<Especie> especies;
	private int cantidadVagones;

	public Tren(int cantidadEspecies, int nivelAgresividadMax, List<Especie> especies) {
		super();
		this.cantidadEspecies = cantidadEspecies;
		this.nivelAgresividadMax = nivelAgresividadMax;
		this.especies = especies;
	}

	public int getCantidadEspecies() {
		return cantidadEspecies;
	}

	public int getNivelAgresividadMax() {
		return nivelAgresividadMax;
	}

	public List<Especie> getEspecies() {
		return especies;
	}

	public int getCantidadVagones() {
		return cantidadVagones;
	}

	public void setCantidadVagones(int cantidadVagones) {
		this.cantidadVagones = cantidadVagones;
	}

	public void ordenarPorAgresividad() {
		Collections.sort(this.especies);
	}

	public static List<Vagon> asignarAgresividadMaxima(List<Vagon> vagones) {

		for (Vagon v : vagones) {

			Collections.sort(v.getEspecies());
			int min = v.getEspecies().get(0).getAnimal().getAgresividad();
			int max = v.getEspecies().get(v.getEspecies().size() - 1).getAnimal().getAgresividad();
			v.setAgresividadTotal(max - min);

		}
		return vagones;
	}

	public int hayAnimalMenosAgresivo(List<Vagon> vagones, Especie otro) {

		int pos = -1;

		for (int i = 0; i < vagones.size(); i++) {
			for (Especie e : vagones.get(i).getEspecies())
				if (Math.abs(e.getAnimal().getAgresividad() - otro.getAnimal().getAgresividad()) <= 100) {
					pos = i;
				}

		}

		return pos;
	}

	public List<Vagon> resolver() {
		List<Vagon> vagones = new ArrayList<Vagon>();

		for (Especie e : this.especies) {
			if (vagones.isEmpty()) {
				List<Especie> unico = new ArrayList<Especie>();
				unico.add(e);
				vagones.add(new Vagon(unico));
			}

			else {
				for (int i = 0; i < vagones.size(); i++) {
					int pos = hayAnimalMenosAgresivo(vagones, e);

					if (pos == -1) {
						List<Especie> unico1 = new ArrayList<Especie>();
						unico1.add(e);
						vagones.add(new Vagon(unico1));

					} else {
						vagones.get(pos).getEspecies().add(e);

					}
					break;

				}
			}

		}
		return vagones;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Archivo a = new Archivo();
		Tren t = a.leerArchivo("Archivos/Entrada/caso04.in");

		System.out.println("Cant Espe " + t.getCantidadEspecies());
		System.out.println("Nivel Agres " + t.getNivelAgresividadMax());

		List<Vagon> vagonesMin = t.resolver();

		vagonesMin = asignarAgresividadMaxima(vagonesMin);

		a.escribirArchivo(vagonesMin, "Archivos/Salida/caso04.out");
		System.out.println("----VAGONES----");
		for (Vagon vag : vagonesMin) {
			System.out.println(vag.getEspecies().toString() + " " + vag.getAgresividadTotal());
		}

	}

}
