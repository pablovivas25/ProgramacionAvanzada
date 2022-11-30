package paquete;

import interfaz.Dibujable;
import interfaz.Rotable;

public class Rectangulo extends Figura implements Dibujable, Rotable{
	private float ancho;
	private float alto;
	
	
	public Rectangulo(float ancho, float alto) {
	
		this.ancho = ancho;
		this.alto = alto;
	}

	public double calcularArea() {
		return this.ancho*this.alto;
	}
	
	public void dibujar() {
		System.out.println("Estoy dibujando un rectangulo");
	}
	
	public void rotar() {
		System.out.println("Estoy rotando un rectangulo");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(alto);
		result = prime * result + Float.floatToIntBits(ancho);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (Float.floatToIntBits(alto) != Float.floatToIntBits(other.alto))
			return false;
		if (Float.floatToIntBits(ancho) != Float.floatToIntBits(other.ancho))
			return false;
		return true;
	}
	
	
}
