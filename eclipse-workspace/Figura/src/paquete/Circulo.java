package paquete;

import interfaz.Dibujable;
import interfaz.Rotable;

public class Circulo extends Figura implements Dibujable,Rotable{
	private float radio;
	
	
	
	public Circulo(float radio) {
	
		this.radio = radio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(radio);
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
		Circulo other = (Circulo) obj;
		if (Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio))
			return false;
		return true;
	}

	public double calcularArea() {
		return Math.PI*Math.pow(this.radio, 2);
	}
	
	public void dibujar() {
		System.out.println("Estoy dibujando un Circulo");
	}
	public void rotar() {
		System.out.println("Estoy rotando un Circulo");
	}
}
