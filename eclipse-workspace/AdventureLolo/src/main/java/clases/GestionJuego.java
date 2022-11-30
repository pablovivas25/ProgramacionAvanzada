package clases;

public class GestionJuego {
	public static void main(String[] args) {
		Mapa tablero=new Mapa("src/test/resources/mapa/nivel1.in");
		Lolo lolo= new Lolo(new Ubicacion(1,1),true,false);
		
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);
		lolo.moverDerecha(tablero);  
		lolo.moverDerecha(tablero);
		lolo.moverAbajo(tablero);  
		lolo.moverAbajo(tablero);
	} 
}
