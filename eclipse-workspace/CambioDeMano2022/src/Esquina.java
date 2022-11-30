
public class Esquina implements Comparable<Esquina>{
	
	private int numero;
	private int distancia_minima;

	public int getNumero() {
		return numero;
	}

	public Esquina(int numero) {
		super();
		this.numero = numero;
	}

	public void setDistancia_minima(int distancia_minima) {
		this.distancia_minima = distancia_minima;
	}

	public Esquina(int numero, int distancia_minima) {
		super();
		this.numero = numero;
		this.distancia_minima = distancia_minima;
	}

	@Override
	public int compareTo(Esquina o) {
		// TODO Auto-generated method stub
		return this.distancia_minima-o.distancia_minima;
	}

	public int getDistancia_minima() {
		return distancia_minima;
	}
	
	


	
	
}
