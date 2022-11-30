import java.util.ArrayList;
import java.util.Iterator;


public class ProbarArrayList {

	public static void main(String[] args) {
		ArrayList<Persona> ap=new ArrayList<Persona>();
		Persona p1=new Persona(111,"Pablo",25);
		Persona p2=new Persona(222,"Franco",15);
		Persona p3=new Persona(333,"Lucia",19);
		Persona p4=new Persona(444,"Rodrigo",20);
		
		ap.add(p1);
		ap.add(p2);
		ap.add(p3);
		ap.add(p4);
		
		System.out.println("---MOSTRANDO CON UN FOREACH------");
		for (Persona persona : ap) {
			System.out.println(persona.toString());
		}
		System.out.println("-----MOSTRANDO CON UN FOR-------");
		for(int i=0;i<ap.size();i++) {
			System.out.println(ap.get(i));
		}
		
		ap.add(new Persona(111,"Pablo",25));
		
		System.out.println("MOSTRANDO CON UN ITERATOR-----");
		Iterator<Persona>miIterador=ap.iterator();
		
		while(miIterador.hasNext())
			System.out.println(miIterador.next());
		
		System.out.println("El arrayList contiene p1 "+ap.contains(p1));
		ap.remove(p3);
		System.out.println("CANTIDAD ELEMENTOS DESPUES DE ELIMINAR "+ap.size());
		System.out.println();

		System.out.println("---MOSTRANDO CON UN FOREACH------");
		for (Persona persona : ap) {
			System.out.println(persona.toString());
		}
		///ADMITE DUPLICADOS
		
		
	}

}
