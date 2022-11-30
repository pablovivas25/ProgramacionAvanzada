import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Continente {

	private Map<String, Set<String>> pares;
	private Set<Limitrofe> translimitrofes;
	private ArrayList<Limitrofe> limita;

	public Continente(Map<String, Set<String>> pares, ArrayList<Limitrofe> limita) {
		this.pares = pares;
		this.translimitrofes = new TreeSet<Limitrofe>();
		this.limita = limita;
	}

	public Map<String, Set<String>> getPares() {
		return pares;
	}

	public void translimitrofes() {
		Set<Limitrofe> trans = new TreeSet<Limitrofe>();
		ArrayList<Limitrofe> c1 = (ArrayList<Limitrofe>) this.limita.clone();

		for (int i = 0; i < c1.size(); i++) {
			for (int j = 0; j < this.limita.size(); j++) {
				if (c1.get(i).getP2().equals(this.limita.get(j).getP1())) {
					Limitrofe l1 = new Limitrofe(c1.get(i).getP1(), this.limita.get(j).getP2());
					Limitrofe l2 = new Limitrofe(this.limita.get(j).getP2(), c1.get(i).getP1());
					if (this.limita.contains(l1) == false && this.limita.contains(l2) == false
							&& c1.get(i).getP1().equals(this.limita.get(j).getP2()) == false)
						trans.add(new Limitrofe(c1.get(i).getP1(), this.limita.get(j).getP2()));
				}

			}
		}
		TreeSet<Limitrofe> tranFinal=new TreeSet<Limitrofe>();
		
		if(trans.size()==0) {
			System.out.println("No hay paises translimitrofes");
		}
		for(Limitrofe l: trans) {
			Limitrofe l1=new Limitrofe(l.getP2(),l.getP1());
			
			if(tranFinal.contains(l)==false && tranFinal.contains(l1)==false)
				tranFinal.add(l);
		}
		
		for(Limitrofe l:tranFinal)
			System.out.println(l.getP1()+ " "+l.getP2());
}
}
