package unlam.progava.oia;

public class Arista {
	private int origen;
	private int destino;
	private char tipo;
	
	public Arista(int origen, int destino, char tipo)
	{
		this.origen=origen;
		this.destino=destino;
		this.tipo=tipo;
	}
	
	public char getTipo()
	{
		return this.tipo;
	}
	
	public int getOrigen()
	{
		return this.origen;
	}
	
	public int getDestino()
	{
		return this.destino;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Arista param = (Arista)o;
		return (this.origen == param.origen && this.destino == param.destino)/* ||
				(this.origen == param.destino && this.destino == param.origen)*/;
	}
	
	@Override
	public String toString()
	{
		return this.tipo + ": " + this.origen + " " + this.destino;
	}
	
}
