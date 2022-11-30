package clases;


public class Ubicacion {
	private int posX;
	private int posY;
	
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	
	public Ubicacion(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}
	
	
	 public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}

		@Override
		public String toString() {
			return "Ubicacion [posX=" + posX + ", posY=" + posY + "]";
		}

	
	
	
}
