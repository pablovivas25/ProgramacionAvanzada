
public class Arista implements Comparable<Arista>{
	private Isla is1;
	private Isla is2;
	private int costo;
	
	public Isla getIs1() {
		return is1;
	}
	public void setIs1(Isla is1) {
		this.is1 = is1;
	}
	public Isla getIs2() {
		return is2;
	}
	public void setIs2(Isla is2) {
		this.is2 = is2;
	}
	
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public Arista(Isla is1, Isla is2, int costo) {
		super();
		this.is1 = is1;
		this.is2 = is2;
		this.costo = costo;
	}
	@Override
	public int compareTo(Arista o) {
		
		return this.costo-o.getCosto();
	}

	
	
}
