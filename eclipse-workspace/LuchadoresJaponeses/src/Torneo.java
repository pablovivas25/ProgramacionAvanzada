import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Torneo{
	private int cantidad_participantes;
	private List<Luchador> participantes;
	//private int [] salida;
	
	public Torneo(int cant_parti) {
		this.cantidad_participantes=cant_parti;
		this.participantes=new ArrayList<Luchador>();
	}
	
	public void agregarParticipante(Luchador l) {
		this.participantes.add(l);
	}
	
	public int[] resolver() {
		int dominio=0;
		int [] domina= new int[this.cantidad_participantes];
		
		for(int i=0;i<this.cantidad_participantes;i++) {
			for(int j=0;j<this.cantidad_participantes;j++) {
				if( i!=j && this.participantes.get(i).getPeso()>=this.getParticipantes().get(j).getPeso() && this.getParticipantes().get(i).getAltura()>=this.getParticipantes().get(j).getAltura()) {
					dominio++;
					
				}
			}
		//void resolver	this.salida[i]=dominio;
			domina[i]=dominio;
		
			dominio=0;
		}
		return domina;
	}




	public int getCantidad_participantes() {
		return cantidad_participantes;
	}

	public List<Luchador> getParticipantes() {
		return participantes;
	}

	public void setCantidad_participantes(int cantidad_participantes) {
		this.cantidad_participantes = cantidad_participantes;
	}

	
}
