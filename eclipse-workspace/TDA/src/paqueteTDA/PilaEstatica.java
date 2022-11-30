package paqueteTDA;

import paquetePersona.Persona;

public class PilaEstatica {
	private int tope;
	private int ce;
	private int TAM;
	private Persona[]dato;
	
	public PilaEstatica() {
		this.tope=-1;
		this.ce=0;
		this.TAM=5;
		this.dato=new Persona[this.TAM];
	}
	public boolean IsEmpty() {
		return this.tope==-1?true:false;
	}
	
	public void empty() {
		this.tope=-1;
	}
	
	public Persona peek() {
		return this.dato[this.tope];
	}
	
	public int push(Persona p) {
		if(this.ce==TAM)
			return -1;
		this.tope++;
		this.dato[this.tope]=p;
		this.ce++;
		return 1;
	}
	
	public Persona pop() {
		if(this.ce==0)
			return null;
		Persona p=this.dato[this.tope];
		this.ce--;
		this.tope--;
		return p;
	}
	
}
