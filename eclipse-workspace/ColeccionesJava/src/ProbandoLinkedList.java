import java.util.Iterator;
import java.util.LinkedList;

public class ProbandoLinkedList {
	public static void main(String[] args) {
		LinkedList<Persona> ap=new LinkedList<Persona>();
		Persona p1=new Persona(111,"Pablo",25);
		Persona p2=new Persona(222,"Franco",15);
		Persona p3=new Persona(333,"Lucia",19);
		Persona p4=new Persona(444,"Rodrigo",20);
		
		ap.add(p1);
		ap.add(p2);
		ap.add(p3);
		ap.add(p4);
		
		System.out.println(ap);
		
		Iterator<Persona> miIterator=ap.iterator();
		
		while(miIterator.hasNext()) {
			System.out.println(miIterator.next());
		}
		
		ap.add(2, new Persona(555,"Ezequiel",40));
		ap.addFirst(new Persona(666,"Noemi",50));
		ap.addLast(new Persona(777,"Dario",48));
		System.out.println(ap);
		System.out.println(ap.get(0).toString());
	}
}
