
public class Especie implements Comparable<Especie>{
	private Animal animal;
	private int cantidad;

	public Especie(Animal animal, int cantidad) {
		super();
		this.animal = animal;
		this.cantidad = cantidad;
	}

	public Animal getAnimal() {
		return animal;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Especie [animal=" + animal + ", cantidad=" + cantidad + "]";
	}

	@Override
	public int compareTo(Especie o) {
		
		return this.getAnimal().getAgresividad()-o.getAnimal().getAgresividad();
	}

	

}
