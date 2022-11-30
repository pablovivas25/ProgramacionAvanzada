
public class Calle {
	private Esquina esq1;
	private Esquina esq;
	private int distancia;
	private int numero;
	
	public Esquina getEsq1() {
		return esq1;
	}
	public void setEsq1(Esquina esq1) {
		this.esq1 = esq1;
	}
	public Esquina getEsq() {
		return esq;
	}
	public void setEsq(Esquina esq) {
		this.esq = esq;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public Calle(Esquina esq1, Esquina esq, int distancia, int numero) {
		super();
		this.esq1 = esq1;
		this.esq = esq;
		this.distancia = distancia;
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	
	
	
	
	
}
