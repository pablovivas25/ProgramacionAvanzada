package unlam.progava.oia;

import java.util.ArrayList;

public class Aventureros {

	private ArrayList<Integer> listaAventureros = new ArrayList<>();
	private ArrayList<Integer> numerosASortear;
	private ArrayList<Integer> eliminados = new ArrayList<>();
	private int pava = -1;

	public Aventureros(int cantidadAventureros, ArrayList<Integer> lista2) {

		for (int i = 0; i < cantidadAventureros; i++) {
			listaAventureros.add(i + 1);
		}

		numerosASortear = lista2;

	}

	public ArrayList<Integer> getEliminados() {
		return eliminados;
	}

	public void setEliminados(ArrayList<Integer> eliminados) {
		this.eliminados = eliminados;
	}

	public int getPava() {
		return pava;
	}

	public void setPava(int pava) {
		this.pava = pava;
	}

	public void eliminarMatero() {
		eliminados.add(listaAventureros.remove(pava));
		if(pava== listaAventureros.size())
			pava=0;
	}

	public int determinarCevador() {

		pava = 0;
		for (int ai = 0; ai < numerosASortear.size(); ai++) {
			pava = (pava + numerosASortear.get(ai)) % listaAventureros.size();
			eliminarMatero();
		}
		
		return listaAventureros.get(pava);
	}
//FUNCIONA
}