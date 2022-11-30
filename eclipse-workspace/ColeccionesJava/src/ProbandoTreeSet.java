import java.util.TreeSet;

public class ProbandoTreeSet {

	public static void main(String []args) {
		TreeSet<Persona> tp=new TreeSet<Persona>();
		
		Persona p1=new Persona(111,"Pablo",25);
		Persona p2=new Persona(222,"Franco",15);
		Persona p3=new Persona(333,"Lucia",19);
		Persona p4=new Persona(444,"Rodrigo",20);
		
		tp.add(p1);
		tp.add(p2);
		tp.add(p3);
		tp.add(p4);
		
		System.out.println(tp);
		System.out.println("PRIMER ELEMENTO "+tp.first().toString());
		System.out.println("ULTIMO ELEMENTO "+tp.last().toString());
		System.out.println("MAYOR QUE 2 "+tp.higher(p2));
		System.out.println("MENOR QUE 2 "+tp.headSet(p2));
		
	}
}
