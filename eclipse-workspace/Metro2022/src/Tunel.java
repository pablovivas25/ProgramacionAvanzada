
public class Tunel {
	
	private int numero;
	private Isla isla;
	private Isla isla2;
	private int costo=0;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public Tunel(int numero,Isla is,Isla is2) {
		super();
		this.numero = numero;
		this.isla=is;
		this.isla2=is2;
	}
	public Isla getIsla() {
		return isla;
	}
	public void setIsla(Isla isla) {
		this.isla = isla;
	}
	public Isla getIsla2() {
		return isla2;
	}
	public void setIsla2(Isla isla2) {
		this.isla2 = isla2;
	}
	
	
	

}
