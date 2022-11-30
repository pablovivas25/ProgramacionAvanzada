import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	private int cantidadAplicaciones;
	private int memoriaAplicacionInstalar;
	private Celular memoriaApicaciones;

	public Aplicacion(int cantidadAplicaciones, int memoriaAplicacionInstalar, Celular memoriaApicaciones) {
		super();
		this.cantidadAplicaciones = cantidadAplicaciones;
		this.memoriaAplicacionInstalar = memoriaAplicacionInstalar;
		this.memoriaApicaciones = memoriaApicaciones;
	}
	
	//METODO QUE GUARDA UNA SUBLISTA DADO UN INICIO Y UN FIN
	public List<Integer> achicarLista(List<Integer> listaCompleta,int ini,int fin){
		List<Integer> subList= new ArrayList<>();
		
		for(Integer pos: listaCompleta) {
			if(pos== ini) {
				int sig=pos;
				while(sig<=fin) {
					subList.add(pos);
					sig ++;
				}
			}
		}
		return subList; 
	}
	
	// REVISAR
	public int cantidadMinima() {
		int suma = 0;
		int min = 2;
		int cont = 0;
		List<Integer> subLista = new ArrayList<>();
		
		//DEFINO QUE VOY A AVANZAR DE A N ELEMENTOS
		//SACO LOS N ELEMENTOS Y LOS METO EN UNA SUB LISTA
		//RECORRO LA SUBLISTA Y SUMO LOS MB Y EL CONTADOR DE APS
		//DEVUELVO EL CONTADOR DE APS
		for (int i = 0, j = i + 1; i < memoriaApicaciones.getMemoriaconsecutiva().size()
				&& j < memoriaApicaciones.getMemoriaconsecutiva().size(); i++, j++) {
			for(int contiene=i;contiene<=j;contiene++) {
				subLista.add(contiene);
			}
			
			suma = i + j;
			cont++;
			if(suma>=memoriaAplicacionInstalar) {
				return cont; 
			}
		}
		return cont;
	}

	public int resolver() {

		if (this.memoriaApicaciones.getMemoriaconsecutiva().contains(this.memoriaAplicacionInstalar))
			return 1;
		if (this.memoriaApicaciones.hayMemoriaSuficiente(this.memoriaAplicacionInstalar) == false)
			return -1;

		return cantidadMinima();
	}

	public int getCantidadAplicaciones() {
		return cantidadAplicaciones;
	}

	public int getMemoriaAplicacionInstalar() {
		return memoriaAplicacionInstalar;
	}

	public Celular getMemoriaApicaciones() {
		return memoriaApicaciones;
	}

}
