
public class Puente {
	private int numero;
	private int costo=1;
	private Isla isla1;
	private Isla isla2;
	
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
	public Puente(int numero,Isla i,Isla i2) {
		super();
		this.numero = numero;
		this.isla1=i;
		this.isla2=i2;
	}
	public Isla getIsla1() {
		return isla1;
	}
	public void setIsla1(Isla isla) {
		this.isla1 = isla;
	}
	public Isla getIsla2() {
		return isla2;
	}
	public void setIsla2(Isla isla2) {
		this.isla2 = isla2;
	}
	
	
	
	
}
