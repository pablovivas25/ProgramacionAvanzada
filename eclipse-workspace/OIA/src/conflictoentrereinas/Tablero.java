package conflictoentrereinas;

import java.util.List;

public class Tablero {
	private int fil;
	private int col;
	private int cantidadReinas;
	private List<Reina> reinas;
	
	
	public Tablero(int fil, int col,int cantRei, List<Reina> reinas) {
		super();
		this.fil = fil;
		this.col = col;
		this.cantidadReinas=cantRei;
		this.reinas = reinas;
	}
	
	
	
}
