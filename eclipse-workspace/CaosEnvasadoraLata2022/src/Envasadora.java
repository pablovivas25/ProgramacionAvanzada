import java.util.Collections;
import java.util.List;

public class Envasadora {
	private List<Secuencia> listaSec;
	private int cadena_longitud;

	public Envasadora(List<Secuencia> listaSec, int cadena_longitud) {
		super();
		this.listaSec = listaSec;
		this.cadena_longitud=cadena_longitud;
	}

	public List<Secuencia> getListaSec() {
		return listaSec;
	}

	public void setListaSec(List<Secuencia> listaSec) {
		this.listaSec = listaSec;
	}
	
	public void resolver() {
		if(this.listaSec.size()>1)
			Collections.sort(this.listaSec);
		
	
		System.out.println(this.cadena_longitud);
		
		if(this.listaSec.size()>1) {
			System.out.println(this.listaSec.get(0).getSec().length());
			
			System.out.println(this.listaSec.get(1).getSec().length());
			if(listaSec.get(0).getPosicion_inicial()>listaSec.get(1).getPosicion_final()) {
				System.out.println(Math.abs(listaSec.get(1).getPosicion_final()+1-this.listaSec.get(0).getPosicion_inicial()));
			}else {
				System.out.println(Math.abs(listaSec.get(0).getPosicion_final()+1-this.listaSec.get(1).getPosicion_inicial()));
			}
			
		}else {
			if(this.listaSec.size()==1){
			System.out.println("No existe otra cadena de garbanzos");
			System.out.println("No se puede calcular la distancia");
			}else
				System.out.println("No existe ninguna cadena de garbanzos");
		}
		
		
		for(Secuencia s:this.listaSec)
			System.out.println(s.getSec().toString() + " "+s.getPosicion_inicial()+ " "+s.getPosicion_final());
	}

	public int getCadena_longitud() {
		return cadena_longitud;
	}
	
	
	
	
}
