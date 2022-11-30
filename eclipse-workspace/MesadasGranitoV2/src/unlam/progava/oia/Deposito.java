package unlam.progava.oia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Deposito {

	List<Mesada> mesadas = new ArrayList<Mesada>();
	Integer resultado;

	public boolean agregar(Mesada m) {
		return mesadas.add(m);
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void resolver() {

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

		this.setResultado(mesadasApiladas.size());
	}

}
