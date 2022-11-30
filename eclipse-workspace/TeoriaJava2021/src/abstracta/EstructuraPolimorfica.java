package abstracta;

import java.util.ArrayList;
import java.util.List;

public class EstructuraPolimorfica {
	
	List<Animal> animales=new ArrayList<Animal>();
	
	public void agregarAnimal(Animal a) {
		animales.add(a);
	}
	
	public void saludarAnimales() {
		for(Animal a:this.animales)
			a.saludar();
	}
	/*
	 * Un estructura de datos contenedora es polimórfica si puede contener
referencias a objetos de diversos tipos
	 */
	
	public static void main(String[] args) {
		Mono a1=new Mono();
		Gallina a2=new Gallina();
		Perro a3=new Perro();
		
		EstructuraPolimorfica e=new EstructuraPolimorfica();
		
		e.agregarAnimal(a1);
		e.agregarAnimal(a2);
		e.agregarAnimal(a3);
		
		e.saludarAnimales();
	}

}
