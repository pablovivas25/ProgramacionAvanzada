public class Erseanian extends Raza{

	public Erseanian(int x) {
		this.saludActual=63;
		this.danioBasico=99;
		this.rangoMinimo=1;
		this.rangoMaximo=5;
		this.arma="Maza";
		this.posicion=x;
		
	}
	

	@Override
	public void atacar(Raza raza) {
		if(Math.abs(this.posicion-raza.posicion)<Math.abs(this.rangoMaximo-this.rangoMinimo)) {
			raza.saludActual-=this.danioBasico;
			this.saludActual*=1.02;
		}
		
	}
	
	@Override
	public void recibirAtaque(int danio) {

		
	}

	@Override
	public void descansar() {

	

	}



}
