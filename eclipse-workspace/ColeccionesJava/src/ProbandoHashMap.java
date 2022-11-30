import java.util.HashMap;
import java.util.Iterator;

public class ProbandoHashMap {

	public static void main(String[] args) {
		HashMap<Integer,Persona> mp=new HashMap<Integer,Persona>();
		Persona vec[]=new Persona[4];
		
		vec[0]=new Persona(111,"Pablo",25);
		vec[1]=new Persona(222,"Franco",15);
		vec[2]=new Persona(333,"Lucia",19);
		vec[3]=new Persona(444,"Rodrigo",20);
		
		for(int i=0;i<vec.length;i++) {
			mp.put(i, vec[i]);
		}
		
		Iterator<Integer> it=mp.keySet().iterator();
		while(it.hasNext()) {
			Integer key1 = (Integer) it.next();
			System.out.println(key1+" "+mp.get(key1));
		}
		
		mp.put(9, new Persona(555,"Roberto",60));
		
		System.out.println("----DESPUES DE AGREGAR----");
		
		Iterator<Integer> it2=mp.keySet().iterator();
		while(it2.hasNext()) {
			Integer key1 = (Integer) it2.next();
			System.out.println(key1+" "+mp.get(key1));
		}
		System.out.println();
		mp.put(8, new Persona(555,"Roberto",60));
		
		Iterator<Integer> it3=mp.keySet().iterator();
		while(it3.hasNext()) {
			Integer key1 = (Integer) it3.next();
			System.out.println(key1+" "+mp.get(key1));
		}
		
	}

}
