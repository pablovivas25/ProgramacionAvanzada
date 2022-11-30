import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		Map<Pais,Integer> mapa =new HashMap<Pais,Integer>();
		Pais p1=new Pais("Argentina");
		Pais p2=new Pais("Brasil");
		Pais p3=new Pais("Argentina");
		
		mapa.put(p1, 1);
		mapa.put(p2, 1);
		
		if(mapa.put(p3,1)!=null)
			mapa.put(p3, mapa.get(p3)+1);
		
		
		for(Pais p: mapa.keySet()) {
			System.out.println(p.getNombre()+" "+mapa.get(p));
		}
		
		
		
		
	}

}
