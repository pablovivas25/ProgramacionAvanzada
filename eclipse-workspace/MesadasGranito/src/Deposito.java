import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Deposito {
	private int cantidad;
	List<Mesada> mesadas;

	public Deposito(int cantidad, List<Mesada> mesadas) {
		super();
		this.cantidad = cantidad;
		this.mesadas = mesadas;
	}

	public int getCantidad() {
		return cantidad;
	}

	public List<Mesada> getMesadas() {
		return mesadas;
	}

	public int resolver() {

		ArrayList<Mesada> mesadasApiladas = new ArrayList<Mesada>();


		for (Mesada m : this.mesadas) {
			if (mesadasApiladas.isEmpty())
				mesadasApiladas.add(m);
			else {
				for (int i = 0; i < mesadasApiladas.size(); i++) {
					if (mesadasApiladas.get(i).sePuedeApilar(m)) {
						mesadasApiladas.set(i, m);
						i = mesadasApiladas.size();

					}
				}
				if (mesadasApiladas.contains(m) == false)
					mesadasApiladas.add(m);

			}

		}

		return mesadasApiladas.size();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Archivo a = new Archivo();
		Deposito d = a.leerArchivo("Archivos/Entrada/caso02.in");
		System.out.println("Cantidad " + " " + d.getCantidad());
		System.out.println("---MESADAS---");

		for (Mesada m : d.getMesadas())
			System.out.println(m.getLargo() + " " + m.getAncho());

		Mesada m1 = new Mesada(4, 5);
		Mesada m2 = new Mesada(5, 2);
		Mesada m3 = new Mesada(4, 12);

		System.out.println("Resolver " + d.resolver());
		a.escribirArchivo("Archivos/Salida/caso02.out", d.resolver());

		System.out.println(m1.sePuedeApilar(m2));
		System.out.println(m2.sePuedeApilar(m1));
		System.out.println(m1.sePuedeApilar(m3));

	}

}
