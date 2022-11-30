 package paqueteTDA;

import paquetePersona.Persona;

public class ColaEstatica {
	private int frente;
	private int fondo;
	private int ce;
	private int TAM;
	private Persona[]dato;
	
	public ColaEstatica() {
		this.frente=0;
		this.fondo=-1;
		this.ce=0;
		this.TAM=5;
		this.dato=new Persona[this.TAM];
		
	}
	
	public boolean  IsEmpty() {
		return this.fondo==-1?true:false;
	}
	public void empty() {
		this.frente=0;
		this.fondo=-1;
		this.ce=0;
	}
	
	public Persona peek() {
		return this.ce==0?null:this.dato[this.frente];
	}
	public int offer(Persona p) {
		if(this.ce==this.TAM)
			return 0;
		this.fondo=(this.fondo+1)%this.TAM;
		this.dato[this.fondo]=p;
		this.ce++;
		return 1;
	}
	
	public int add(Persona p) {
		if(this.fondo==-1)
			return -1;
		this.fondo++;
		this.dato[this.fondo]=p;
		this.ce++;
		return 1;
	}
	public Persona poll() {
		if(this.ce==0)
			return null;
		Persona p=this.dato[this.frente];
		this.ce--;
		
		if(this.ce==0) {
			this.frente=0;
			this.fondo=-1;
		}else
			this.frente=(this.frente+1)%this.TAM;
		return p;
	}
	
	
}
