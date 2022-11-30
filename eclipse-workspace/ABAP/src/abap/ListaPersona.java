package abap;

import java.util.ArrayList;
import java.util.List;

public class ListaPersona {
	private List<Persona> lista1;
	private List<Persona> lista2;
	
	public ListaPersona(List<Persona>l1,List<Persona>l2) {
		this.lista1=l1;
		this.lista2=l2;
	}
	
	public void resolver() {
		ArrayList<Persona> coincidencias=new ArrayList<Persona>();
		ArrayList<Persona> conflictos=new ArrayList<Persona>();
		ArrayList<Persona> presentel1=new ArrayList<Persona>();
		ArrayList<Persona> presentel2=new ArrayList<Persona>();
	
		
		for(Persona persona1:this.lista1) {
			for(Persona persona2 :this.lista2) {
				if (persona1.getID() == persona2.getID()) {
					if (persona1.getNombre() == persona2.getNombre()) {
						coincidencias.add(persona1);
					} else {
						conflictos.add(persona1);
						conflictos.add(persona2);
					
					}
				}
			}
		}
		
		for(Persona pres1:this.lista1) {
			if(!coincidencias.contains(pres1))
				presentel1.add(pres1);
		}
		for(Persona pres2:this.lista2) {
			if(!coincidencias.contains(pres2))
				presentel2.add(pres2);
		}
		System.out.println("-----CONFLICTOS-----");
		for(Persona p:conflictos)
			System.out.println(p.toString());
		
		System.out.println("----COINCIDENCIAS-----");
		for(Persona p1:coincidencias)
			System.out.println(p1.toString());
		
		System.out.println("----Presentel1-----");
		for(Persona p2:presentel1)
			System.out.println(p2.toString());
		
		System.out.println("-----Presentel2------");
		for(Persona p3:presentel2)
			System.out.println(p3.toString());
		
	}
	
	public static void main(String[] args) {
		Persona p1=new Persona(111,"A");
		Persona p2=new Persona(222,"B");
		Persona p3=new Persona(333,"C");
		Persona p4=new Persona(444,"D");
		Persona p5=new Persona(555,"E");
		Persona p0=new Persona(1010,"I");
		
		Persona p6=new Persona(111,"F");
		Persona p7=new Persona(666,"H");
		Persona p8=new Persona(777,"A");
		Persona p9=new Persona(888,"I");
		Persona p10=new Persona(999,"C");
		
		
		ArrayList<Persona> l1=new ArrayList<Persona>();
		ArrayList<Persona> l2=new ArrayList<Persona>();
		
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		l1.add(p5);
		l1.add(p0);
		
		l2.add(p1);
		l2.add(p5);
		l2.add(p6);
		l2.add(p7);
		l2.add(p8);
		l2.add(p9);
		l2.add(p10);
		
		System.out.println("-----L1-----");
		for (Persona persona : l1) {
			System.out.println(persona.toString());
		}
		System.out.println("----L2------");
		for(Persona persona1:l2) {
			System.out.println(persona1.toString());
		}
		
		
		ListaPersona lp=new ListaPersona(l1,l2);
		lp.resolver();
		
		
	}

}
