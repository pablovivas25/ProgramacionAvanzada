package unlam.progava.oia;

import java.util.LinkedList;
import java.util.List;

public class Sumadora {

	List<Integer> valores = new LinkedList<Integer>();
	Integer resultado;

	public boolean agregar(Integer valor) {
		return valores.add(valor);
	}

	public Integer getResultado() {
		return resultado;
	}

	public void sumarTodo() {
		resultado = 0;
		for (Integer valor : valores) {
			resultado += valor;
		}
	}
	
	
	
}
