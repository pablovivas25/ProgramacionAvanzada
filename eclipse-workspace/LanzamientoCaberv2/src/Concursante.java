import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Concursante implements Comparable<Concursante> {
	private int numero;
	private List<Lanzamiento> lanzamientos;
	private int consistencia;
	private double distanciaAcum = 0;

	public Concursante() {
		this.lanzamientos = new ArrayList<Lanzamiento>();
	}

	public void agregarLanzamiento(Lanzamiento l) {
		this.lanzamientos.add(l);
	}

	public List<Lanzamiento> getLanzamientos() {
		return lanzamientos;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public double getDistanciaAcum() {
		return distanciaAcum;
	}

	public void setDistanciaAcum(double distanciaAcum) {
		this.distanciaAcum = distanciaAcum;
	}

	public double totalDistancia() {
		double total = 0;
		for (Lanzamiento l : this.lanzamientos) {
			total += l.puntaje();
		}
		return total;
	}

	public double getConsistencia() {
		double total_cons = 0;
		for (int i = 0; i < this.lanzamientos.size(); i++) {
			if (this.lanzamientos.get(i).lanzamientoValido() == false)
				return -1;
			else
				total_cons += Math.abs(this.lanzamientos.get(i).getAngulo());
		}
		return total_cons / this.lanzamientos.size();

	}

	@Override
	public int compareTo(Concursante obj) {
		if (this.consistencia < obj.consistencia)
			return 1;
		else if (this.consistencia == obj.consistencia)
			return 0;
		else
			return -1;
	}

	public static class Comparators {

		public static Comparator<Concursante> DISTANCIA = new Comparator<Concursante>() {
			@Override
			public int compare(Concursante l1, Concursante l2) {
				if (l1.getDistanciaAcum() < l2.getDistanciaAcum())
					return 1;
				else if (l1.getDistanciaAcum() == l2.getDistanciaAcum())
					return 0;
				else
					return -1;
			}
		};
	}

	public void setConsistencia(int consistencia) {
		this.consistencia = consistencia;
	}

}
