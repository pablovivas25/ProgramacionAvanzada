
public class Lanzamiento {
	private double distancia;
	private double angulo;
	
	public double getDistancia() {
		return distancia;
	}
	public double getAngulo() {
		return angulo;
	}
	public Lanzamiento(double distancia, double angulo) {
		super();
		this.distancia = distancia;
		this.angulo = angulo;
	}
	
	public boolean lanzamientoValido() {
		
		return this.angulo>=-90 && this.angulo<=90;
	}
	
	public double puntaje() {
		if(this.lanzamientoValido()) {
			if(this.angulo>=-30 && this.angulo<=30)
					return this.distancia;
			else
				return this.distancia*0.8;
			
		}else
			return 0;
	}
	

}
